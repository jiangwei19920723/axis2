package cn.jcloud.srm.beans.srm.tosap;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月7日 上午8:56:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class AcasnItemBean {
	private float deliveryNumber;//交货数量
	private String materielCode;//物料代码
	private String deliveryFactory;//收货仓库
	private String kolli;//每箱的kolli号
	private String manufactureDate;//生产日期 yyyyMMdd
	public float getDeliveryNumber() {
		return deliveryNumber;
	}
	public void setDeliveryNumber(float deliveryNumber) {
		this.deliveryNumber = deliveryNumber;
	}

	public String getMaterielCode() {
		return materielCode;
	}
	public void setMaterielCode(String materielCode) {
		this.materielCode = materielCode;
	}
	public String getDeliveryFactory() {
		return deliveryFactory;
	}
	public void setDeliveryFactory(String deliveryFactory) {
		this.deliveryFactory = deliveryFactory;
	}
	public String getKolli() {
		return kolli;
	}
	public void setKolli(String kolli) {
		this.kolli = kolli;
	}
	public String getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
}
