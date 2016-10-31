package com.yonyou.iuap.system.service;

import java.util.List;

import com.yonyou.iuap.system.entity.SystemRole;

public interface SystemRoleService {

	public void insertSelective(SystemRole record)throws Exception ;

	public List<SystemRole> queryAllSalesCustomers()throws Exception ;

	public void updateByPrimaryKeySelective(SystemRole record)throws Exception ;

	public void deleteByExample(SystemRole example)throws Exception ;

}
