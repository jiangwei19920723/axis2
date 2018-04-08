package cn.jcloud.srm.beans.srm;

/**
 * 定点完成所有通知审批汇总
 * 
 * @author zhl
 * @time 2017年10月17日 下午8:12:50
 * @Description TODO
 */
public class PoFixedNoticeTotal {

	private PoFixedReport report;
	private PoFixedPriceNotice priceNotice;
	private PoFixedConfigNotice configNotice;

	public PoFixedReport getReport() {
		return report;
	}

	public void setReport(PoFixedReport report) {
		this.report = report;
	}

	public PoFixedPriceNotice getPriceNotice() {
		return priceNotice;
	}

	public void setPriceNotice(PoFixedPriceNotice priceNotice) {
		this.priceNotice = priceNotice;
	}

	public PoFixedConfigNotice getConfigNotice() {
		return configNotice;
	}

	public void setConfigNotice(PoFixedConfigNotice configNotice) {
		this.configNotice = configNotice;
	}
}
