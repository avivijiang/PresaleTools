package com.yonyou.iuap.business.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yonyou.iuap.business.dto.RegionAndRoles;
import com.yonyou.iuap.business.entity.RegionInfo;
import com.yonyou.iuap.business.service.RegionAndBranchService;
import com.yonyou.iuap.common.entity.ResultDTO;
import com.yonyou.iuap.common.web.BaseController;

/**
 * 大区
 * @author sangw
 *
 */
@Controller
@RequestMapping(value = "/region")
public class RegionInfoController extends BaseController  {
	
	@Autowired
	private RegionAndBranchService regionAndBranchService;

	/**
	 * 查询所有大区
	 * 
	 * @return
	 */
	@RequestMapping(value = "/query", method = RequestMethod.GET)
	@ResponseBody
	public ResultDTO query(HttpServletRequest request) {
		List<RegionInfo> regionInfoLisr;
		try {
			regionInfoLisr = regionAndBranchService.selectByExample();
			return super.success(regionInfoLisr);
		} catch (Exception e) {
			logger.error("查询出错!");
			return super.error("查询出错!");
		}
	}
	
	/**
	 * 查询所有大区和角色
	 * 
	 * @return
	 */
	@RequestMapping(value = "/queryRole", method = RequestMethod.GET)
	@ResponseBody
	public ResultDTO queryRole(HttpServletRequest request) {
		RegionAndRoles regionAndRoles;
		try {
			regionAndRoles = regionAndBranchService.selectAllRegionAndRole();
			return super.success(regionAndRoles);
		} catch (Exception e) {
			logger.error("查询出错!");
			return super.error("查询出错!");
		}
	}
	
}
