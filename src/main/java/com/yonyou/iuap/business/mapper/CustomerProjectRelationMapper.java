package com.yonyou.iuap.business.mapper;

import com.yonyou.iuap.business.entity.CustomerProjectRelation;
import com.yonyou.iuap.business.entity.CustomerProjectRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerProjectRelationMapper {
    int countByExample(CustomerProjectRelationExample example);

    int deleteByExample(CustomerProjectRelationExample example);

    int deleteByPrimaryKey(Long relationId);

    int insert(CustomerProjectRelation record);

    int insertSelective(CustomerProjectRelation record);

    List<CustomerProjectRelation> selectByExample(CustomerProjectRelationExample example);

    CustomerProjectRelation selectByPrimaryKey(Long relationId);

    int updateByExampleSelective(@Param("record") CustomerProjectRelation record, @Param("example") CustomerProjectRelationExample example);

    int updateByExample(@Param("record") CustomerProjectRelation record, @Param("example") CustomerProjectRelationExample example);

    int updateByPrimaryKeySelective(CustomerProjectRelation record);

    int updateByPrimaryKey(CustomerProjectRelation record);
}