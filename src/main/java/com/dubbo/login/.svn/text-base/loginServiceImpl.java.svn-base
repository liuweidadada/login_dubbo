package com.dubbo.login;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;

import com.dubbo.bean.UserInfoBean;
import com.service.dao.LoginStateRecordDao;
import com.service.info.LoginStateRecordService;
import com.service.pojo.UserInfo;


public class loginServiceImpl implements loginService{
	@Autowired
	private LoginStateRecordService loginStateRecordService;
	@Override
	public UserInfoBean loginCheck(UserInfoBean info) {
		// TODO Auto-generated method stub
		UserInfoBean uib=null;
		UserInfo bm=null;
		if(info!=null){
			System.out.println("------------INNNNNNN--------------");
		bm=loginStateRecordService.selectUser(info.getName(), new String(Base64.encodeBase64(info.getPassword().getBytes())));
		}else
		System.out.println("----------空-----------------");
		if(bm!=null){
		uib=new UserInfoBean();
		uib.setCheck(true);
		bm.setPsn_pwd("");
		uib.setInfo(bm);
		uib.setName(bm.getPsn_name());
		uib.setPassword("");
		uib.setUserid(bm.getPsn_id());
		uib.setUseraccount(bm.getPsn_account());
		if(bm.getTenant_org_service_id().equals("1"))
		uib.setManager(true);
		else 
		uib.setManager(false);
		}
		return uib;
	}
	@Override
	public UserInfoBean webloginCheck(UserInfoBean info) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		UserInfoBean uib=null;
		UserInfo bm=null;
		if(info!=null){
			System.out.println("------------INNNNNNN--------------");
		bm=loginStateRecordService.selectWebUser(info.getName(),new String(Base64.encodeBase64(info.getPassword().getBytes())) );
		}else
		System.out.println("----------空-----------------");
		if(bm!=null){
		uib=new UserInfoBean();
		uib.setCheck(true);
		bm.setPsn_pwd("");
		uib.setInfo(bm);
		uib.setName(bm.getPsn_name());
		uib.setPassword("");
		uib.setUserid(bm.getPsn_id());
		uib.setManager(true);
		}
		return uib;
	
	}

	
}