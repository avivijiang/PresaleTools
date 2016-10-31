package com.yonyou.iuap.business.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yonyou.iuap.business.dto.PageList;
import com.yonyou.iuap.business.service.ProjectInformationService;
import com.yonyou.iuap.common.entity.ResultDTO;
import com.yonyou.iuap.common.web.BaseController;

/**
 * 项目
 * 
 * @author sangw
 *
 */
@Controller
@RequestMapping(value = "/project")
public class ProjectInfomationController  extends BaseController   {

	@Autowired
	private ProjectInformationService projectInformationService;

	/**
	 * 分页
	 * @param request
	 * @param pageNumber
	 * @param pageSize
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/query", method = RequestMethod.GET)
	public ResultDTO query(HttpServletRequest request,
			@RequestParam(value = "pageIndex", defaultValue = "0") int pageNumber,
			@RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
			@RequestParam(value = "regionId", defaultValue = "1") long regionId) {
		try {
			PageList pageList = projectInformationService.querPage(pageNumber,pageSize,regionId);
			return super.success(pageList);
		} catch (Exception e) {
			logger.error("查询出错!");
			return super.error("查询出错!");
		}
	}

}
