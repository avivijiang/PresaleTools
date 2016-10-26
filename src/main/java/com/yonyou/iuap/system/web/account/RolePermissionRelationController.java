package com.yonyou.iuap.system.web.account;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yonyou.iuap.common.entity.ResultDTO;
import com.yonyou.iuap.common.web.BaseController;
import com.yonyou.iuap.system.dto.RolePermissionRelationDto;
import com.yonyou.iuap.system.entity.RolePermissionRelation;
import com.yonyou.iuap.system.service.RolePermissionRelationService;

/**
 * 角色和权限关系管理
 * @author sangw
 *
 */
@Controller
@RequestMapping(value = "/rolePermissionRelation")
public class RolePermissionRelationController extends BaseController {

	@Autowired
	private RolePermissionRelationService rolePermissionRelationService;
	
	/**
	 * 查询
	 * 
	 * @return
	 */
	@RequestMapping(value = "/queryRole", method = RequestMethod.GET)
	@ResponseBody
	public ResultDTO queryRole(HttpServletRequest request) {
		List<RolePermissionRelation> rolePermissionRelationLisr;
		try {
			rolePermissionRelationLisr = rolePermissionRelationService.selectByExample();
			return super.success(rolePermissionRelationLisr);
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
	public ResultDTO createRole(@RequestBody RolePermissionRelation rolePermissionRelation, HttpServletRequest request) {
		ResultDTO dto = new ResultDTO();
		try {
			rolePermissionRelationService.insertSelective(rolePermissionRelation);
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
	public ResultDTO deleteRole (@RequestBody RolePermissionRelation rolePermissionRelation, HttpServletRequest request){
		ResultDTO dto = new ResultDTO();
		try {
			rolePermissionRelationService.deleteByExample(rolePermissionRelation);
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
//	@RequestMapping(value = "/update")
//	@ResponseBody
//	public ResultDTO update(@RequestBody RolePermissionRelation rolePermissionRelation, HttpServletRequest request){
//		ResultDTO dto = new ResultDTO();
//		try {
//			rolePermissionRelationService.updateByPrimaryKeySelective(rolePermissionRelation);
//			dto = super.successNoData("修改成功!");
//		} catch (Exception e) {
//			dto = super.error("修改出错!");
//		}
//		return dto;
//	}
	
	/**
	 * 设置角色权限
	 * @param systemRole
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/update")
	@ResponseBody
	public ResultDTO update(@RequestBody RolePermissionRelationDto rolePermissionRelationDto, HttpServletRequest request){
		ResultDTO dto = new ResultDTO();
		try {
			rolePermissionRelationService.update(rolePermissionRelationDto.getRoleId(), rolePermissionRelationDto.getPermissionIds());
			dto = super.successNoData("修改成功!");
		} catch (Exception e) {
			dto = super.error("修改出错!");
		}
		return dto;
	}
	
}
