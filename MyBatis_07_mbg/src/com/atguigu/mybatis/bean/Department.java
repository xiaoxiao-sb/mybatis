package com.atguigu.mybatis.bean;

public class Department {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sssp_departments.id
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sssp_departments.department_name
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    private String departmentName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sssp_departments.id
     *
     * @return the value of sssp_departments.id
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sssp_departments.id
     *
     * @param id the value for sssp_departments.id
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sssp_departments.department_name
     *
     * @return the value of sssp_departments.department_name
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sssp_departments.department_name
     *
     * @param departmentName the value for sssp_departments.department_name
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }
}