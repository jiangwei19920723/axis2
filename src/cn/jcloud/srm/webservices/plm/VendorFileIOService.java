package cn.jcloud.srm.webservices.plm;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.jcloud.srm.beans.plm.PLM2VendorFileIOLineItem;
import cn.jcloud.srm.beans.plm.PLM2VendorFileIORequest;
import cn.jcloud.srm.common.FileUtils;
import cn.jcloud.srm.common.HeadUtils;
import cn.jcloud.srm.common.InterfaceStringUtils;
import cn.jcloud.srm.common.msg.Header;
import cn.jcloud.srm.common.msg.MsgResult;
import cn.jcloud.srm.entity.FileInfo;
import cn.jcloud.srm.entity.SynchronousState;
import cn.jcloud.srm.entity.VendorInfo;
import cn.jcloud.srm.entity.plm.FileIOBody;
import cn.jcloud.srm.entity.plm.FileIOHead;
import cn.jcloud.srm.handleException.WebServiceHandleException;
import cn.jcloud.srm.service.FileInfoService;
import cn.jcloud.srm.service.HeadService;
import cn.jcloud.srm.service.SynchronousStateService;
import cn.jcloud.srm.service.VendorInfoService;
import cn.jcloud.srm.service.plm.FileIOBodyService;
import cn.jcloud.srm.service.plm.FileIOHeadService;

/**
 * @author 蒋维
 * @date 创建时间：2017年10月10日 上午11:48:04
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Service("VendorFileIOService")
@Scope("prototype")
public class VendorFileIOService {
	private static final Logger LOGGER = LoggerFactory.getLogger(VendorFileIOService.class);
	@Autowired
	private SynchronousStateService stateService;
	@Autowired
	private HeadService headService;
	@Autowired
	private FileIOHeadService ioHeadService;
	@Autowired
	private FileIOBodyService ioBodyService;
	@Autowired
	private FileInfoService infoService;
	@Autowired
	private VendorInfoService vendorInfoService;
	@Autowired
	private WebServiceHandleException handleException;

	public MsgResult fileIOList(Header header, PLM2VendorFileIORequest request) {
		SynchronousState state = new SynchronousState();
		state.setCreateTime(new Date());
		String filecontent = JSON.toJSONString(request);
		String filePath = FileUtils.createPath(InterfaceStringUtils.VENDORFILEIOPATH);
		FileUtils.createFile(filePath, filecontent);
		state.setJsonRoute(filePath);
		state.setHeadId(HeadUtils.save(headService, header));
		state.setInterfaceName(InterfaceStringUtils.VENDORFILEIO);
		state.setSyncOrAsyn(InterfaceStringUtils.SYNC);
		MsgResult result = new MsgResult();
		List<FileIOHead> ioHeads = new ArrayList<>();
		try {
			handleException.fileIOListHandle(request);
			List<FileIOBody> ioBodies = new ArrayList<>();
			String[] vendorCodes = request.getM3_Vendor().split(",");
			for (int i = 0; i < vendorCodes.length; i++) {
				FileIOHead ioHead = new FileIOHead();
				ioHead.setCode(request.getJM3_Num());
				ioHead.setVendorCode(vendorCodes[i]);
				ioHead.setIOer(request.getJM3_Transmitter());
				ioHead.setTitle(request.getJM3_Title());
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
				ioHead.setIODate(sdf.parse(request.getJM3_Transferdate()));
				VendorInfo vendorInfo = vendorInfoService.getByCode(vendorCodes[i]);
				ioHead.setVendorId(vendorInfo.getVendorId());
				ioHeadService.save(ioHead);
				ioHeads.add(ioHead);
			}
			for (PLM2VendorFileIOLineItem item : request.getList()) {
				FileInfo fileInfo = new FileInfo();
				fileInfo.setFileName(item.getJM3_Filename());
				fileInfo.setFilePath(item.getJM3_Fileaddress());
				fileInfo.setStatus(1);
				fileInfo.setUploadBy("0");
				fileInfo.setFileModel("plm");
				Date date = new Date(new Date().getTime()+Long.parseLong(item.getExpiryDate())*24*60*60*1000);
				fileInfo.setExpiryDate(date);
				fileInfo.setMaxDownloadsNumber(Integer.parseInt(item.getMaxDownloadsNumber()));
				fileInfo.setUploadTime(new Date());
				infoService.save(fileInfo);
				fileInfo.setFileId(fileInfo.getFileId());
				for (int i = 0; i < vendorCodes.length; i++) {
					FileIOBody ioBody = new FileIOBody();
					ioBody.setCode(request.getJM3_Num());
					ioBody.setFile_type(Integer.parseInt(item.getFile_type()));
					ioBody.setFileAddress(item.getJM3_Fileaddress());
					ioBody.setFileName(item.getJM3_Filename());
					ioBody.setFileInfoId(fileInfo.getFileId().intValue());
					ioBody.setMaxDownloadsNumber(Integer.parseInt(item.getMaxDownloadsNumber()));
					ioBody.setExpiryDate(date);
					VendorInfo vendorInfo = vendorInfoService.getByCode(vendorCodes[i]);
					ioBody.setVendorId(vendorInfo.getVendorId());
					ioBodies.add(ioBody);
				}
			}
			state.setSyncStartDate(new Date());
			ioBodyService.saves(ioBodies);
		} catch (Exception e) {
			for (FileIOHead fileIOHead : ioHeads) {
				ioHeadService.delete(fileIOHead);
			}
			LOGGER.error(InterfaceStringUtils.VENDORFILEIO, e);
			state.setSyncEndDate(new Date());
			state.setOperationState(e.getMessage());
			stateService.save(state);
			result.setZtype('E');
			result.setZmessage(e.getMessage());
			return result;
		}
		LOGGER.info(InterfaceStringUtils.VENDORFILEIO);
		state.setSyncEndDate(new Date());
		state.setOperationState("编号:" + request.getJM3_Num() + "成功");
		stateService.save(state);
		result.setZtype('S');
		result.setZmessage("成功");
		return result;
	}
}
