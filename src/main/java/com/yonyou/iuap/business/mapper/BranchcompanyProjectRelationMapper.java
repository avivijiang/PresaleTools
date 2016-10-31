package com.yonyou.iuap.business.mapper;

import com.yonyou.iuap.business.entity.BranchcompanyProjectRelation;
import com.yonyou.iuap.business.entity.BranchcompanyProjectRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BranchcompanyProjectRelationMapper {
    int countByExample(BranchcompanyProjectRelationExample example);

    int deleteByExample(BranchcompanyProjectRelationExample example);

    int deleteByPrimaryKey(Long relationId);

    int insert(BranchcompanyProjectRelation record);

    int insertSelective(BranchcompanyProjectRelation record);

    List<BranchcompanyProjectRelation> selectByExample(BranchcompanyProjectRelationExample example);

    BranchcompanyProjectRelation selectByPrimaryKey(Long relationId);

    int updateByExampleSelective(@Param("record") BranchcompanyProjectRelation record, @Param("example") BranchcompanyProjectRelationExample example);

    int updateByExample(@Param("record") BranchcompanyProjectRelation record, @Param("example") BranchcompanyProjectRelationExample example);

    int updateByPrimaryKeySelective(BranchcompanyProjectRelation record);

    int updateByPrimaryKey(BranchcompanyProjectRelation record);
}