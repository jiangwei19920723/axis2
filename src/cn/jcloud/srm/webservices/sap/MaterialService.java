package cn.jcloud.srm.webservices.sap;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.jcloud.srm.beans.sap.IfSRM2SAPMaterialRequest;
import cn.jcloud.srm.common.FileUtils;
import cn.jcloud.srm.common.HeadUtils;
import cn.jcloud.srm.common.InterfaceStringUtils;
import cn.jcloud.srm.common.msg.Header;
import cn.jcloud.srm.entity.SynchronousState;
import cn.jcloud.srm.entity.sap.MtlItems;
import cn.jcloud.srm.service.HeadService;
import cn.jcloud.srm.service.SynchronousStateService;
import cn.jcloud.srm.service.sap.MtlItemsService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月18日 下午8:15:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service("MaterialService")
public class MaterialService {
	private static final Logger LOGGER = LoggerFactory.getLogger(MaterialService.class);
	@Autowired
	private SynchronousStateService stateService;
	@Autowired
	private HeadService headService;
	@Autowired
	private MtlItemsService service;
	public void IfSRM2SAPMaterial(Header header,List<IfSRM2SAPMaterialRequest> requests){
		String msg ="";
		SynchronousState state = new SynchronousState();
		state.setCreateTime(new Date());
		String filecontent = JSON.toJSONString(requests);
		String filePath = FileUtils.createPath(InterfaceStringUtils.IFSRM2SAPMATERIALPATH);
		FileUtils.createFile(filePath, filecontent);
		state.setJsonRoute(filePath);
		state.setHeadId(HeadUtils.save(headService, header));
		state.setInterfaceName(InterfaceStringUtils.IFSRM2SAPMATERIAL);
		state.setSyncOrAsyn(InterfaceStringUtils.ASYN);
		state.setSyncStartDate(new Date());
		try {
			List<MtlItems> items1 = new ArrayList<>();
			List<MtlItems> items2 = new ArrayList<>();
			List<String> codes = new ArrayList<>();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			for (IfSRM2SAPMaterialRequest request : requests) {
				if (request.getMaktx()== null ||"".equals(request.getMaktx().trim())) {
					msg+=" "+request.getMatnr()+"物料名称为空！";
					continue;
				}		
				if (codes.contains(request.getMatnr())) {
					msg+=" "+request.getMatnr()+"重复物料编码！";
					continue;
				}else {
					codes.add(request.getMatnr());
				}
				MtlItems item = service.getByCode(request.getMatnr());
				if (item == null) {
					item = new MtlItems();
					item.setItemCode(request.getMatnr());
					item.setDescriptions(request.getMaktx());
					item.setMtlType(request.getMtart());
					item.setUomCode(request.getMeins());
					item.setMtlGroup(request.getMatkl());
					item.setPurchasing_group(request.getFreeUse1());
					if (request.getCh_time() == null||"".equals(request.getCh_time())) {
						item.setLastUpdatedDate(new Date());
					}else {
						item.setLastUpdatedDate(sdf.parse(request.getCh_time()));
					}
					item.setCreationDate(new Date());
					item.setCreatedBy("1");
					items1.add(item);
				}else {
					item.setDescriptions(request.getMaktx());
					item.setMtlType(request.getMtart());
					item.setUomCode(request.getMeins());
					item.setMtlGroup(request.getMatkl());
					item.setPurchasing_group(request.getFreeUse1());
					if (request.getCh_time() == null||"".equals(request.getCh_time())) {
						item.setLastUpdatedDate(new Date());
					}else {
						item.setLastUpdatedDate(sdf.parse(request.getCh_time()));
					}
					items2.add(item);
				}
			}
			service.saves(items1);
			service.updates(items2);
			state.setSyncEndDate(new Date());
			if (msg.equals("")) {
				state.setOperationState("成功");				
			}else {
				state.setOperationState(msg);							
			}
			stateService.save(state);
			LOGGER.info(InterfaceStringUtils.IFSRM2SAPMATERIAL);
		} catch (Exception e) {
			LOGGER.error(InterfaceStringUtils.IFSRM2SAPMATERIAL, e);
			state.setSyncEndDate(new Date());
			state.setOperationState(e.getMessage());
			stateService.save(state);
		}
	}
}
