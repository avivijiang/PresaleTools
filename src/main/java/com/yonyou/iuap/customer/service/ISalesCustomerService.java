package com.yonyou.iuap.customer.service;

import java.util.List;

import com.yonyou.iuap.customer.entity.SalesCustomers;

/**
 * 客戶档案服务
 * 
 * @author chiyi
 *
 */
public interface ISalesCustomerService {

	/**
	 * 创建客户档案
	 * 
	 * @param salesCustomers
	 */
	public void insertSalesCustomers(SalesCustomers salesCustomers);

	/**
	 * 查詢所有客戶檔案
	 * 
	 * @return
	 */
	public List<SalesCustomers> queryAllSalesCustomers();

}
