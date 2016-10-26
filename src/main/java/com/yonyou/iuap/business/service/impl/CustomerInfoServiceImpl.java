package com.yonyou.iuap.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonyou.iuap.business.entity.CustomerInfo;
import com.yonyou.iuap.business.entity.CustomerInfoExample;
import com.yonyou.iuap.business.mapper.sub.SubCustomerInfoMapper;
import com.yonyou.iuap.business.service.CustomerInfoService;

/**
 * 客户表操作
 * @author sangw
 *
 */
@Service("customerInfoService")
public class CustomerInfoServiceImpl implements CustomerInfoService{

	@Autowired
	private SubCustomerInfoMapper customerInfoMapper;
	
	/**
	 * 添加
	 * @param record
	 */
	public void insertSelective(CustomerInfo record)throws Exception{
		customerInfoMapper.insertSelective(record);
	}
	
	/**
	 * 查询
	 * @param example
	 * @return
	 */
	public List<CustomerInfo> selectByExample()throws Exception{
		CustomerInfoExample example = new CustomerInfoExample();
		return customerInfoMapper.selectByExample(example);
	}
	
	/**
	 * 修改
	 * @param record
	 */
	public void updateByPrimaryKeySelective(CustomerInfo record)throws Exception {
		customerInfoMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 删除
	 * @param example
	 */
	public void deleteByExample(CustomerInfo customerInfo)throws Exception {
		CustomerInfoExample example = new CustomerInfoExample();
		example.createCriteria().andCustomerIdEqualTo(customerInfo.getCustomerId());
//		example.createCriteria().andCustomerIdIn(values);
		customerInfoMapper.deleteByExample(example);
	}
	
}
