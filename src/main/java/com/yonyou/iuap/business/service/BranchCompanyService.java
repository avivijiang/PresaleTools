package com.yonyou.iuap.business.service;

import java.util.List;

import com.yonyou.iuap.business.entity.BranchCompany;

public interface BranchCompanyService {

	public void insertSelective(BranchCompany record)throws Exception;
	
	public List<BranchCompany> selectByExample()throws Exception;
	
	public void updateByPrimaryKeySelective(BranchCompany record)throws Exception;
	
	public void deleteByExample(BranchCompany customerInfo)throws Exception;
	
	
}
