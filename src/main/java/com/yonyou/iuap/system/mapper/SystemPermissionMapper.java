package com.yonyou.iuap.system.mapper;

import com.yonyou.iuap.system.entity.SystemPermission;
import com.yonyou.iuap.system.entity.SystemPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemPermissionMapper {
    int countByExample(SystemPermissionExample example);

    int deleteByExample(SystemPermissionExample example);

    int deleteByPrimaryKey(Long permissionId);

    int insert(SystemPermission record);

    int insertSelective(SystemPermission record);

    List<SystemPermission> selectByExample(SystemPermissionExample example);

    SystemPermission selectByPrimaryKey(Long permissionId);

    int updateByExampleSelective(@Param("record") SystemPermission record, @Param("example") SystemPermissionExample example);

    int updateByExample(@Param("record") SystemPermission record, @Param("example") SystemPermissionExample example);

    int updateByPrimaryKeySelective(SystemPermission record);

    int updateByPrimaryKey(SystemPermission record);
}