package com.yonyou.iuap.business.service;

import java.util.List;

import com.yonyou.iuap.business.entity.CustomerInfo;

public interface CustomerInfoService {
	
	public void insertSelective(CustomerInfo record)throws Exception;
	
	public List<CustomerInfo> selectByExample()throws Exception;
	
	public void updateByPrimaryKeySelective(CustomerInfo record)throws Exception;
	
	public void deleteByExample(CustomerInfo customerInfo)throws Exception;
	
}
