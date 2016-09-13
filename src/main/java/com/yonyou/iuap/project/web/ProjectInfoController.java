package com.yonyou.iuap.project.web;

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
import com.yonyou.iuap.customer.service.ISalesCustomerService;
import com.yonyou.iuap.project.entity.ProjectInfo;
import com.yonyou.iuap.project.service.IProjectInfoService;

@RestController
@RequestMapping(value = "/projectInfo")
public class ProjectInfoController extends BaseController{
	
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	IProjectInfoService projectInfoService;
	
	@Autowired
	ISalesCustomerService saleCustomerService;
	
	/**
	 * 查询所有项目
	 * @return
	 */
	@RequestMapping(value = "/queryAll", method = RequestMethod.GET)
	@ResponseBody
	public ResultDTO queryAllProjectInfo() {
		List<ProjectInfo> projectLisr = projectInfoService.queryAllProjectInfo();
//		List<SalesCustomers> customersList = saleCustomerService.queryAllSalesCustomers();
//		List<ProjectWithCustomer> list = new ArrayList<ProjectWithCustomer>();
//		ProjectWithCustomer prc;
//		for (int i = 0; i < projectLisr.size(); i++) {
//			prc = new ProjectWithCustomer();
//			for (int j = 0; j < customersList.size(); j++) {
//				if(projectLisr.get(i).getClientId()==customersList.get(j).getId()){
//					prc.setProjectInfo(projectLisr.get(i));
//					prc.setSalesCustomers(customersList.get(j));
//				}
//			}
//			list.add(prc);
//		}
//		return super.success(list);
		return super.success(projectLisr);
	}
	
}
