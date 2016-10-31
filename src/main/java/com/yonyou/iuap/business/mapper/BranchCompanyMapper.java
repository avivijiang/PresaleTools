package com.yonyou.iuap.business.mapper;

import com.yonyou.iuap.business.entity.BranchCompany;
import com.yonyou.iuap.business.entity.BranchCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BranchCompanyMapper {
    int countByExample(BranchCompanyExample example);

    int deleteByExample(BranchCompanyExample example);

    int deleteByPrimaryKey(Long branchId);

    int insert(BranchCompany record);

    int insertSelective(BranchCompany record);

    List<BranchCompany> selectByExample(BranchCompanyExample example);

    BranchCompany selectByPrimaryKey(Long branchId);

    int updateByExampleSelective(@Param("record") BranchCompany record, @Param("example") BranchCompanyExample example);

    int updateByExample(@Param("record") BranchCompany record, @Param("example") BranchCompanyExample example);

    int updateByPrimaryKeySelective(BranchCompany record);

    int updateByPrimaryKey(BranchCompany record);
}