package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.DeptMapper;
import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Dept;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ResultMapTest {

    @Test
    public void testgetEmpByEmpId(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empByEmpId = mapper.getEmpByEmpId(1);
        System.out.println(empByEmpId);
    }

    @Test
    public void testgetEmpAndDeptByEmpId(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empByEmpId = mapper.getEmpAndDeptByEmpId(1);
        System.out.println(empByEmpId);
    }

    @Test
    public void testgetEmpAndDeptByEmpIdStep(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empByEmpId = mapper.getEmpAndDeptByEmpIdStep(2);
        System.out.println(empByEmpId.getEmpId());
    }

    @Test
    public void testgetDeptAndEmpByDeptId(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmpByDeptId = mapper.getDeptAndEmpByDeptId(1);
        System.out.println(deptAndEmpByDeptId);
    }


    @Test
    public void testgetDeptAndEmpByDeptIdStep(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmpByDeptId = mapper.getDeptAndEmpByDeptIdStep(1);
        System.out.println(deptAndEmpByDeptId);
    }



    @Test
    public void testgetEmpsByIf(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> res = mapper.getEmpsByIf(new Emp(null, "张三", 21, null));
        System.out.println(res);
    }



    @Test
    public void testinsertEmps(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp1 = new Emp(null, "张三1", 21, "男");
        Emp emp2 = new Emp(null, "张三2", 21, "男");
        Emp emp3 = new Emp(null, "张三3", 21, "男");
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3);
        mapper.insertEmps(emps);
    }


    @Test
    public void testdeleteEmps(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        mapper.deleteEmps(new Integer[]{6,7,8,9,10,11});
    }


}
