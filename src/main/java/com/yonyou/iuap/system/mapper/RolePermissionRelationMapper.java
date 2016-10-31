package com.yonyou.iuap.system.mapper;

import com.yonyou.iuap.system.entity.RolePermissionRelation;
import com.yonyou.iuap.system.entity.RolePermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePermissionRelationMapper {
    int countByExample(RolePermissionRelationExample example);

    int deleteByExample(RolePermissionRelationExample example);

    int deleteByPrimaryKey(Long rolePermissionId);

    int insert(RolePermissionRelation record);

    int insertSelective(RolePermissionRelation record);

    List<RolePermissionRelation> selectByExample(RolePermissionRelationExample example);

    RolePermissionRelation selectByPrimaryKey(Long rolePermissionId);

    int updateByExampleSelective(@Param("record") RolePermissionRelation record, @Param("example") RolePermissionRelationExample example);

    int updateByExample(@Param("record") RolePermissionRelation record, @Param("example") RolePermissionRelationExample example);

    int updateByPrimaryKeySelective(RolePermissionRelation record);

    int updateByPrimaryKey(RolePermissionRelation record);
    
    int delBatch(Long roleId);
}