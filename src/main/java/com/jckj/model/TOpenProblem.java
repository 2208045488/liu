package com.jckj.model;

public class TOpenProblem {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_open_problem.id
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_open_problem.problem
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private String problem;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_open_problem.is_delete
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private Boolean is_delete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_open_problem.create_time
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private Long create_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_open_problem.update_time
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private Long update_time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_open_problem.id
     *
     * @return the value of t_open_problem.id
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_open_problem.id
     *
     * @param id the value for t_open_problem.id
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_open_problem.problem
     *
     * @return the value of t_open_problem.problem
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public String getProblem() {
        return problem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_open_problem.problem
     *
     * @param problem the value for t_open_problem.problem
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setProblem(String problem) {
        this.problem = problem == null ? null : problem.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_open_problem.is_delete
     *
     * @return the value of t_open_problem.is_delete
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public Boolean getIs_delete() {
        return is_delete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_open_problem.is_delete
     *
     * @param is_delete the value for t_open_problem.is_delete
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setIs_delete(Boolean is_delete) {
        this.is_delete = is_delete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_open_problem.create_time
     *
     * @return the value of t_open_problem.create_time
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public Long getCreate_time() {
        return create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_open_problem.create_time
     *
     * @param create_time the value for t_open_problem.create_time
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_open_problem.update_time
     *
     * @return the value of t_open_problem.update_time
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public Long getUpdate_time() {
        return update_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_open_problem.update_time
     *
     * @param update_time the value for t_open_problem.update_time
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setUpdate_time(Long update_time) {
        this.update_time = update_time;
    }
}