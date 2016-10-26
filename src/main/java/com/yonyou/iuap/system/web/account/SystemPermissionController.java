package com.yonyou.iuap.system.web.account;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yonyou.iuap.common.entity.ResultDTO;
import com.yonyou.iuap.common.web.BaseController;
import com.yonyou.iuap.system.entity.SystemPermission;
import com.yonyou.iuap.system.service.SystemPermissionCheckService;
import com.yonyou.iuap.system.service.SystemPermissionService;

/**
 * 权限管理
 * @author sangw
 *
 */
@Controller
@RequestMapping(value = "/sysPermission")
public class SystemPermissionController  extends BaseController {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private SystemPermissionService systemPermissionService;
	
	@Autowired
	private SystemPermissionCheckService systemPermissionCheckService;
	
	/**
	 * 查询
	 * 
	 * @return
	 */
	@RequestMapping(value = "/query", method = RequestMethod.GET)
	@ResponseBody
	public ResultDTO query(HttpServletRequest request) {
		List<SystemPermission> systemPermissionLisr;
		try {
			systemPermissionLisr = systemPermissionService.selectByExample();
			return super.success(systemPermissionLisr);
		} catch (Exception e) {
			logger.error("查询出错!");
			return super.error("查询出错!");
		}
	}
	
	/**
	 * 新增
	 * @param systemRole
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/createRole")
	@ResponseBody
	public ResultDTO createRole(@RequestBody SystemPermission systemPermission, HttpServletRequest request) {
		ResultDTO dto = new ResultDTO();
		try {
			systemPermissionService.insertSelective(systemPermission);
			dto = super.successNoData("新增成功!");
		} catch (Exception e) {
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
	public ResultDTO deleteRole (@RequestBody SystemPermission systemPermission, HttpServletRequest request){
		ResultDTO dto = new ResultDTO();
		try {
			systemPermissionService.deleteByExample(systemPermission);
			dto = super.successNoData("删除成功!");
		} catch (Exception e) {
			dto = super.error("删除出错!");
		}
		return dto;
	}
	
	/**
	 * 修改
	 * @param systemRole
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/updataRole")
	@ResponseBody
	public ResultDTO updataRole(@RequestBody SystemPermission systemPermission, HttpServletRequest request){
		ResultDTO dto = new ResultDTO();
		try {
			systemPermissionService.updateByPrimaryKeySelective(systemPermission);
			dto = super.successNoData("修改成功!");
		} catch (Exception e) {
			dto = super.error("修改出错!");
		}
		return dto;
	}
	
	/**
	 * 按用户主键查询当前用户的所有权限
	 * 
	 * @return
	 */
	@RequestMapping(value = "/queryId/{roleId}", method = RequestMethod.GET)
	@ResponseBody
	public ResultDTO queryId(@PathVariable("roleId") Long roleId ,HttpServletRequest request) {
		List<SystemPermission> systemPermissionLisr;
		try {
			systemPermissionLisr = systemPermissionCheckService.queryPermissionByRoleId(roleId);
			return super.success(systemPermissionLisr);
		} catch (Exception e) {
			logger.error("查询出错!");
			return super.error("查询出错!");
		}
	}
	
}
