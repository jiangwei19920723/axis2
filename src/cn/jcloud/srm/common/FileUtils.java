package cn.jcloud.srm.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.jcloud.srm.beans.srm.BussinessAssessInfo;
import cn.jcloud.srm.beans.srm.LogisticsAssessInfo;
import cn.jcloud.srm.beans.srm.PoFixedInvitation;
import cn.jcloud.srm.beans.srm.PoFixedInvitationTechnologyDetails;
import cn.jcloud.srm.beans.srm.PoFixedRequstVendors;
import cn.jcloud.srm.beans.srm.QualityAssessInfo;
import cn.jcloud.srm.beans.srm.TechnologyAssessInfo;
import cn.jcloud.srm.client.sap.vendor.VENDOR_RES_type0;
import cn.jcloud.srm.srmenum.SRMFlowType;

/**
 * @author 蒋维
 * @date 创建时间：2017年9月14日 下午3:50:40
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class FileUtils {

	/**
	 * 创建文件
	 * 
	 * @param filePath
	 *            文件名称
	 * @param filecontent
	 *            文件内容
	 * @return 是否创建成功，成功则返回true
	 */
	public static boolean createFile(String filePath, String filecontent) {
		Boolean bool = false;
		File file = new File(filePath);
		try {
			// 如果文件不存在，则创建新的文件
			if (!file.exists()) {
				File dir = file.getParentFile();
				if (!dir.exists()) {
					dir.mkdirs();
				}
				file.createNewFile();
				bool = true;
				// 创建文件成功后，写入内容到文件里
				writeFileContent(filePath, filecontent);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return bool;
	}

	/**
	 * 向文件中写入内容
	 * 
	 * @param filepath
	 *            文件路径与名称
	 * @param newstr
	 *            写入的内容
	 * @return
	 * @throws Exception 
	 */
	public static boolean writeFileContent(String filepath, String newstr) throws Exception {
		Boolean bool = false;
		String filein = newstr + "\r\n";// 新写入的行，换行
		String temp = "";

		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		FileOutputStream fos = null;
		PrintWriter pw = null;
		try {
			File file = new File(filepath);// 文件路径(包括文件名称)
			// 将文件读入输入流
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			StringBuffer buffer = new StringBuffer();

			// 文件原有内容
			for (int i = 0; (temp = br.readLine()) != null; i++) {
				buffer.append(temp);
				// 行与行之间的分隔符 相当于“\n”
				buffer = buffer.append(System.getProperty("line.separator"));
			}
			buffer.append(filein);

			fos = new FileOutputStream(file);
			pw = new PrintWriter(fos);
			pw.write(buffer.toString().toCharArray());
			pw.flush();
			bool = true;
		} catch (Exception e) {
			throw new Exception("文件写入失败！");
		} finally {
			// 不要忘记关闭
			if (pw != null) {
				pw.close();
			}
			if (fos != null) {
				fos.close();
			}
			if (br != null) {
				br.close();
			}
			if (isr != null) {
				isr.close();
			}
			if (fis != null) {
				fis.close();
			}
		}
		return bool;
	}

	/**
	 * 创建路径
	 * 
	 * @param interfaceName接口名字
	 * @return
	 */
	public static String createPath(String interfaceName) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Properties properties = new Properties();
		try {
			properties.load(FileUtils.class.getResourceAsStream("/user.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String path = properties.getProperty("path");
		String filepath = path + "/" + interfaceName + "/" + sdf.format(date) + "/"
				+ UUID.randomUUID().toString().replaceAll("-", "") + ".txt";
		return filepath;
	}

	public static VENDOR_RES_type0[] repSapCity(VENDOR_RES_type0[] types) throws IOException {
		Properties properties = new Properties();
		properties.load(FileUtils.class.getResourceAsStream("/city.properties"));
		for (VENDOR_RES_type0 type : types) {
			if (!type.getREGIO().equals("")) {
				type.setREGIO(properties.getProperty(type.getREGIO()));
			}
		}
		return types;
	}

	public static File handleExcel(String json, SRMFlowType flowType)
			throws Exception {

		FileOutputStream os;
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		JSONObject jsonObject = JSON.parseObject(json);
		Object obj = JSONObject.toJavaObject(jsonObject, Class.forName(flowType.getClassName()));
		PoFixedInvitation invitation = (PoFixedInvitation) obj;
		URI uri = FileUtils.class.getClassLoader().getResource("/fixed_tec.xls").toURI();
		File oldFileName = new File(uri);
		/*
		 * String
		 * filePath=FileUtils.class.getResource("/fixed_tec.xls").getPath();
		 */
		Map<String, List<PoFixedInvitationTechnologyDetails>> detailsMap = invitation.getVendorDetailMap();
		List<PoFixedRequstVendors> vendors = invitation.getVendors();
		String newfilePath = InterfaceStringUtils.SRMFILEPATH + File.separator + "temp" + File.separator + "technology";
		File newFileDir = new File(newfilePath);
		if (!newFileDir.exists()) {
			newFileDir.mkdirs();
		}
		newfilePath = newfilePath + File.separator + sdf.format(today) + UUID.randomUUID() + ".xls";
		File newFileName = new File(newfilePath);
		if (!newFileName.exists()) {
			try {
				newFileName.createNewFile();
			} catch (Exception e) {
				throw new Exception("文件xls处理失败！");
			}
		}
		try {
			FileUtil.copyFile(oldFileName, newFileName);
		} catch (Exception e) {
			throw new Exception("文件xls处理失败！");
		}
		try {
			HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(newfilePath));
			HSSFSheet sheet = workbook.getSheetAt(0);
			HSSFRow titleRow = sheet.getRow(1);
			HSSFCell remarkCell = titleRow.getCell(4 + vendors.size());
			remarkCell.setCellValue("备注");
			HSSFCell recordCell = titleRow.getCell(5 + vendors.size());
			recordCell.setCellValue("评审记录(必填) 包括:1)问题,2)导致原因,3)解决办法,4)评估,5)责任,6)定时");
			String[] remark = new String[100];
			String[] record = new String[100];
			Integer lineLength = 0;
			for (int i = 0; i < vendors.size(); i++) {
				List<PoFixedInvitationTechnologyDetails> detailsList = detailsMap.get(vendors.get(i).getVendor_name());
				lineLength = detailsList.size();
				HSSFRow vendorRow = sheet.getRow(1);
				HSSFCell vendorName = vendorRow.getCell(4 + i);
				vendorName.setCellValue(vendors.get(i).getVendor_name());
				for (int j = 0; j < detailsList.size(); j++) {

					HSSFRow scoreRow = sheet.getRow(j + 2 + 2 * j);
					HSSFCell scoreCell = scoreRow.getCell(4 + i);
					scoreCell.setCellValue(detailsList.get(j).getScore());
					remark[j * (i + 1)] = detailsList.get(j).getRemark();
					record[j * (i + 1)] = detailsList.get(j).getRecord();
				}

			}
			
			for (int i = 0; i < lineLength; i++) {
				String totalRemark="";
				String totalRecord="";
				HSSFRow remarkRow = sheet.getRow(i + 2 + 2 * i);
				HSSFCell remarkCells = remarkRow.getCell(4 + vendors.size());
				HSSFCell recordCells = remarkRow.getCell(5 + vendors.size());
				for (int j = 0; j < vendors.size(); j++) {
					totalRemark+=remark[i*(j+1)];
					totalRecord+=record[i*(j+1)];
				}
				remarkCells.setCellValue(totalRemark);
				recordCells.setCellValue(totalRecord);
			}
			os = new FileOutputStream(newfilePath);
			workbook.write(os);
			os.flush();
			os.close();
		} catch (Exception e) {
			throw new Exception("文件xls处理失败！");
		}
		return newFileName;
	}

	public static String toFilePath(String json, SRMFlowType flowType) throws ClassNotFoundException {
		if (flowType == SRMFlowType.VENDOR_DOIN_BUSINESS_SCORE) {
			JSONObject jsonObject = JSON.parseObject(json);
			Object obj = JSONObject.toJavaObject(jsonObject, Class.forName(flowType.getClassName()));
			BussinessAssessInfo info = (BussinessAssessInfo) obj;
			return info.getFilePath();
		}else if (flowType == SRMFlowType.VENDOR_DOIN_LOGISTICS_SCORE) {
			JSONObject jsonObject = JSON.parseObject(json);
			Object obj = JSONObject.toJavaObject(jsonObject, Class.forName(flowType.getClassName()));
			LogisticsAssessInfo info = (LogisticsAssessInfo) obj;
			return info.getFilePath();
		}else if (flowType == SRMFlowType.VENDOR_DOIN_QUALITY_SCORE) {
			JSONObject jsonObject = JSON.parseObject(json);
			Object obj = JSONObject.toJavaObject(jsonObject, Class.forName(flowType.getClassName()));
			QualityAssessInfo info = (QualityAssessInfo) obj;
			return info.getFilePath();
		}else if (flowType == SRMFlowType.VENDOR_DOIN_TECHNOLOGY_SCORE) {
			JSONObject jsonObject = JSON.parseObject(json);
			Object obj = JSONObject.toJavaObject(jsonObject, Class.forName(flowType.getClassName()));
			TechnologyAssessInfo info = (TechnologyAssessInfo) obj;
			return info.getFilePath();
		}
		return null;
	}

}
