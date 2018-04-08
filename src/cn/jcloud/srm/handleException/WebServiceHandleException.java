package cn.jcloud.srm.handleException;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.beans.mes.WMStoSRM_ASNRequest;
import cn.jcloud.srm.beans.mes.WMStoSRM_MaterialPlanRequest;
import cn.jcloud.srm.beans.mes.WMStoSRM_MaterialPlanRequestItem;
import cn.jcloud.srm.beans.mes.WMStoSRM_ReturnedRequest;
import cn.jcloud.srm.beans.plm.PLM2VendorFileIOLineItem;
import cn.jcloud.srm.beans.plm.PLM2VendorFileIORequest;
import cn.jcloud.srm.beans.sap.IFSAP2SRMPoRequest;
import cn.jcloud.srm.beans.sap.IfSAP2SRMPoLineItem;
import cn.jcloud.srm.beans.sap.IfSRM2SAPAcgrLineItem;
import cn.jcloud.srm.beans.sap.IfSRM2SAPAcgrRequest;
import cn.jcloud.srm.beans.sap.IfSRM2SAPAcinvoiceRequest;
import cn.jcloud.srm.beans.sap.IfSRM2SAPAclabLineItem;
import cn.jcloud.srm.beans.sap.IfSRM2SAPAclabLineItem2;
import cn.jcloud.srm.beans.sap.IfSRM2SAPAclabRequest;
import cn.jcloud.srm.beans.sap.IfSRM2SAPAclabRequest2;
import cn.jcloud.srm.beans.sap.IfSRM2SAPAcsettleLineItem;
import cn.jcloud.srm.beans.sap.IfSRM2SAPAcsettleRequest;
import cn.jcloud.srm.common.msg.MsgResult;
import cn.jcloud.srm.entity.VendorInfo;
import cn.jcloud.srm.entity.mes.MaterialPlanItem;
import cn.jcloud.srm.entity.mes.MaterialPlanRise;
import cn.jcloud.srm.entity.sap.MtlItems;
import cn.jcloud.srm.entity.sap.PoInfoPlanLineItem2;
import cn.jcloud.srm.entity.sap.PoInfoPlanRise2;
import cn.jcloud.srm.entity.sap.PoRise;
import cn.jcloud.srm.entity.srm.DistributionOrder;
import cn.jcloud.srm.entity.srm.DistributionOrderItem;
import cn.jcloud.srm.service.VendorInfoService;
import cn.jcloud.srm.service.mes.MaterialPlanItemService;
import cn.jcloud.srm.service.mes.MaterialPlanRiseService;
import cn.jcloud.srm.service.sap.MtlItemsService;
import cn.jcloud.srm.service.sap.PoInfoPlanLineItem2Service;
import cn.jcloud.srm.service.sap.PoInfoPlanRise2Service;
import cn.jcloud.srm.service.sap.PoRiseService;
import cn.jcloud.srm.service.srm.DistributionOrderItemService;
import cn.jcloud.srm.service.srm.DistributionOrderService;

