package cn.jcloud.srm.beans.srm;

public class ClassifyInfo {

	private String classfyOne;
	private String classfyTwo;
	private String classfyThree;
	private String classfyFour;
	private String mtlTypeId;
	/*
	 * 拓展字段:供应商冻结所需 
	 * 
	 */
	private String eliminateId;
	
	public String getEliminateId() {
		return eliminateId;
	}
	public void setEliminateId(String eliminateId) {
		this.eliminateId = eliminateId;
	}
	public String getClassfyOne() {
		return classfyOne;
	}
	public void setClassfyOne(String classfyOne) {
		this.classfyOne = classfyOne;
	}
	public String getClassfyTwo() {
		return classfyTwo;
	}
	public void setClassfyTwo(String classfyTwo) {
		this.classfyTwo = classfyTwo;
	}
	public String getClassfyThree() {
		return classfyThree;
	}
	public void setClassfyThree(String classfyThree) {
		this.classfyThree = classfyThree;
	}
	public String getClassfyFour() {
		return classfyFour;
	}
	public void setClassfyFour(String classfyFour) {
		this.classfyFour = classfyFour;
	}
	public String getMtlTypeId() {
		return mtlTypeId;
	}
	public void setMtlTypeId(String mtlTypeId) {
		this.mtlTypeId = mtlTypeId;
	}
	
	
}
