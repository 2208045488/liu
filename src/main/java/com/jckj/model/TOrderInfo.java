package com.jckj.model;

public class TOrderInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_info.id
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_info.user_id
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private String user_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_info.enroll_id
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private String enroll_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_info.student_id
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private String student_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_info.school_name
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private String school_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_info.is_delete
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private Boolean is_delete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_info.create_time
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private Long create_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_info.update_time
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private Long update_time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_info.id
     *
     * @return the value of t_order_info.id
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_info.id
     *
     * @param id the value for t_order_info.id
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_info.user_id
     *
     * @return the value of t_order_info.user_id
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_info.user_id
     *
     * @param user_id the value for t_order_info.user_id
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id == null ? null : user_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_info.enroll_id
     *
     * @return the value of t_order_info.enroll_id
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public String getEnroll_id() {
        return enroll_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_info.enroll_id
     *
     * @param enroll_id the value for t_order_info.enroll_id
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setEnroll_id(String enroll_id) {
        this.enroll_id = enroll_id == null ? null : enroll_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_info.student_id
     *
     * @return the value of t_order_info.student_id
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public String getStudent_id() {
        return student_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_info.student_id
     *
     * @param student_id the value for t_order_info.student_id
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setStudent_id(String student_id) {
        this.student_id = student_id == null ? null : student_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_info.school_name
     *
     * @return the value of t_order_info.school_name
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public String getSchool_name() {
        return school_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_info.school_name
     *
     * @param school_name the value for t_order_info.school_name
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setSchool_name(String school_name) {
        this.school_name = school_name == null ? null : school_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_info.is_delete
     *
     * @return the value of t_order_info.is_delete
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public Boolean getIs_delete() {
        return is_delete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_info.is_delete
     *
     * @param is_delete the value for t_order_info.is_delete
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setIs_delete(Boolean is_delete) {
        this.is_delete = is_delete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_info.create_time
     *
     * @return the value of t_order_info.create_time
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public Long getCreate_time() {
        return create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_info.create_time
     *
     * @param create_time the value for t_order_info.create_time
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_info.update_time
     *
     * @return the value of t_order_info.update_time
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public Long getUpdate_time() {
        return update_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_info.update_time
     *
     * @param update_time the value for t_order_info.update_time
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setUpdate_time(Long update_time) {
        this.update_time = update_time;
    }
}