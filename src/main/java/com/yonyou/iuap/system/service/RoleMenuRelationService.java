package com.yonyou.iuap.system.service;

import java.util.List;

import com.yonyou.iuap.system.entity.RoleMenuRelation;
import com.yonyou.iuap.system.entity.SystemMenu;

public interface RoleMenuRelationService {

	public void insertSelective(RoleMenuRelation record)throws Exception;
	
	public List<RoleMenuRelation> selectByExample()throws Exception;
	
	public void updateByPrimaryKeySelective(RoleMenuRelation record)throws Exception;
	
	public void deleteByExample(RoleMenuRelation roleMenuRelation)throws Exception;
	
	public List<SystemMenu> queryRoleMenu(String loginName)throws Exception;
	
}
