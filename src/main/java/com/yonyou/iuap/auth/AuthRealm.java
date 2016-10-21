package com.yonyou.iuap.auth;

import com.yonyou.iuap.auth.shiro.StatelessRealm;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * Created by John Liu on 10/21/2016.
 */
public class AuthRealm extends StatelessRealm {

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        // TODO 获取角色权限
        return super.doGetAuthorizationInfo(principals);
    }
}
