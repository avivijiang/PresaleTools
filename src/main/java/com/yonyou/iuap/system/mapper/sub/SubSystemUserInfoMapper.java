package com.yonyou.iuap.system.mapper.sub;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yonyou.iuap.system.entity.SystemUserInfo;
import com.yonyou.iuap.system.mapper.SystemUserInfoMapper;

public interface SubSystemUserInfoMapper extends SystemUserInfoMapper{
	
	List<SystemUserInfo> queryUserInfo(@Param("index") int index,@Param("pageSize") int pageSize);

}
