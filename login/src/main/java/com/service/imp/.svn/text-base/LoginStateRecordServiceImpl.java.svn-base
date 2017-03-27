package com.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.dao.LoginStateRecordDao;
import com.service.info.LoginStateRecordService;
import com.service.pojo.UserInfo;
@Transactional
@Service("loginStateRecordService")
public class LoginStateRecordServiceImpl implements LoginStateRecordService{

	@Autowired
	private LoginStateRecordDao loginStateRecordDao;


	@Override
	public void flush() {
		loginStateRecordDao.flush();
	}



	@Override
	public UserInfo selectUser(String username, String passwd) {
		// TODO Auto-generated method stub
		List<UserInfo> list=loginStateRecordDao.checkUserInfo(username, passwd);
		if(list!=null&&list.size()>0)
		return list.get(0);
		else
			return null;
	}



	@Override
	public UserInfo selectWebUser(String username, String passwd) {
		// TODO Auto-generated method stub
		List<UserInfo> list=loginStateRecordDao.checkWebUserInfo(username, passwd);
		if(list!=null&&list.size()>0)
		return list.get(0);
		else
			return null;
	}



	

}
