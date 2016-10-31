package com.yonyou.iuap.system.web.account;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
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
import com.yonyou.iuap.system.entity.SystemRole;
import com.yonyou.iuap.system.service.SystemRoleService;

/**
 * 角色管理
 * @author sangw
 *
 */
@Controller
@RequestMapping(value = "/sysRole")
public class SystemRoleController extends BaseController {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private SystemRoleService systemRoleService;

	/**
	 * 查询角色
	 * 
	 * @return
	 */
	@RequiresPermissions(value={"role:query"})
	@RequestMapping(value = "/queryRole", method = RequestMethod.GET)
	@ResponseBody
	public ResultDTO queryRole(HttpServletRequest request) {
		List<SystemRole> systemRoleLisr;
		try {
			systemRoleLisr = systemRoleService.queryAllSalesCustomers();
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
	@RequiresPermissions(value={"role:add"})
	@RequestMapping(value = "/createRole")
	@ResponseBody
	public ResultDTO createRole(@RequestBody SystemRole systemRole, HttpServletRequest request) {
		ResultDTO dto = new ResultDTO();
		try {
			systemRoleService.insertSelective(systemRole);
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
	@RequiresPermissions(value={"role:delete"})
	@RequestMapping(value = "/deleteRole")
	@ResponseBody
	public ResultDTO deleteRole (@RequestBody SystemRole systemRole, HttpServletRequest request){
		ResultDTO dto = new ResultDTO();
		try {
			systemRoleService.deleteByExample(systemRole);
			dto = super.successNoData("删除成功!");
		} catch (Exception e) {
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
	@RequiresPermissions(value={"role:update"})
	@RequestMapping(value = "/updataRole")
	@ResponseBody
	public ResultDTO updateRole(@RequestBody SystemRole systemRole, HttpServletRequest request){
		ResultDTO dto = new ResultDTO();
		try {
			systemRoleService.updateByPrimaryKeySelective(systemRole);
			dto = super.successNoData("修改成功!");
		} catch (Exception e) {
			dto = super.error("修改出错!");
		}
		return dto;
	}

}
