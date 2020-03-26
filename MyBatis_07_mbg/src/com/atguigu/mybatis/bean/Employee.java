package com.atguigu.mybatis.bean;

import java.util.Date;

public class Employee {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sssp_employees.id
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sssp_employees.birth
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    private Date birth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sssp_employees.create_time
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sssp_employees.email
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sssp_employees.last_name
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    private String lastName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sssp_employees.department_id
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    private Integer departmentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sssp_employees.id
     *
     * @return the value of sssp_employees.id
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sssp_employees.id
     *
     * @param id the value for sssp_employees.id
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sssp_employees.birth
     *
     * @return the value of sssp_employees.birth
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sssp_employees.birth
     *
     * @param birth the value for sssp_employees.birth
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sssp_employees.create_time
     *
     * @return the value of sssp_employees.create_time
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sssp_employees.create_time
     *
     * @param createTime the value for sssp_employees.create_time
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sssp_employees.email
     *
     * @return the value of sssp_employees.email
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sssp_employees.email
     *
     * @param email the value for sssp_employees.email
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sssp_employees.last_name
     *
     * @return the value of sssp_employees.last_name
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sssp_employees.last_name
     *
     * @param lastName the value for sssp_employees.last_name
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sssp_employees.department_id
     *
     * @return the value of sssp_employees.department_id
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sssp_employees.department_id
     *
     * @param departmentId the value for sssp_employees.department_id
     *
     * @mbggenerated Thu Mar 26 13:45:36 CST 2020
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
}