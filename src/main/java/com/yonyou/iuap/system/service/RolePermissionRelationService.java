package com.yonyou.iuap.system.service;

import java.util.List;

import com.yonyou.iuap.system.entity.RolePermissionRelation;

public interface RolePermissionRelationService {

	public void insertSelective(RolePermissionRelation record)throws Exception;
	
	public List<RolePermissionRelation> selectByExample()throws Exception;
	
	public void updateByPrimaryKeySelective(RolePermissionRelation record)throws Exception;
	
	public void deleteByExample(RolePermissionRelation rolePermissionRelation)throws Exception;
	
}
