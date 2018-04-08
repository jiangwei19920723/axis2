package cn.jcloud.srm.quartz;

import java.io.IOException;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.jcloud.srm.beans.srm.tosap.materialBean;
import cn.jcloud.srm.client.sap.material.MATERIAL_REQ_type0;
import cn.jcloud.srm.common.FileUtils;
import cn.jcloud.srm.common.InterfaceStringUtils;
import cn.jcloud.srm.common.WebServiceUtils;
import cn.jcloud.srm.entity.SynchronousState;
import cn.jcloud.srm.service.SynchronousStateService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月8日 上午10:30:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class GetMaterial {
	private static final Logger LOGGER = LoggerFactory.getLogger(GetMaterial.class);
	@Autowired
	private SynchronousStateService stateService;
	public void run(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		materialBean bean = new materialBean();
		bean.setEndDate(sdf.format(new Date()));
		Properties properties = new Properties();
		try {
			properties.load(FileUtils.class.getResourceAsStream("/user.properties"));
		} catch (IOException e1) {
			LOGGER.error(InterfaceStringUtils.IFSRM2SAPMATERIAL,e1);
		}
		String[] factorys = properties.getProperty("sap.materialFactory").split(",");
		String[] types = properties.getProperty("sap.materialType").split(",");
		SynchronousState synchronousState = stateService.getFirstByInterfaceName(InterfaceStringUtils.IFSRM2SAPMATERIAL);
		if (synchronousState == null) {
			bean.setStartDate("19700101");
		}else {
			bean.setStartDate(sdf.format(synchronousState.getCreateTime()));
		}
		try {
			for (int i = 0; i < factorys.length; i++) {
				MATERIAL_REQ_type0 type = new MATERIAL_REQ_type0();
				type.setSTARTDAT(bean.getStartDate());
				type.setENDDAT(bean.getEndDate());
				type.setWERKS(factorys[i]);
				for (int j = 0; j < types.length; j++) {
					type.setMTART(types[j]);
					WebServiceUtils.toMaterial(type);
				}
			}
			LOGGER.info(InterfaceStringUtils.IFSRM2SAPMATERIAL);
		} catch (RemoteException e) {
			LOGGER.error(InterfaceStringUtils.IFSRM2SAPMATERIAL, e);
		}
	}
}
