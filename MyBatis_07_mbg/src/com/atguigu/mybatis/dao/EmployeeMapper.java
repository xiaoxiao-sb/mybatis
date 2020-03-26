package com.atguigu.mybatis.dao;

import com.atguigu.mybatis.bean.Employee;
import com.atguigu.mybatis.bean.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sssp_employees
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    int countByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sssp_employees
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    int deleteByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sssp_employees
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sssp_employees
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    int insert(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sssp_employees
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    int insertSelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sssp_employees
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    List<Employee> selectByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sssp_employees
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    Employee selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sssp_employees
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sssp_employees
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sssp_employees
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    int updateByPrimaryKeySelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sssp_employees
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    int updateByPrimaryKey(Employee record);
}