package cn.jcloud.srm.beans.srm;

/**
 * 供应商考察结果通知信息审批
 * @author zhl
 * @time 2017年10月17日 下午6:27:06
 * @Description TODO
 */
public class NoticeExaminationTotal {
	private VendorDoInNoticeInfo vendorDoinNotice;
	private QualifiedNoticeInfo qualifiedNotice;

	public VendorDoInNoticeInfo getVendorDoinNotice() {
		return vendorDoinNotice;
	}

	public void setVendorDoinNotice(VendorDoInNoticeInfo vendorDoinNotice) {
		this.vendorDoinNotice = vendorDoinNotice;
	}

	public QualifiedNoticeInfo getQualifiedNotice() {
		return qualifiedNotice;
	}

	public void setQualifiedNotice(QualifiedNoticeInfo qualifiedNotice) {
		this.qualifiedNotice = qualifiedNotice;
	}
}
