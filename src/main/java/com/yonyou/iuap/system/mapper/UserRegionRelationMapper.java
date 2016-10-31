package com.yonyou.iuap.system.mapper;

import com.yonyou.iuap.system.entity.UserRegionRelation;
import com.yonyou.iuap.system.entity.UserRegionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRegionRelationMapper {
    int countByExample(UserRegionRelationExample example);

    int deleteByExample(UserRegionRelationExample example);

    int deleteByPrimaryKey(Long relationId);

    int insert(UserRegionRelation record);

    int insertSelective(UserRegionRelation record);

    List<UserRegionRelation> selectByExample(UserRegionRelationExample example);

    UserRegionRelation selectByPrimaryKey(Long relationId);

    int updateByExampleSelective(@Param("record") UserRegionRelation record, @Param("example") UserRegionRelationExample example);

    int updateByExample(@Param("record") UserRegionRelation record, @Param("example") UserRegionRelationExample example);

    int updateByPrimaryKeySelective(UserRegionRelation record);

    int updateByPrimaryKey(UserRegionRelation record);
}