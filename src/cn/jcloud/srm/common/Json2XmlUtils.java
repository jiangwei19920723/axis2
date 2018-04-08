package cn.jcloud.srm.common;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.logging.log4j.core.config.plugins.util.ResolverUtil.Test;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.jcloud.srm.beans.srm.NoticeExaminationTotal;
import cn.jcloud.srm.beans.srm.PoFixedConfigNotice;
import cn.jcloud.srm.beans.srm.PoFixedNoticeTotal;
import cn.jcloud.srm.beans.srm.PoFixedPriceNotice;
import cn.jcloud.srm.beans.srm.PoFixedReport;
import cn.jcloud.srm.beans.srm.QualifiedNoticeInfo;
import cn.jcloud.srm.beans.srm.VendorDoInNoticeInfo;
import cn.jcloud.srm.srmenum.SRMFlowType;

/**
 * @author 蒋维
 * @date 创建时间：2017年10月16日 上午10:34:21
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class Json2XmlUtils {
	public static String toXml(String json, SRMFlowType flowType, Map<String, long[]> map) throws Exception {
		if (flowType == SRMFlowType.VENDOR_DOIN_NOTICE) {
			String result = toVENDOR_DOIN_NOTICEXml(json, flowType, map).replaceAll("&gt;", ">").replaceAll("&lt;",
					"<");
			return result;
		} else if (flowType == SRMFlowType.PO_INVITATION_REPORT_AUTH) {
			String result = toPO_INVITATION_REPORT_AUTHXml(json, flowType, map).replaceAll("&gt;", ">")
					.replaceAll("&lt;", "<");
			return result;
		}
		JSONObject jsonObject = JSON.parseObject(json);
		Object obj = JSONObject.toJavaObject(jsonObject, Class.forName(flowType.getClassName()));
		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(Json2XmlUtils.class.getResourceAsStream(flowType.getXmlAddress()));
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Element values = root.element("values");
		List<Element> columns = values.elements("column");
		if (columns != null && columns.size() > 0) {
			for (Element element : columns) {
				Element value = element.element("value");
				// 基本信息
				if (value.getStringValue() == null || "".equals(value.getStringValue())) {
					continue;
				}
				String fieldName = value.getStringValue();
				Object object = fieldValue(obj, fieldName, 0);
				if (object == null) {
					value.setText("");
				} else if (!"false".equals(object.toString())) {
					value.setText(StringEscapeUtils.escapeXml(object.toString()));
				}
				if (map != null) {
					for (String key : map.keySet()) {
						if (fieldName.equals(key)) {
							if (map.get(key)[0] == 0) {
								value.setText("");
							} else {
								value.setText("" + map.get(key)[0]);
							}
							break;
						}
					}
				}
			}
		}
		Element subForms = root.element("subForms");
		List<Element> subFormList = subForms.elements("subForm");
		if (subFormList != null && subFormList.size() != 0) {
			// 循环subForm节点
			for (int i = 0; i < subFormList.size(); i++) {
				toRowXml(i, subFormList.get(i), obj, reader, flowType, map);
			}
		}
		return document.asXML().replaceAll("&gt;", ">").replaceAll("&lt;", "<");
	}

	/**
	 * 获取文件fileId
	 * 
	 * @param json
	 * @param flowType
	 * @return
	 * @throws Exception
	 */
	public static Map<String, long[]> getfileIds(String json, SRMFlowType flowType) throws Exception {
		Map<String, long[]> map = new HashMap<>();
		List<String> fileNames = new ArrayList<>();
		JSONObject jsonObject = JSON.parseObject(json);
		Object obj = JSONObject.toJavaObject(jsonObject, Class.forName(flowType.getClassName()));
		Field[] fields = obj.getClass().getDeclaredFields();
		for (Field field : fields) {
			// 如果是List类型，得到其Generic的类型
			Type genericType = field.getGenericType();
			if (genericType == null)
				continue;
			// 如果是泛型参数的类型
			if (genericType instanceof ParameterizedType) {
				ParameterizedType pt = (ParameterizedType) genericType;
				// 得到泛型里的class类型对象
				Class<?> genericClazz = (Class<?>) pt.getActualTypeArguments()[0];
				Field[] fields2 = genericClazz.getDeclaredFields();
				for (Field field2 : fields2) {
					if (field2.getName() != null && field2.getName().endsWith("File")) {
						fileNames.add(field2.getName());
					} else if (field2.getName() != null && field2.getName().endsWith("file")) {
						fileNames.add(field2.getName());
					}
				}
			}
			if (field.getName() != null && field.getName().endsWith("File")) {
				fileNames.add(field.getName());
			}else if (field.getName() != null && field.getName().endsWith("file")) {
				fileNames.add(field.getName());
			}
		}
		if (fileNames.size() > 0) {
			for (String fileName : fileNames) {
				int size = getSize(obj, fileName);
				long[] ids = new long[size == 0 ? 1 : size];
				if (size == 0) {
					Object object = fieldValue(obj, fileName, 0);
					if (object == null ||"false".equals(object.toString())) {
						ids[0]=0;
					}else{
						ids[0] =(long)object;
					}
					map.put(fileName, ids);
				} else {
					for (int i = 0; i < size; i++) {
						Object object = fieldValue(obj, fileName, i);
						if (object == null ||"false".equals(object.toString())) {
							ids[i]=0;
						}else{
							ids[i] =(long)object;
						}
					}
					map.put(fileName, ids);
				}
			}
			return map;
		}
		return null;
	}

	private static int getSize(Object obj, String fieldName) throws Exception {
		Field[] fields = obj.getClass().getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			if (field.getType() == java.util.List.class) {
				// 如果是List类型，得到其Generic的类型
				Type genericType = field.getGenericType();
				if (genericType == null)
					continue;
				// 如果是泛型参数的类型
				if (genericType instanceof ParameterizedType) {
					ParameterizedType pt = (ParameterizedType) genericType;
					// 得到泛型里的class类型对象
					Class<?> genericClazz = (Class<?>) pt.getActualTypeArguments()[0];
					Field[] fields2 = genericClazz.getDeclaredFields();
					for (Field field2 : fields2) {
						field2.setAccessible(true);
						if (fieldName.equals(field2.getName())) {
							fieldName = field.getName();
							fieldName = fieldName.toUpperCase().substring(0, 1) + fieldName.substring(1);
							String name = "get" + fieldName;
							Method method = obj.getClass().getMethod(name);
							List list = (List) method.invoke(obj);
							return list.size();
						}
					}
				}
			}
		}
		return 0;
	}

	/**
	 * 获取对应fieldName的值
	 * 
	 * @param obj
	 * @param fieldName
	 * @param i
	 * @return
	 * @throws Exception
	 */
	private static Object fieldValue(Object obj, String fieldName, int i) throws Exception {
		Field[] fields = obj.getClass().getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			if (field.getType() == java.util.List.class) {
				// 如果是List类型，得到其Generic的类型
				Type genericType = field.getGenericType();
				if (genericType == null)
					continue;
				// 如果是泛型参数的类型
				if (genericType instanceof ParameterizedType) {
					ParameterizedType pt = (ParameterizedType) genericType;
					// 得到泛型里的class类型对象
					Class<?> genericClazz = (Class<?>) pt.getActualTypeArguments()[0];
					Field[] fields2 = genericClazz.getDeclaredFields();
					for (Field field2 : fields2) {
						field2.setAccessible(true);
						if (fieldName.equals(field2.getName())) {
							return field2.get(invoke(obj, field, i));
						}
					}
				}
			}
			if (fieldName.equals(field.getName())) {
				return field.get(obj);
			}
		}
		return false;
	}

	/**
	 * 执行对应方法
	 * 
	 * @param obj
	 * @param field
	 * @param i
	 * @return
	 * @throws Exception
	 */
	private static Object invoke(Object obj, Field field, int i) throws Exception {
		String fieldName = field.getName();
		fieldName = fieldName.toUpperCase().substring(0, 1) + fieldName.substring(1);
		String name = "get" + fieldName;
		Method method = obj.getClass().getMethod(name);
		List list = (List) method.invoke(obj);
		return list.get(i);
	}

	/**
	 * 解析row中的xml
	 * 
	 * @param subForm
	 * @param obj
	 * @param reader
	 * @param flowType
	 * @throws Exception
	 */
	private static void toRowXml(int a, Element subForm, Object obj, SAXReader reader, SRMFlowType flowType,
			Map<String, long[]> map) throws Exception {
		Element values2 = subForm.element("values");
		Element row = values2.element("row");
		List<Element> columns2 = row.elements("column");
		int i = 0;
		for (Element element : columns2) {
			Element value = element.element("value");
			// row信息
			if (value.getStringValue() == null || "".equals(value.getStringValue())) {
				continue;
			}
			String fieldName = value.getStringValue();
			Object object = fieldValue(obj, fieldName, 0);
			if (object == null) {
				value.setText("");
			} else if (!"false".equals(object.toString())) {
				value.setText(StringEscapeUtils.escapeXml(object.toString()));
			}
			if (map != null) {
				for (String key : map.keySet()) {
					if (fieldName.equals(key)) {
						if (map.get(key)[0] == 0) {
							value.setText("");
						} else {
							value.setText("" + map.get(key)[0]);
						}
						break;
					}
				}
			}
			if (i == 0) {
				i = getSize(obj, fieldName);
			}
		}
		if (i > 1) {
			for (int j = 1; j < i; j++) {
				// 读取文件 转换成Document
				Document document1 = reader.read(Test.class.getResourceAsStream(flowType.getXmlAddress()));
				// 获取根节点元素对象
				Element root1 = document1.getRootElement();
				Element subForms1 = root1.element("subForms");
				List<Element> subFormList = subForms1.elements("subForm");
				Element values3 = subFormList.get(a).element("values");
				Element row1 = values3.element("row");
				List<Element> columns3 = row1.elements("column");
				for (Element element : columns3) {
					Element value = element.element("value");
					// row信息
					if (value.getStringValue() == null || "".equals(value.getStringValue())) {
						continue;
					}
					String fieldName = value.getStringValue();
					Object object = fieldValue(obj, fieldName, j);
					if (object == null) {
						value.setText("");
					} else if (!"false".equals(object.toString())) {
						value.setText(StringEscapeUtils.escapeXml(object.toString()));
					}
					if (map != null) {
						for (String key : map.keySet()) {
							if (fieldName.equals(key)) {
								if (map.get(key)[j] == 0) {
									value.setText("");
								} else {
									value.setText("" + map.get(key)[j]);
								}
								break;
							}
						}
					}
				}
				String xmlSub = row1.asXML();
				xmlSub = xmlSub.substring(5);
				xmlSub = xmlSub.substring(0, xmlSub.length() - 6);
				Element element = values2.addElement("row");
				element.setText(xmlSub);
			}
		}
	}

	/**
	 * 解析VENDOR_DOIN_NOTICE的xml
	 * 
	 * @param json
	 * @param flowType
	 * @param map
	 * @return
	 * @throws Exception
	 */
	private static String toVENDOR_DOIN_NOTICEXml(String json, SRMFlowType flowType, Map<String, long[]> map)
			throws Exception {
		JSONObject jsonObject = JSON.parseObject(json);
		Object obj = JSONObject.toJavaObject(jsonObject, Class.forName(flowType.getClassName()));
		NoticeExaminationTotal total = (NoticeExaminationTotal) obj;
		VendorDoInNoticeInfo doInNoticeInfo = total.getVendorDoinNotice();
		QualifiedNoticeInfo qualifiedNoticeInfo = total.getQualifiedNotice();
		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(Json2XmlUtils.class.getResourceAsStream(flowType.getXmlAddress()));
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Element values = root.element("values");
		List<Element> columns = values.elements("column");
		for (Element element : columns) {
			Element value = element.element("value");
			// 基本信息
			if (value.getStringValue() == null || "".equals(value.getStringValue())) {
				continue;
			}
			String fieldName = value.getStringValue();
			Object object = fieldValue(doInNoticeInfo, fieldName, 0);
			Object object2 = fieldValue(qualifiedNoticeInfo, fieldName, 0);
			if (object == null && object2 == null) {
				value.setText("");

			} else if (object != null && !"false".equals(object.toString())) {
				value.setText(StringEscapeUtils.escapeXml(object.toString()));
			} else if (object2 != null && !"false".equals(object2.toString())) {
				value.setText(StringEscapeUtils.escapeXml(object2.toString()));
			} else {
				if (fieldName.contains("1")) {
					object2 = fieldValue(qualifiedNoticeInfo, fieldName.substring(0, fieldName.length() - 1), 0);
					value.setText(StringEscapeUtils.escapeXml(object2.toString()));
				}
			}
			if (map != null) {
				for (String key : map.keySet()) {
					if (fieldName.equals(key)) {
						if (map.get(key)[0] == 0) {
							value.setText("");
						} else {
							value.setText("" + map.get(key)[0]);
						}
						break;
					}
				}
			}
		}
		Element subForms = root.element("subForms");
		List<Element> subFormList = subForms.elements("subForm");
		toRowXml(0, subFormList.get(0), doInNoticeInfo, reader, flowType, map);
		toRowXml(1, subFormList.get(1), qualifiedNoticeInfo, reader, flowType, map);
		return document.asXML();
	}

	/**
	 * 解析PO_INVITATION_REPORT_AUTH的xml
	 * 
	 * @param json
	 * @param flowType
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public static String toPO_INVITATION_REPORT_AUTHXml(String json, SRMFlowType flowType, Map<String, long[]> map)
			throws Exception {
		JSONObject jsonObject = JSON.parseObject(json);
		Object obj = JSONObject.toJavaObject(jsonObject, Class.forName(flowType.getClassName()));
		PoFixedNoticeTotal poFixedNoticeTotal = (PoFixedNoticeTotal) obj;
		PoFixedReport report = poFixedNoticeTotal.getReport();
		PoFixedPriceNotice fixedPriceNotice = poFixedNoticeTotal.getPriceNotice();
		PoFixedConfigNotice fixedConfigNotice = poFixedNoticeTotal.getConfigNotice();
		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(Json2XmlUtils.class.getResourceAsStream(flowType.getXmlAddress()));
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Element values = root.element("values");
		List<Element> columns = values.elements("column");
		for (Element element : columns) {
			Element value = element.element("value");
			// 基本信息
			if (value.getStringValue() == null || "".equals(value.getStringValue())) {
				continue;
			}
			String fieldName = value.getStringValue();
			Object object = fieldValue(report, fieldName, 0);
			Object object2 = fieldValue(fixedPriceNotice, fieldName, 0);
			Object object3 = fieldValue(fixedConfigNotice, fieldName, 0);
			if (object != null && !"false".equals(object.toString())) {
				value.setText(StringEscapeUtils.escapeXml(object.toString()));
			} else if (object2 != null && !"false".equals(object2.toString())) {
				value.setText(StringEscapeUtils.escapeXml(object2.toString()));
			} else if (object3 != null && !"false".equals(object3.toString())) {
				value.setText(StringEscapeUtils.escapeXml(object3.toString()));
			} else {
				value.setText("");
				if (fieldName.contains("1")) {
					object2 = fieldValue(fixedConfigNotice, fieldName.substring(0, fieldName.length() - 1), 0);
					value.setText(StringEscapeUtils.escapeXml(object2.toString()));
				}
				if (fieldName.contains("2")) {
					object2 = fieldValue(fixedPriceNotice, fieldName.substring(0, fieldName.length() - 1), 0);
					value.setText(StringEscapeUtils.escapeXml(object2.toString()));
				}
			}
			if (map != null) {
				for (String key : map.keySet()) {
					if (fieldName.equals(key)) {
						if (map.get(key)[0] == 0) {
							value.setText("");
						} else {
							value.setText("" + map.get(key)[0]);
						}
						break;
					}
				}
			}
		}
		Element subForms = root.element("subForms");
		List<Element> subFormList = subForms.elements("subForm");
		toRowXml(0, subFormList.get(0), report, reader, flowType, map);
		toRowXml(1, subFormList.get(1), fixedPriceNotice, reader, flowType, map);
		toRowXml(2, subFormList.get(2), fixedConfigNotice, reader, flowType, map);
		return document.asXML();

	}
	

}
