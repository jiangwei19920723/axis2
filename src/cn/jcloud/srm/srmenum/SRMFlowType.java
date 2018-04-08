package cn.jcloud.srm.srmenum;

/**
 * @author 蒋维
 * @date 创建时间：2017年10月16日 上午11:05:24
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public enum SRMFlowType {
	//1.code 2.className 3.xmlAddress
	/**
	 * 供应商考察申请 
	 */
	VENDOR_DOIN("SRM_VD","cn.jcloud.srm.beans.srm.VendorDoinInfo","/srm/vendor_doin.xml"),
	/**
	 * 供应商考察商务打分评审
	 */
	VENDOR_DOIN_BUSINESS_SCORE("SRM_VDBS","cn.jcloud.srm.beans.srm.BussinessAssessInfo","/srm/vendor_doin_business_score.xml"),
	/**
	 * 供应商考察物流打分评审
	 */
	VENDOR_DOIN_LOGISTICS_SCORE("SRM_VDLS","cn.jcloud.srm.beans.srm.LogisticsAssessInfo","/srm/vendor_doin_logistics_score.xml"),
	/**
	 * 供应商考察质量打分评审
	 */
	VENDOR_DOIN_QUALITY_SCORE("SRM_VDQS","cn.jcloud.srm.beans.srm.QualityAssessInfo","/srm/vendor_doin_quality_score.xml"),
	/**
	 * 供应商技术打分评审
	 */
	VENDOR_DOIN_TECHNOLOGY_SCORE("SRM_VDTS","cn.jcloud.srm.beans.srm.TechnologyAssessInfo","/srm/vendor_doin_technology_score.xml"),
	/**
	 * 供应商冻结流程
	 */
	VENDOR_ELIMINATE("SRM_VE","cn.jcloud.srm.beans.srm.VendorEliminateInfo","/srm/vendor_eliminate.xml"),
	/**
	 * 供应商考察结果通知信息审批
	 */
	VENDOR_DOIN_NOTICE("SRM_VDN","cn.jcloud.srm.beans.srm.NoticeExaminationTotal","/srm/vendor_doin_notice.xml"),
	/**
	 * 供应商变更通知流程
	 */
	VENDOR_CHANGE_NOTICE("SRM_VCN","cn.jcloud.srm.beans.srm.VendorChangeNotice","/srm/vendor_change_notice.xml"),
	/**
	 * 定点申请流程
	 */
	PO_FINXED_REQUEST("SRM_PFR","cn.jcloud.srm.beans.srm.PoFixedRequest","/srm/po_finxed_request.xml"),
	/**
	 * 中止定点申请流程
	 */
	PO_FIXED_REQUEST_CANCEL("SRM_PFRC","cn.jcloud.srm.beans.srm.PoFixedRequstCancel","/srm/po_fixed_request_cancel.xml"),
	/**
	 * 定点策略流程
	 */
	PO_FIXED_STRATEGY("SRM_PFS","cn.jcloud.srm.beans.srm.PoFixedStrategy","/srm/po_fixed_strategy.xml"),
	/**
	 * 目标价格管理流程
	 */
	PO_TARGET_PRICE("SRM_PTP","cn.jcloud.srm.beans.srm.PoFixedTargetPrice","/srm/po_target_price.xml"),
	/**
	 * 定点询价函技术评审
	 */
	PO_FIXED_INVITATION_TEC("SRM_PFIT","cn.jcloud.srm.beans.srm.PoFixedInvitation","/srm/po_fixed_invitation_tec.xml"),
	/**
	 * 定点报告及定价通知及配管通知审批
	 */
	PO_INVITATION_REPORT_AUTH("SRM_PIRA","cn.jcloud.srm.beans.srm.PoFixedNoticeTotal","/srm/po_invitation_report_auth.xml"),
	/**
	 * 取消定点申请流程
	 */
	PO_FIXED_INVITATION_CANCEL_AF("SRM_PFICA","cn.jcloud.srm.beans.srm.PoFixedRequestSuspend","/srm/po_fixed_invitation_cancel_af.xml"),
	/**
	 * 设计变更流程
	 */
	DESIGN_CHANGE_FIXED("SRM_DCF","cn.jcloud.srm.beans.srm.DesignChangeFixed","/srm/design_change_fixed.xml"),
	/**
	 * 设计变更中止流程
	 */
	DESIGN_CHANGE_CANCEL("SRM_DCC","cn.jcloud.srm.beans.srm.DesignChange","/srm/design_change_cancel.xml"),
	/**
	 * 设变目标价格管理流程
	 */
	PO_DESIGN_CHANGE_PRICE("SRM_PDCP","cn.jcloud.srm.beans.srm.PoDesignChange","/srm/po_design_change_price.xml"),
	/**
	 * 询价截止时间调整审批流程
	 */
	PO_FIXED_INVITATION_ENDTIME_CHANGE("SRM_PFIEC","",""),
	/**
	 * 供应商绩效评价申请申请
	 */
	KPI_TEMPLATE_APPLY("KPI_APPLY_VENDOR","cn.jcloud.srm.beans.srm.KpiTemplateApply","/srm/kpi_template_apply.xml"),
	/**
	 * 供应商绩效评价申诉
	 */
	KPI_TEMPLATE_VENDOR_CLAIM("KPI_ClAIM_VENDOR","cn.jcloud.srm.beans.srm.KpiTemplateApply","/srm/kpi_template_vendor_claim.xml");
	
	private final String code;
	private final String className;
	private final String xmlAddress;

	// 构造器只能是private, 从而保证构造函数只能在内部使用
	SRMFlowType(String code,String className,String xmlAddress) {
		this.code = code;
		this.className = className;
		this.xmlAddress = xmlAddress;
	}

	public String getCode() {
		return code;
	}

	public String getClassName() {
		return className;
	}

	public String getXmlAddress() {
		return xmlAddress;
	}
	

}
