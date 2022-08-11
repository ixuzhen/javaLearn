package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    Emp getEmpByEmpId(@Param("id") Integer id);

    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    Emp getEmpAndDeptByEmpIdStep(@Param("empId") Integer empId);

    List<Emp> getEmpsByDeptId(@Param("deptId") Integer deptId);

    List<Emp> getEmpsByIf( Emp emp);
    //List<Emp> getEmpsByIf(@Param("emp") Emp emp);

    void insertEmps(@Param("emps") List<Emp> emps);

    void deleteEmps(@Param("empIds") Integer[] empIds);
}
