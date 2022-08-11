package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    Dept getDeptByDeptId(@Param("deptId") Integer deptId);

    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);

    Dept getDeptAndEmpByDeptIdStep(@Param("deptId") Integer deptId);
}
