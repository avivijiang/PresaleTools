package com.yonyou.iuap.business.mapper;

import com.yonyou.iuap.business.entity.RegionBranchRelation;
import com.yonyou.iuap.business.entity.RegionBranchRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegionBranchRelationMapper {
    int countByExample(RegionBranchRelationExample example);

    int deleteByExample(RegionBranchRelationExample example);

    int deleteByPrimaryKey(Long relationId);

    int insert(RegionBranchRelation record);

    int insertSelective(RegionBranchRelation record);

    List<RegionBranchRelation> selectByExample(RegionBranchRelationExample example);

    RegionBranchRelation selectByPrimaryKey(Long relationId);

    int updateByExampleSelective(@Param("record") RegionBranchRelation record, @Param("example") RegionBranchRelationExample example);

    int updateByExample(@Param("record") RegionBranchRelation record, @Param("example") RegionBranchRelationExample example);

    int updateByPrimaryKeySelective(RegionBranchRelation record);

    int updateByPrimaryKey(RegionBranchRelation record);
}