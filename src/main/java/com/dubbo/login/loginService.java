package com.dubbo.login;

import com.dubbo.bean.UserInfoBean;
import com.service.pojo.UserInfo;

public interface loginService {
	
  
    
    public UserInfoBean loginCheck(UserInfoBean info);
    
    public UserInfoBean webloginCheck(UserInfoBean info);
    
}