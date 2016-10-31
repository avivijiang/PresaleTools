package com.yonyou.iuap.system.service;

import java.util.List;

import com.yonyou.iuap.system.entity.UserRoleRelation;

public interface UserRoleRelationService {

	public void insertSelective(UserRoleRelation record) throws Exception;

	public List<UserRoleRelation> selectByExample() throws Exception;

	public void updateByPrimaryKeySelective(UserRoleRelation record) throws Exception;

	public void deleteByExample(UserRoleRelation userRoleRelation) throws Exception;

}
