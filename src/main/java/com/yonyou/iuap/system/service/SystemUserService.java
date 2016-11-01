package com.yonyou.iuap.system.service;

import com.yonyou.iuap.system.dto.UserPageDto;

public interface SystemUserService {

	public UserPageDto querUserInfoList(int pageIndex,int pageSize)throws Exception;
	
}
