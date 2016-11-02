package com.yonyou.iuap.system.web.account;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yonyou.iuap.auth.shiro.AuthConstants;
import com.yonyou.iuap.common.entity.ResultDTO;
import com.yonyou.iuap.common.web.BaseController;
import com.yonyou.iuap.system.entity.SystemMenu;
import com.yonyou.iuap.system.service.RoleMenuRelationService;
import com.yonyou.iuap.utils.CookieUtil;

@Controller
@RequestMapping(value = "/roleMenu")
public class RoleMenuController  extends BaseController{

	@Autowired
	private RoleMenuRelationService roleMenuRelationService;
	
	/**
	 * 查询当前登录人的菜单
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/queryMenu", method = RequestMethod.GET)
	@ResponseBody
	public ResultDTO queryMenu(HttpServletRequest request) {
		List<SystemMenu> systemMenuList;
		try {
			//获取当前登录人的登录名
			String loginName = CookieUtil.findCookieValue(request.getCookies(),AuthConstants.PARAM_USERNAME);
			if (StringUtils.isEmpty(loginName)) {
				return super.error("当前登录人获取错误!");
			}
			systemMenuList = roleMenuRelationService.queryRoleMenu(loginName);
			return super.success(systemMenuList);
		} catch (Exception e) {
			logger.error("查询出错!");
			return super.error("查询出错!");
		}
	}
	
	/**
	 * 查询所有菜单
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/queryAllMenu", method = RequestMethod.GET)
	@ResponseBody
	public ResultDTO queryAllMenu(HttpServletRequest request) {
		List<SystemMenu> systemMenuList;
		try {
			systemMenuList = roleMenuRelationService.queryAllMenu();
			return super.success(systemMenuList);
		} catch (Exception e) {
			logger.error("查询出错!");
			return super.error("查询出错!");
		}
	}
	
	
	
}
