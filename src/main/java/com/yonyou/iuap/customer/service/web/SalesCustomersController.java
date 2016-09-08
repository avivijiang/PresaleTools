package com.yonyou.iuap.customer.service.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.iuap.common.entity.ResultDTO;
import com.yonyou.iuap.common.web.BaseController;
import com.yonyou.iuap.customer.entity.SalesCustomers;
import com.yonyou.iuap.customer.service.ISalesCustomerService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping(value = "/salescustomers")
public class SalesCustomersController extends BaseController {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	ISalesCustomerService saleCustomerService;

	@RequestMapping(value = "/query", method = RequestMethod.GET)
	@ResponseBody
	public ResultDTO queryAllSalesCustomers() {
		List<SalesCustomers> salesCustomersLisr = saleCustomerService.queryAllSalesCustomers();
		return super.success(salesCustomersLisr);
	}

	@RequestMapping(value = "/error", method = RequestMethod.GET)
	@ResponseBody
	public Object queryAllSalesCustomersWithoutResultDTO() {
		JSONObject result = new JSONObject();
		result.put("message", "error");
		result.put("success", "false");
		return error("data error!");
	}
}
