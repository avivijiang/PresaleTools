package com.yonyou.iuap.business.mapper;

import com.yonyou.iuap.business.entity.ProjectFollow;
import com.yonyou.iuap.business.entity.ProjectFollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectFollowMapper {
    int countByExample(ProjectFollowExample example);

    int deleteByExample(ProjectFollowExample example);

    int deleteByPrimaryKey(Long followId);

    int insert(ProjectFollow record);

    int insertSelective(ProjectFollow record);

    List<ProjectFollow> selectByExample(ProjectFollowExample example);

    ProjectFollow selectByPrimaryKey(Long followId);

    int updateByExampleSelective(@Param("record") ProjectFollow record, @Param("example") ProjectFollowExample example);

    int updateByExample(@Param("record") ProjectFollow record, @Param("example") ProjectFollowExample example);

    int updateByPrimaryKeySelective(ProjectFollow record);

    int updateByPrimaryKey(ProjectFollow record);
}