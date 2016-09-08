package com.yonyou.iuap.customer.mapper;

import com.yonyou.iuap.customer.entity.SalesCustomers;
import com.yonyou.iuap.customer.entity.SalesCustomersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesCustomersMapper {
    int countByExample(SalesCustomersExample example);

    int deleteByExample(SalesCustomersExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SalesCustomers record);

    int insertSelective(SalesCustomers record);

    List<SalesCustomers> selectByExample(SalesCustomersExample example);

    SalesCustomers selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SalesCustomers record, @Param("example") SalesCustomersExample example);

    int updateByExample(@Param("record") SalesCustomers record, @Param("example") SalesCustomersExample example);

    int updateByPrimaryKeySelective(SalesCustomers record);

    int updateByPrimaryKey(SalesCustomers record);
}