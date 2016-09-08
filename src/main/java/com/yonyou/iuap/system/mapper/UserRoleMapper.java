package com.yonyou.iuap.system.mapper;

import com.yonyou.iuap.persistence.mybatis.anotation.MyBatisRepository;
import com.yonyou.iuap.persistence.mybatis.mapper.PageMapper;
import com.yonyou.iuap.system.entity.UserRole;

@MyBatisRepository
public interface UserRoleMapper extends PageMapper<UserRole>{

	public UserRole findUserRoleByID(String ID);
	
}
