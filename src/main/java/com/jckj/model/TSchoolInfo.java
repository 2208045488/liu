package com.jckj.model;

public class TSchoolInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_school_info.id
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_school_info.school_name
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private String school_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_school_info.school_address
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private String school_address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_school_info.school_introduce
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private String school_introduce;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_school_info.school_phone
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private String school_phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_school_info.school_photo
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private String school_photo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_school_info.is_delete
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private Boolean is_delete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_school_info.create_time
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private Long create_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_school_info.update_time
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private Long update_time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_school_info.id
     *
     * @return the value of t_school_info.id
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_school_info.id
     *
     * @param id the value for t_school_info.id
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_school_info.school_name
     *
     * @return the value of t_school_info.school_name
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public String getSchool_name() {
        return school_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_school_info.school_name
     *
     * @param school_name the value for t_school_info.school_name
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setSchool_name(String school_name) {
        this.school_name = school_name == null ? null : school_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_school_info.school_address
     *
     * @return the value of t_school_info.school_address
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public String getSchool_address() {
        return school_address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_school_info.school_address
     *
     * @param school_address the value for t_school_info.school_address
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setSchool_address(String school_address) {
        this.school_address = school_address == null ? null : school_address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_school_info.school_introduce
     *
     * @return the value of t_school_info.school_introduce
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public String getSchool_introduce() {
        return school_introduce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_school_info.school_introduce
     *
     * @param school_introduce the value for t_school_info.school_introduce
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setSchool_introduce(String school_introduce) {
        this.school_introduce = school_introduce == null ? null : school_introduce.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_school_info.school_phone
     *
     * @return the value of t_school_info.school_phone
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public String getSchool_phone() {
        return school_phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_school_info.school_phone
     *
     * @param school_phone the value for t_school_info.school_phone
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setSchool_phone(String school_phone) {
        this.school_phone = school_phone == null ? null : school_phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_school_info.school_photo
     *
     * @return the value of t_school_info.school_photo
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public String getSchool_photo() {
        return school_photo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_school_info.school_photo
     *
     * @param school_photo the value for t_school_info.school_photo
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setSchool_photo(String school_photo) {
        this.school_photo = school_photo == null ? null : school_photo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_school_info.is_delete
     *
     * @return the value of t_school_info.is_delete
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public Boolean getIs_delete() {
        return is_delete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_school_info.is_delete
     *
     * @param is_delete the value for t_school_info.is_delete
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setIs_delete(Boolean is_delete) {
        this.is_delete = is_delete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_school_info.create_time
     *
     * @return the value of t_school_info.create_time
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public Long getCreate_time() {
        return create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_school_info.create_time
     *
     * @param create_time the value for t_school_info.create_time
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_school_info.update_time
     *
     * @return the value of t_school_info.update_time
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public Long getUpdate_time() {
        return update_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_school_info.update_time
     *
     * @param update_time the value for t_school_info.update_time
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setUpdate_time(Long update_time) {
        this.update_time = update_time;
    }
}