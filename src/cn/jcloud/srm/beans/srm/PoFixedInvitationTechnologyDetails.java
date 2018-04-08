package cn.jcloud.srm.beans.srm;

/**
 * 定点技术评审打分具体条目
 * 
 * @author zhl
 * @time 2017年10月17日 下午7:09:45
 * @Description TODO
 */
public class PoFixedInvitationTechnologyDetails {

	private String scheme_detail_id;
	private String score;
	private String remark;
	private String record;

	public String getScheme_detail_id() {
		return scheme_detail_id;
	}

	public void setScheme_detail_id(String scheme_detail_id) {
		this.scheme_detail_id = scheme_detail_id;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getRemark() {
		return remark==null?"":remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRecord() {
		return record==null?"":record;
	}

	public void setRecord(String record) {
		this.record = record;
	}

}
