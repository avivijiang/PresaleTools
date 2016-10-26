package com.yonyou.iuap.business.mapper;

import com.yonyou.iuap.business.entity.ProjectInformation;
import com.yonyou.iuap.business.entity.ProjectInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectInformationMapper {
    int countByExample(ProjectInformationExample example);

    int deleteByExample(ProjectInformationExample example);

    int deleteByPrimaryKey(Long projectId);

    int insert(ProjectInformation record);

    int insertSelective(ProjectInformation record);

    List<ProjectInformation> selectByExample(ProjectInformationExample example);

    ProjectInformation selectByPrimaryKey(Long projectId);

    int updateByExampleSelective(@Param("record") ProjectInformation record, @Param("example") ProjectInformationExample example);

    int updateByExample(@Param("record") ProjectInformation record, @Param("example") ProjectInformationExample example);

    int updateByPrimaryKeySelective(ProjectInformation record);

    int updateByPrimaryKey(ProjectInformation record);
}