package com.yonyou.iuap.auth;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.yonyou.iuap.auth.shiro.StatelessRealm;
import com.yonyou.iuap.system.entity.SystemPermission;
import com.yonyou.iuap.system.service.SystemPermissionCheckService;

/**
 * Created by John Liu on 10/21/2016.
 */
public class AuthRealm extends StatelessRealm {

	@Autowired
	private SystemPermissionCheckService systemPermissionCheckService;
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String loginName =  (String) principals.getPrimaryPrincipal();
		//查询当前登录人的权限
		List<SystemPermission> list = systemPermissionCheckService.queryUserPermission(loginName);
		Set<String> stringPermissions = new HashSet<String>();
		if (!list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				stringPermissions.add(list.get(i).getPermissionCode());
			}
		}
		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
		simpleAuthorizationInfo.setStringPermissions(stringPermissions);
		return simpleAuthorizationInfo;
	}
}