/**
 * @author 蒋维
 * @date 创建时间：2017年12月4日 上午8:55:02
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Repository
public class WebServiceHandleException {
	@Autowired
	private PoRiseService poRiseService;
	@Autowired
	private VendorInfoService infoService;
	@Autowired
	private MaterialPlanRiseService materialPlanRiseService;
	@Autowired
	private MaterialPlanItemService materialPlanItemService;
	@Autowired
	private PoInfoPlanRise2Service poInfoPlanRise2Service;
	@Autowired
	private PoInfoPlanLineItem2Service poInfoPlanLineItem2Service;
	@Autowired
	private MtlItemsService mtlItemsService;
	@Autowired
	private DistributionOrderService orderService;
	@Autowired
	private VendorInfoService vendorInfoService;
	@Autowired
	private DistributionOrderItemService itemService;

	/**
	 * SAP生产性物料采购结算信息接口处理
	 * 
	 * @param requests
	 * @throws Exception
	 */
	public void ifSRM2SAPAcsettleHandle(List<IfSRM2SAPAcsettleRequest> requests) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		for (IfSRM2SAPAcsettleRequest request : requests) {
			if (request.getZuuid() == null || request.getZuuid().equals("")) {
				throw new Exception("结算编码不能为空！");
			}
			if (request.getBukrs() == null || request.getBukrs().equals("")) {
				throw new Exception("结算编码：" + request.getZuuid() + "公司不能为空！");
			}
			if (request.getFreeUse1() == null || request.getFreeUse1().equals("")) {
				throw new Exception("结算编码：" + request.getZuuid() + "结算类型不能为空！");
			}
			if (request.getWerks() == null || request.getWerks().equals("")) {
				throw new Exception("结算编码：" + request.getZuuid() + "工厂不能为空！");
			}
			VendorInfo info = infoService.getByCode(request.getLifnr());
			if (info == null) {
				throw new Exception("结算编码：" + request.getZuuid() + "供应商编码:" + request.getLifnr() + "不存在！");
			}
			for (IfSRM2SAPAcsettleLineItem requestChild : request.getList()) {
				if (requestChild.getEbeln() == null || requestChild.getEbeln().equals("")) {
					throw new Exception("结算编码：" + request.getZuuid() + ",采购订单不能为空！");
				}
				if (requestChild.getEbelp() == null || requestChild.getEbelp().equals("")) {
					throw new Exception(
							"结算编码：" + request.getZuuid() + ",采购订单:" + requestChild.getEbeln() + ",采购订单行项目不能为空！");
				}
				if (requestChild.getBelnr() == null || requestChild.getBelnr().equals("")) {
					throw new Exception("结算编码：" + request.getZuuid() + ",采购订单:" + requestChild.getEbeln() + ",采购订单行项目："
							+ requestChild.getEbelp() + "收货凭证不能为空！");
				}
				if (requestChild.getBuzei() == null || requestChild.getBuzei().equals("")) {
					throw new Exception("结算编码：" + request.getZuuid() + ",采购订单:" + requestChild.getEbeln() + ",采购订单行项目："
							+ requestChild.getEbelp() + "收货行项目不能为空！");
				}
				if (requestChild.getGjahr() == null || requestChild.getGjahr().equals("")) {
					throw new Exception("结算编码：" + request.getZuuid() + ",采购订单:" + requestChild.getEbeln() + ",采购订单行项目："
							+ requestChild.getEbelp() + "凭证年度不能为空！");
				}
				if (requestChild.getShkzg() == null || requestChild.getShkzg().equals("")) {
					throw new Exception("结算编码：" + request.getZuuid() + ",采购订单:" + requestChild.getEbeln() + ",采购订单行项目："
							+ requestChild.getEbelp() + "借/贷不能为空！");
				}
				if (requestChild.getMeins() == null || requestChild.getMeins().equals("")) {
					throw new Exception("结算编码：" + request.getZuuid() + ",采购订单:" + requestChild.getEbeln() + ",采购订单行项目："
							+ requestChild.getEbelp() + "计量单位不能为空！");
				}
				if (requestChild.getMwskz() == null || requestChild.getMwskz().equals("")) {
					throw new Exception("结算编码：" + request.getZuuid() + ",采购订单:" + requestChild.getEbeln() + ",采购订单行项目："
							+ requestChild.getEbelp() + "税率不能为空！");
				}
				if (requestChild.getFreeUse4() == null || requestChild.getFreeUse4().equals("")) {
					throw new Exception("结算编码：" + request.getZuuid() + ",采购订单:" + requestChild.getEbeln() + ",采购订单行项目："
							+ requestChild.getEbelp() + "采购组不能为空！");
				}
				if (requestChild.getFreeUse3() == null || requestChild.getFreeUse3().equals("")) {
					throw new Exception("结算编码：" + request.getZuuid() + ",采购订单:" + requestChild.getEbeln() + ",采购订单行项目："
							+ requestChild.getEbelp() + "采购组织不能为空！");
				}
				try {
					Float.parseFloat(requestChild.getDmbtrS());
				} catch (Exception e) {
					throw new Exception("结算编码：" + request.getZuuid() + ",采购订单:" + requestChild.getEbeln() + ",采购订单行项目："
							+ requestChild.getEbelp() + "结算金额:" + requestChild.getDmbtrS() + "格式错误！");
				}
				try {
					Float.parseFloat(requestChild.getKbetrS());
				} catch (Exception e) {
					throw new Exception("结算编码：" + request.getZuuid() + ",采购订单:" + requestChild.getEbeln() + ",采购订单行项目："
							+ requestChild.getEbelp() + "结算单价:" + requestChild.getKbetrS() + "格式错误！");
				}
				MtlItems mtlItems = mtlItemsService.getByCode(requestChild.getMatnr());
				if (mtlItems == null) {
					throw new Exception("结算编码：" + request.getZuuid() + ",采购订单:" + requestChild.getEbeln() + ",采购订单行项目："
							+ requestChild.getEbelp() + "物料编码:" + requestChild.getMatnr() + "不存在！");
				}
				try {
					Float.parseFloat(requestChild.getMenge());
				} catch (Exception e) {
					throw new Exception("结算编码：" + request.getZuuid() + ",采购订单:" + requestChild.getEbeln() + ",采购订单行项目："
							+ requestChild.getEbelp() + "数量:" + requestChild.getMenge() + "格式错误！");
				}
				try {
					sdf.parse(requestChild.getBlDat());
				} catch (Exception e) {
					throw new Exception("结算编码：" + request.getZuuid() + ",采购订单:" + requestChild.getEbeln() + ",采购订单行项目："
							+ requestChild.getEbelp() + "凭证日期:" + requestChild.getBlDat() + "格式错误！");
				}
				try {
					sdf.parse(requestChild.getBuDat());
				} catch (Exception e) {
					throw new Exception("结算编码：" + request.getZuuid() + ",采购订单:" + requestChild.getEbeln() + ",采购订单行项目："
							+ requestChild.getEbelp() + "记账日期:" + requestChild.getBuDat() + "格式错误！");
				}
			}
		}
	}

	/**
	 * 生产性物料采购计划发布发送接口2处理
	 * 
	 * @param requests
	 * @throws Exception
	 */
	public void ifSRM2SAPAclabHandle2(List<IfSRM2SAPAclabRequest2> requests, MsgResult result) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		if (requests == null || requests.isEmpty()) {
			throw new Exception("采购订单列表不能为空！");
		}
		if (requests.get(0).getEbeln() == null || requests.get(0).getEbeln().equals("")) {
			throw new Exception("采购协议号不能为空！");
		}
		String code = requests.get(0).getEbeln();
		for (IfSRM2SAPAclabRequest2 request : requests) {
			if (!code.equals(request.getEbeln())) {
				throw new Exception("采购协议号" + code + "," + request.getEbeln() + "不同！");
			}
			if (request.getDocNum() == null || request.getDocNum().equals("")) {
				result.setFreeUse1(request.getEbeln());
				throw new Exception("采购协议号：" + request.getEbeln() + "报文编号不能为空！");
			}
			VendorInfo info = infoService.getByCode(request.getLifnr());
			if (info == null) {
				result.setFreeUse1(request.getEbeln());
				throw new Exception("采购协议号：" + request.getEbeln() + "供应商编号:" + request.getLifnr() + "不存在！");
			}
			try {
				sdf.parse(request.getLabDate());
			} catch (Exception e) {
				result.setFreeUse1(request.getEbeln());
				throw new Exception("采购协议号：" + request.getEbeln() + "创建日期:" + request.getLabDate() + "格式错误！");
			}
			if (request.getLgort() == null || request.getWerks().equals("")) {
				result.setFreeUse1(request.getEbeln());
				throw new Exception("采购协议号：" + request.getEbeln() + "工厂编号不能为空！");
			}
			if (request.getFreeUse1() == null || request.getWerks().equals("")) {
				result.setFreeUse1(request.getEbeln());
				throw new Exception("采购协议号：" + request.getEbeln() + "工厂名称不能为空！");
			}
			if (request.getWerks() == null || request.getWerks().equals("")) {
				result.setFreeUse1(request.getEbeln());
				throw new Exception("采购协议号：" + request.getEbeln() + "收货工厂不能为空！");
			}
			for (IfSRM2SAPAclabLineItem2 item : request.getList()) {
				sdf = new SimpleDateFormat("yyyyMMddhhmmss");
				String dateStr = item.getcDate() + item.getcTime();
				try {
					sdf.parse(dateStr);
				} catch (Exception e) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "发送日期:"
							+ item.getcDate() + ",时间:" + item.getcTime() + "格式不正确！");
				}
				sdf = new SimpleDateFormat("yyyyMMdd");
				try {
					sdf.parse(item.getEindt());
				} catch (Exception e) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "交货日期:"
							+ item.getEindt() + "格式不正确！");
				}
				if (item.getAbruf() == null || item.getAbruf().equals("")) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "审批编号不能为空！");
				}
				if (item.getEbelp() == null || item.getEbelp().equals("")) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + "采购计划协议行项目号不能为空！");
				}
				if (!"P1".equals(item.getLab_typ()) && !"P2".equals(item.getLab_typ())
						&& !"P3".equals(item.getLab_typ()) && !"P4".equals(item.getLab_typ())) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "配送方式:"
							+ item.getLab_typ() + "不存在！");
				}
				if (item.getMeis() == null || item.getMeis().equals("")) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "计量单位不能为空！");
				}
				if (item.getFreeUse1() == null || item.getFreeUse1().equals("")) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "时间格式不能为空！");
				}
				if (item.getFreeUse2() == null || item.getFreeUse2().equals("")) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "保管员不能为空！");
				}
				MtlItems mtlItems = mtlItemsService.getByCode(item.getMatnr());
				if (mtlItems == null) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "物料编码:"
							+ item.getMatnr() + "不存在！");
				}
				try {
					Double.parseDouble(item.getMenge());
				} catch (Exception e) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "交货数量:"
							+ item.getMenge() + "格式不正确！");
				}

			}
		}
	}

	/**
	 * 生产性物料采购计划发布发送接口1处理
	 * 
	 * @param requests
	 * @throws Exception
	 */
	public void ifSRM2SAPAclabHandle1(List<IfSRM2SAPAclabRequest> requests, MsgResult result) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		if (requests == null || requests.isEmpty()) {
			throw new Exception("采购订单列表不能为空！");
		}
		if (requests.get(0).getEbeln() == null || requests.get(0).getEbeln().equals("")) {
			throw new Exception("采购协议号不能为空！");
		}
		String code = requests.get(0).getEbeln();
		for (IfSRM2SAPAclabRequest request : requests) {
			if (!code.equals(request.getEbeln())) {
				throw new Exception("采购协议号" + code + "," + request.getEbeln() + "不同！");
			}
			if (request.getDocNum() == null || request.getDocNum().equals("")) {
				result.setFreeUse1(request.getEbeln());
				throw new Exception("采购协议号：" + request.getEbeln() + "报文编号不能为空！");
			}
			VendorInfo info = infoService.getByCode(request.getLifnr());
			if (info == null) {
				result.setFreeUse1(request.getEbeln());
				throw new Exception("采购协议号：" + request.getEbeln() + "供应商编号:" + request.getLifnr() + "不存在！");
			}
			try {
				sdf.parse(request.getLabDate());
			} catch (Exception e) {
				result.setFreeUse1(request.getEbeln());
				throw new Exception("采购协议号：" + request.getEbeln() + "创建日期:" + request.getLabDate() + "格式错误！");
			}
			for (IfSRM2SAPAclabLineItem item : request.getList()) {
				sdf = new SimpleDateFormat("yyyyMMddhhmmss");
				String dateStr = item.getcDate() + item.getcTime();
				try {
					sdf.parse(dateStr);
				} catch (Exception e) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "发送日期:"
							+ item.getcDate() + "时间:" + item.getcTime() + "格式不正确！");
				}
				sdf = new SimpleDateFormat("yyyyMMdd");
				try {
					sdf.parse(item.getEindt());
				} catch (Exception e) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "交货日期:"
							+ item.getEindt() + "格式不正确！");
				}
				if (item.getAbruf() == null || item.getAbruf().equals("")) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "审批编号不能为空！");
				}
				if (item.getEbelp() == null || item.getEbelp().equals("")) {
					result.setFreeUse1(request.getEbeln());
					throw new Exception("采购协议号：" + request.getEbeln() + "采购计划协议行项目号不能为空！");
				}
				if (item.getLab_typ() == null || item.getLab_typ().equals("")) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "配送方式不能为空！");
				}
				if (item.getMeis() == null || item.getMeis().equals("")) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "计量单位不能为空！");
				}
				if (item.getFreeUse2() == null || item.getFreeUse2().equals("")) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "仓库名称不能为空！");
				}
				if (item.getFreeUse3() == null || item.getFreeUse3().equals("")) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "时间格式不能为空！");
				}
				MtlItems mtlItems = mtlItemsService.getByCode(item.getMatnr());
				if (mtlItems == null) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "物料编码:"
							+ item.getMatnr() + "不存在！");
				}
				try {
					Double.parseDouble(item.getMenge());
				} catch (Exception e) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "交货数量:"
							+ item.getMenge() + "格式不正确！");
				}
				if (!"P1".equals(item.getLab_typ()) && !"P2".equals(item.getLab_typ())
						&& !"P3".equals(item.getLab_typ()) && !"P4".equals(item.getLab_typ())) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "配送方式不存在！");
				}
				if (item.getWerks() == null || item.getWerks().equals("")) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "收货工厂不能为空！");
				}
				if (item.getLgort() == null || item.getLgort().equals("")) {
					result.setFreeUse1(request.getEbeln());
					result.setFreeUse2(item.getEbelp());
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "仓库不能为空！");
				}
			}
		}
	}

	/**
	 * SAP生产性物料发票处理接口处理
	 * 
	 * @param requests
	 * @throws Exception
	 */
	public void ifSRM2SAPAcinvoiceHandle(List<IfSRM2SAPAcinvoiceRequest> requests) throws Exception {
		if (requests == null || requests.size() == 0) {
			throw new Exception("输入数据为空！");
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
		for (IfSRM2SAPAcinvoiceRequest request : requests) {
			if (request.getPelnr() == null || request.getPelnr().equals("")) {
				throw new Exception("系统发票号不能为空！");
			}
			if (request.getBukrs() == null || request.getBukrs().equals("")) {
				throw new Exception("系统发票号" + request.getPelnr() + "公司代码不能为空！");
			}
			if (request.getWerks() == null || request.getWerks().equals("")) {
				throw new Exception("系统发票号" + request.getPelnr() + "工厂不能为空！");
			}
			if (request.getEbeln() == null || request.getEbeln().equals("")) {
				throw new Exception("系统发票号" + request.getPelnr() + "采购订单不能为空！");
			}
			if (request.getBelnr() == null || request.getBelnr().equals("")) {
				throw new Exception("系统发票号" + request.getPelnr() + "收货凭证不能为空！");
			}
			if (request.getGjahr() == null || request.getGjahr().equals("")) {
				throw new Exception("系统发票号" + request.getPelnr() + "凭证年度不能为空！");
			}
			VendorInfo info = infoService.getByCode(request.getLifnr());
			if (info == null) {
				throw new Exception("系统发票号：" + request.getPelnr() + " 供应商编号:" + request.getLifnr() + "不存在！");
			}
			try {
				sdf.parse(request.getFreeUse1());
			} catch (Exception e) {
				throw new Exception("系统发票号：" + request.getPelnr() + " 发票生成时间:" + request.getFreeUse1() + "格式错误！");
			}
		}
	}

	/**
	 * SAP生产性物料采购收货信息发送接口处理
	 * 
	 * @param requests
	 * @throws Exception
	 */
	public void ifSRM2SAPAcgrHandle(List<IfSRM2SAPAcgrRequest> requests) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		if (requests == null || requests.size() == 0) {
			throw new Exception("输入数据为空！");
		}
		for (IfSRM2SAPAcgrRequest request : requests) {
			if (request.getAsnNum() == null || request.getAsnNum().equals("")) {
				throw new Exception("asnid不能为空！");
			}
			if (request.getDocnum() == null || request.getDocnum().equals("")) {
				throw new Exception("asnid：" + request.getAsnNum() + "报文编号不能为空！");
			}
			VendorInfo info = infoService.getByCode(request.getLifnr());
			if (info == null) {
				throw new Exception("asnid：" + request.getAsnNum() + "供应商编码:" + request.getLifnr() + "不存在！");
			}
			try {
				sdf.parse(request.getDatus());
			} catch (Exception e) {
				throw new Exception("asnid：" + request.getAsnNum() + "收货日期:" + request.getDatus() + "格式不正确！");
			}
			for (IfSRM2SAPAcgrLineItem lineItem : request.getList()) {
				if (lineItem.getEbeln() == null || lineItem.getEbeln().equals("")) {
					throw new Exception("asnid：" + request.getAsnNum() + "采购计划协议号不能为空！");
				}
				if (lineItem.getEbelp() == null || lineItem.getEbelp().equals("")) {
					throw new Exception(
							"asnid：" + request.getAsnNum() + "采购计划协议号：" + lineItem.getEbeln() + "采购计划协议行项目号不能为空！");
				}
				MtlItems mtlItems = mtlItemsService.getByCode(lineItem.getMatnr());
				if (mtlItems == null) {
					throw new Exception("asnid：" + request.getAsnNum() + "采购计划协议号：" + lineItem.getEbeln() + "物料编码:"
							+ lineItem.getMatnr() + "不存在！");
				}
				if (lineItem.getBelnr() == null || lineItem.getBelnr().equals("")) {
					throw new Exception(
							"asnid：" + request.getAsnNum() + "采购计划协议号：" + lineItem.getEbeln() + "收货凭证不能为空！");
				}
				try {
					Float.parseFloat(lineItem.getMegr());
				} catch (Exception e) {
					throw new Exception("asnid：" + request.getAsnNum() + "采购计划协议号：" + lineItem.getEbeln() + "收货数量:"
							+ lineItem.getMegr() + "格式不正确！");
				}
			}
		}
	}

	/**
	 * plm文件同步处理
	 * 
	 * @param request
	 * @throws Exception
	 */
	public void fileIOListHandle(PLM2VendorFileIORequest request) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			sdf.parse(request.getJM3_Transferdate());
		} catch (Exception e1) {
			throw new Exception("编号:" + request.getJM3_Num() + " 传输日期:" + request.getJM3_Transferdate() + "格式不正确！");
		}
		String[] vendorCodes = request.getM3_Vendor().split(",");
		for (int i = 0; i < vendorCodes.length; i++) {
			VendorInfo vendorInfo = vendorInfoService.getByCode(vendorCodes[i]);
			if (vendorInfo == null) {
				throw new Exception("编号:" + request.getJM3_Num() + " 供应商编码:" + vendorCodes[i] + "不存在！");
			}
		}
		for (PLM2VendorFileIOLineItem item : request.getList()) {
			try {
				if (item.getExpiryDate() == null || "".equals(item.getExpiryDate())) {
					throw new Exception("编号:" + request.getJM3_Num() + " 过期时间:" + item.getExpiryDate() + "不能为空！");
				}
				Integer.parseInt(item.getExpiryDate());
			} catch (Exception e1) {
				throw new Exception("编号:" + request.getJM3_Num() + " 过期时间:" + item.getExpiryDate() + "格式不正确！");
			}
			try {
				if (item.getFile_type() == null || "".equals(item.getFile_type())) {
					throw new Exception("编号:" + request.getJM3_Num() + " 文件类型:" + item.getExpiryDate() + "格式不正确！");
				}
				Integer.parseInt(item.getFile_type());
			} catch (Exception e1) {
				throw new Exception("编号:" + request.getJM3_Num() + " 文件类型:" + item.getExpiryDate() + "格式不正确！");
			}
			try {
				Integer.parseInt(item.getMaxDownloadsNumber());
			} catch (Exception e1) {
				throw new Exception(
						"编号:" + request.getJM3_Num() + " 最大下载次数:" + item.getMaxDownloadsNumber() + "格式不正确！");
			}
		}
	}

	/**
	 * MES退货单处理
	 * 
	 * @param requests
	 * @throws Exception
	 */
	public void WMStoSRM_ReturnedHandle(List<WMStoSRM_ReturnedRequest> requests) throws Exception {
		if (requests == null || requests.isEmpty()) {
			throw new Exception("退货单列表不能为空！");
		}
		String refund_number = requests.get(0).getRefund_number();
		for (WMStoSRM_ReturnedRequest request : requests) {
			try {
				Double.parseDouble(request.getReturn_quantity());
			} catch (Exception e) {
				throw new Exception("退货单号" + refund_number + "退货数量:" + request.getReturn_quantity() + "格式不正确！");
			}
			if (!refund_number.equals(request.getRefund_number())) {
				throw new Exception("退货单号" + refund_number + "," + request.getRefund_number() + "不同！");
			}
			MtlItems item = mtlItemsService.getByCode(request.getMater_code());
			if (item == null) {
				throw new Exception("退货单号" + refund_number + "物料编码:" + request.getMater_code() + "不存在！");
			}
			VendorInfo vendorInfo = infoService.getByCode(request.getSupplyer_code());
			if (vendorInfo == null) {
				throw new Exception("退货单号" + refund_number + "供应商编码:" + request.getSupplyer_code() + "不存在！");
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
			try {
				sdf.parse(request.getCreate_time());
			} catch (Exception e) {
				throw new Exception("退货单号" + refund_number + " 时间格式：" + request.getCreate_time() + "错误！");
			}
		}
	}

	/**
	 * MES要料计划处理
	 * 
	 * @param requests
	 * @throws Exception
	 */
	public void WMStoSRM_MaterialPlanHandle(List<WMStoSRM_MaterialPlanRequest> requests) throws Exception {
		for (WMStoSRM_MaterialPlanRequest request : requests) {
			if (request.getMaterialPlan_code() == null || "".equals(request.getMaterialPlan_code())) {
				throw new Exception("要料计划编号不能为空！");
			}
			if (!(request.getFreeUse2().equals("0") || request.getFreeUse2().equals("1"))) {
				throw new Exception("更新修改状态错误！");
			}
			if (request.getFreeUse2().equals("1")) {
				MaterialPlanRise materialPlanRise = materialPlanRiseService.getByCode(request.getMaterialPlan_code());
				if (materialPlanRise == null) {
					throw new Exception("更新操作要料计划编号："+ request.getMaterialPlan_code()+"不存在！");				
				}
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
			try {
				sdf.parse(request.getNeed_time());
			} catch (Exception e) {
				throw new Exception(
						"要料计划编号:" + request.getMaterialPlan_code() + "需求时间:" + request.getNeed_time() + "格式错误！");
			}
			if (!"P1".equals(request.getStorage_location()) && !"P2".equals(request.getStorage_location())
					&& !"P3".equals(request.getStorage_location()) && !"P4".equals(request.getStorage_location())) {
				throw new Exception(
						"要料计划编号:" + request.getMaterialPlan_code() + "供货类型：" + request.getStorage_location() + "错误！");
			}
			if (request.getWh_code() == null || request.getWh_code().equals("")) {
				throw new Exception("要料计划编号:" + request.getMaterialPlan_code() + "仓库编码不能为空！");
			}
			if (request.getWh_name() == null || request.getWh_name().equals("")) {
				throw new Exception("要料计划编号:" + request.getMaterialPlan_code() + "仓库名称不能为空！");
			}
			if (request.getStocker_code() == null || request.getStocker_code().equals("")) {
				throw new Exception("要料计划编号:" + request.getMaterialPlan_code() + "保管员不能为空！");
			}
			VendorInfo info = infoService.getByCode(request.getSupplyer_code());
			if (info == null) {
				throw new Exception(
						"要料计划编号:" + request.getMaterialPlan_code() + " 供应商编码:" + request.getSupplyer_code() + "不存在！");
			}
			for (WMStoSRM_MaterialPlanRequestItem item : request.getItems()) {
				if (request.getMaterialPlan_code() == null || "".equals(request.getMaterialPlan_code())) {
					throw new Exception("要料计划编号:" + request.getMaterialPlan_code() + "要料计划行号不能为空！");
				}
				MtlItems mtlItems = mtlItemsService.getByCode(item.getMater_code());
				if (mtlItems == null) {
					throw new Exception("要料计划编号:" + request.getMaterialPlan_code() + " 要料计划行号："
							+ item.getMaterialPlan_line() + "物料编码：" + item.getMater_code() + "不存在！");
				}
				try {
					Double.parseDouble(item.getNeed_count());
				} catch (Exception e) {
					throw new Exception("要料计划编号:" + request.getMaterialPlan_code() + " 要料计划行号："
							+ item.getMaterialPlan_line() + "需求数量：" + item.getNeed_count() + "格式不正确！");
				}
				if (item.getUnit() == null || item.getUnit().equals("")) {
					throw new Exception("要料计划编号:" + request.getMaterialPlan_code() + " 要料计划行号："
							+ item.getMaterialPlan_line() + "单位不能为空！");
				}
				if (item.getFreeUse1() == null || item.getFreeUse1().equals("")) {
					throw new Exception("要料计划编号:" + request.getMaterialPlan_code() + " 要料计划行号："
							+ item.getMaterialPlan_line() + "作废状态不能为空！");
				} else if (!(item.getFreeUse1().equals("0") || item.getFreeUse1().equals("1"))) {
					throw new Exception("要料计划编号:" + request.getMaterialPlan_code() + " 要料计划行号："
							+ item.getMaterialPlan_line() + "作废状态格式不正确！");
				}
			}
		}
	}

	/**
	 * MES入库单异常处理
	 * 
	 * @param requests
	 * @throws Exception
	 */
	public void WMStoSRM_ASNHandle(List<WMStoSRM_ASNRequest> requests) throws Exception {
		if (requests == null || requests.isEmpty()) {
			throw new Exception("收货信息列表不能为空！");
		}
		String asnCode = requests.get(0).getAsnid();
		if (asnCode == null || asnCode.equals("")) {
			throw new Exception("asnid不能为空！");
		}
		DistributionOrder order = orderService.getByDistributionCode(asnCode);
		if (order == null) {
			throw new Exception("asnid:" + asnCode + ",对应的配送单不存在!");
		}
		if (3 == order.getPrint_status()) {
			throw new Exception("asnid:" + asnCode + ",对应的配送单已收货，不能重复收货!");
		}

		MaterialPlanRise materialPlanRise = null;
		PoInfoPlanRise2 poInfoPlanRise2 = null;
		PoRise poRise = null;
		if (0 == order.getDistribution_type().intValue()) {
			materialPlanRise = materialPlanRiseService.getByPlanId(order.getInfo_plan_rise_id().intValue());
			if (materialPlanRise == null) {
				throw new Exception("asnid:" + asnCode + ",对应的要料计划不存在！");
			}
		} else {
			if (order.getDistribution_type().intValue() == 2) {
				poRise = poRiseService.getByPlanId(order.getInfo_plan_rise_id().intValue());
				if (poRise == null) {
					throw new Exception("asnid:" + asnCode + ",对应的要料计划不存在！");
				}
			} else if (order.getDistribution_type().intValue() == 1) {
				poInfoPlanRise2 = poInfoPlanRise2Service.getByPlanId(order.getInfo_plan_rise_id().intValue());
				if (poInfoPlanRise2 == null) {
					throw new Exception("asnid:" + asnCode + ",对应的采购计划不存在！");
				}
			}
		}

		for (WMStoSRM_ASNRequest request : requests) {
			if (request.getAsnid() == null || request.getAsnid().equals("")) {
				throw new Exception("asnid不能为空！");
			}
			if (!request.getAsnid().equals(asnCode)) {
				throw new Exception("asnid：\"" + request.getAsnid() + "\",\"" + asnCode + "\"信息不同！");
			}
			if (request.getMaterialPlan_line() == null || request.getMaterialPlan_line().equals("")) {
				throw new Exception("asnid:" + request.getAsnid() + ",要料计划对应行项目号不能为空！");
			}
			if (request.getMaterialPlan_code() == null || request.getMaterialPlan_code().equals("")) {
				throw new Exception("asnid:" + request.getAsnid() + ",要料计划编号不能为空！");
			}
			if (request.getMater_code() == null || request.getMater_code().equals("")) {
				throw new Exception("asnid:" + request.getAsnid() + ",物料编号不能为空！");
			}
			if (request.getSupplyer_code() == null || request.getSupplyer_code().equals("")) {
				throw new Exception("asnid:" + request.getAsnid() + ",供应商编号不能为空！");
			}

			DistributionOrderItem asnItem = itemService.getByHeadIdAndLineCode(order.getDistribution_order_id(),
					request.getMaterialPlan_line());
			if (asnItem == null) {
				throw new Exception(
						"asnid:" + request.getAsnid() + ",对应配送单行项目号\"" + request.getMaterialPlan_line() + "\"不存在！");
			}

			if (materialPlanRise != null) {
				MaterialPlanItem materialPlanItem = materialPlanItemService
						.getByHeaderIdAndLineCode(materialPlanRise.getId(), request.getMaterialPlan_line());

				if (materialPlanItem == null) {
					throw new Exception("asnid:" + request.getAsnid() + ",采购订单对应行项目号\"" + request.getMaterialPlan_line()
							+ "\"不存在！");
				}
			} else if (poInfoPlanRise2 != null) {
				PoInfoPlanLineItem2 infoPlanLineItem2 = poInfoPlanLineItem2Service
						.getByHeaderIdAndLineCode(poInfoPlanRise2.getId(), request.getMaterialPlan_line());

				if (infoPlanLineItem2 == null) {
					throw new Exception("asnid:" + request.getAsnid() + ",采购订单对应行项目号\"" + request.getMaterialPlan_line()
							+ "\"不存在！");
				}
			}

			MtlItems item = mtlItemsService.getByCode(request.getMater_code());
			if (item == null) {
				throw new Exception("asnid:" + request.getAsnid() + " 物料编码：" + request.getMater_code() + "不存在！");
			}
			VendorInfo vendorInfo = infoService.getByCode(request.getSupplyer_code());
			if (vendorInfo == null) {
				throw new Exception("asnid:" + request.getAsnid() + " 供应商编码：" + request.getSupplyer_code() + "不存在！");
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
			try {
				sdf.parse(request.getCreate_time());
			} catch (Exception e) {
				throw new Exception("asnid:" + request.getAsnid() + " 时间格式：" + request.getCreate_time() + "错误！");
			}
			try {
				Double.parseDouble(request.getAct_charger_num());
			} catch (Exception e) {
				throw new Exception(
						"asnid:" + request.getAsnid() + " 实际到货数量：" + request.getAct_charger_num() + "格式错误！");
			}
			try {
				Double.parseDouble(request.getQualified_number());
			} catch (Exception e) {
				throw new Exception("asnid:" + request.getAsnid() + " 合格数量：" + request.getQualified_number() + "格式错误！");
			}
			try {
				Double.parseDouble(request.getIllqualified_number());
			} catch (Exception e) {
				throw new Exception(
						"asnid:" + request.getAsnid() + " 不合格数量：" + request.getIllqualified_number() + "格式错误！");
			}
		}
	}

	public void ifSAP2SRMPoHandle(IFSAP2SRMPoRequest request, MsgResult result) throws Exception {

		if (request.getEbeln() == null || request.getEbeln().equals("")) {
			throw new Exception("采购订单号不能为空！");
		}
		if (request.getPo_type() == null || request.getPo_type().equals("")) {
			result.setFreeUse1(request.getEbeln());
			throw new Exception("采购订单号:" + request.getEbeln() + ",订单类型不能为空！");
		}
		VendorInfo info = infoService.getByCode(request.getLifnr());
		if (info == null) {
			result.setFreeUse1(request.getEbeln());
			throw new Exception("采购订单号:" + request.getEbeln() + ",供应商编码：" + request.getLifnr() + "不存在！");
		}
		if (request.getYw_typpe() == null || request.getYw_typpe().equals("")) {
			result.setFreeUse1(request.getEbeln());
			throw new Exception("采购订单号:" + request.getEbeln() + ",业务类型不能为空！");
		}
		if (request.getDocnum() == null || request.getDocnum().equals("")) {
			request.setFreeUse1(request.getEbeln());
			throw new Exception("采购订单号:" + request.getEbeln() + ",报文编号不能为空！");
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			sdf.parse(request.getLabdate());
		} catch (Exception e) {
			result.setFreeUse1(request.getEbeln());
			throw new Exception("采购订单号:" + request.getEbeln() + ",创建日期格式不正确！");
		}
		try {
			sdf.parse(request.getCdate());
		} catch (Exception e) {
			result.setFreeUse1(request.getEbeln());
			throw new Exception("采购订单号:" + request.getEbeln() + ",发送日期格式不正确！");
		}
		sdf = new SimpleDateFormat("hhmmss");
		try {
			sdf.parse(request.getCtime());
		} catch (Exception e) {
			result.setFreeUse1(request.getEbeln());
			throw new Exception("采购订单号:" + request.getEbeln() + ",发送时间格式不正确！");
		}
		if (request.getItems() == null || request.getItems().size() == 0) {
			result.setFreeUse1(request.getEbeln());
			throw new Exception("采购订单号:" + request.getEbeln() + ",行项目不能为空！");
		}
		for (IfSAP2SRMPoLineItem item : request.getItems()) {
			if (item.getEbelp() == null || item.getEbelp().equals("")) {
				result.setFreeUse1(request.getEbeln());
				throw new Exception("采购订单号:" + request.getEbeln() + ",采购计划协议行项目号不能为空！");
			}
			MtlItems mtlItems = mtlItemsService.getByCode(item.getMatnr());
			if (mtlItems == null) {
				result.setFreeUse1(request.getEbeln());
				result.setFreeUse2(item.getEbelp());
				throw new Exception("采购订单号:" + request.getEbeln() + ",采购计划协议行项目号：" + item.getEbelp() + ",物料代码："
						+ item.getMatnr() + "不存在！");
			}
			if (item.getMeis() == null || item.getMeis().equals("")) {
				result.setFreeUse1(request.getEbeln());
				result.setFreeUse2(item.getEbelp());
				throw new Exception("采购订单号:" + request.getEbeln() + ",采购计划协议行项目号：" + item.getEbelp() + "计量单位不能为空！");
			}
			if (item.getWerks() == null || item.getWerks().equals("")) {
				result.setFreeUse1(request.getEbeln());
				result.setFreeUse2(item.getEbelp());
				throw new Exception("采购订单号:" + request.getEbeln() + ",采购计划协议行项目号：" + item.getEbelp() + "收货工厂不能为空！");
			}
			/*
			 * if (item.getCar_type() == null || item.getCar_type().equals(""))
			 * { throw new
			 * Exception("采购订单号:"+request.getEbeln()+",采购计划协议行项目号："+item.
			 * getEbelp()+"车系不能为空！"); }
			 */
			if (item.getLgort() == null || item.getLgort().equals("")) {
				result.setFreeUse1(request.getEbeln());
				result.setFreeUse2(item.getEbelp());
				throw new Exception("采购订单号:" + request.getEbeln() + ",采购计划协议行项目号：" + item.getEbelp() + "收货仓库不能为空！");
			}
			if (item.getLgort_name() == null || item.getLgort_name().equals("")) {
				result.setFreeUse1(request.getEbeln());
				result.setFreeUse2(item.getEbelp());
				throw new Exception("采购订单号:" + request.getEbeln() + ",采购计划协议行项目号：" + item.getEbelp() + "收货仓库名称不能为空！");
			}
			if (!"P1".equals(item.getLab_type()) && !"P2".equals(item.getLab_type()) && !"P3".equals(item.getLab_type())
					&& !"P4".equals(item.getLab_type())) {
				result.setFreeUse1(request.getEbeln());
				result.setFreeUse2(item.getEbelp());
				throw new Exception("采购订单号:" + request.getEbeln() + ",采购计划协议行项目号：" + item.getEbelp() + "供货类型错误！");
			}
			if (item.getAbruf() == null || item.getAbruf().equals("")) {
				result.setFreeUse1(request.getEbeln());
				result.setFreeUse2(item.getEbelp());
				throw new Exception("采购订单号:" + request.getEbeln() + ",采购计划协议行项目号：" + item.getEbelp() + "版本号不能为空！");
			}
			if (item.getStocker_code() == null || item.getStocker_code().equals("")) {
				result.setFreeUse1(request.getEbeln());
				result.setFreeUse2(item.getEbelp());
				throw new Exception("采购订单号:" + request.getEbeln() + ",采购计划协议行项目号：" + item.getEbelp() + "保管员不能为空！");
			}
			sdf = new SimpleDateFormat("yyyyMMdd");
			try {
				sdf.parse(item.getEindt());
			} catch (Exception e) {
				result.setFreeUse1(request.getEbeln());
				result.setFreeUse2(item.getEbelp());
				throw new Exception("采购订单号:" + request.getEbeln() + ",采购计划协议行项目号：" + item.getEbelp() + "交货日期格式不正确！");
			}
			try {
				Double.parseDouble(item.getMenge());
			} catch (Exception e) {
				result.setFreeUse1(request.getEbeln());
				result.setFreeUse2(item.getEbelp());
				throw new Exception("采购订单号:" + request.getEbeln() + ",采购计划协议行项目号：" + item.getEbelp() + "数量格式不正确！");
			}

		}
	}
}
