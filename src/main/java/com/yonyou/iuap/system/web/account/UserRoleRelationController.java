package com.yonyou.iuap.system.web.account;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yonyou.iuap.common.entity.ResultDTO;
import com.yonyou.iuap.common.web.BaseController;
import com.yonyou.iuap.system.entity.UserRoleRelation;
import com.yonyou.iuap.system.service.UserRoleRelationService;

/**
 * user和role 关系管理
 */
@Controller
@RequestMapping(value = "/userRoleRelation")
public class UserRoleRelationController  extends BaseController{

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private UserRoleRelationService userRoleRelationService;
	
	/**
	 * 查询角色
	 * 
	 * @return
	 */
	@RequestMapping(value = "/query", method = RequestMethod.GET)
	@ResponseBody
	public ResultDTO queryRole(HttpServletRequest request) {
		List<UserRoleRelation> systemRoleLisr;
		try {
			systemRoleLisr = userRoleRelationService.selectByExample();
			return super.success(systemRoleLisr);
		} catch (Exception e) {
			logger.error("查询出错!");
			return super.error("查询出错!");
		}
	}
	
	/**
	 * 新增角色
	 * @param systemRole
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/createRole")
	@ResponseBody
	public ResultDTO createRole(@RequestBody UserRoleRelation userRoleRelation, HttpServletRequest request) {
		ResultDTO dto = new ResultDTO();
		try {
			userRoleRelationService.insertSelective(userRoleRelation);
			dto = super.successNoData("新增成功!");
		} catch (Exception e) {
			logger.error("新增出错!");
			dto = super.error("新增出错!");
		}
		return dto;
	}
	
	/**
	 * 删除
	 * @param systemRole
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/deleteRole")
	@ResponseBody
	public ResultDTO deleteRole (@RequestBody UserRoleRelation userRoleRelation, HttpServletRequest request){
		ResultDTO dto = new ResultDTO();
		try {
			userRoleRelationService.deleteByExample(userRoleRelation);
			dto = super.successNoData("删除成功!");
		} catch (Exception e) {
			logger.error("删除出错!");
			dto = super.error("删除出错!");
		}
		return dto;
	}
	
	/**
	 * 修改角色
	 * @param systemRole
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/updataRole")
	@ResponseBody
	public ResultDTO updataRole(@RequestBody UserRoleRelation userRoleRelation, HttpServletRequest request){
		ResultDTO dto = new ResultDTO();
		try {
			userRoleRelationService.updateByPrimaryKeySelective(userRoleRelation);
			dto = super.successNoData("修改成功!");
		} catch (Exception e) {
			logger.error("修改出错!");
			dto = super.error("修改出错!");
		}
		return dto;
	}
	
	
	
}
