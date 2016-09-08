package com.yonyou.iuap.customer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonyou.iuap.customer.entity.SalesCustomers;
import com.yonyou.iuap.customer.mapper.sub.SubSalesCustomersMapper;
import com.yonyou.iuap.customer.service.ISalesCustomerService;

@Service("salesCustomerService")
public class SalesCustomerServiceImpl implements ISalesCustomerService {

	@Autowired
	SubSalesCustomersMapper subSalesCustomersMapper;

	@Override
	public void insertSalesCustomers(SalesCustomers salesCustomers) {
		subSalesCustomersMapper.insertSelective(salesCustomers);
	}

	@Override
	public List<SalesCustomers> queryAllSalesCustomers() {
		com.yonyou.iuap.customer.entity.SalesCustomersExample example = new com.yonyou.iuap.customer.entity.SalesCustomersExample();
		example.createCriteria();
		return subSalesCustomersMapper.selectByExample(example);
	}

}
