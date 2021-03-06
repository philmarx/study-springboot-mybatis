package com.study.mybatis.dmo;

import java.util.Date;

public class UserDmo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Sun Jul 02 11:55:35 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbg.generated Sun Jul 02 11:55:35 CST 2017
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.age
     *
     * @mbg.generated Sun Jul 02 11:55:35 CST 2017
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gender
     *
     * @mbg.generated Sun Jul 02 11:55:35 CST 2017
     */
    private Boolean gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.birthday
     *
     * @mbg.generated Sun Jul 02 11:55:35 CST 2017
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.balance
     *
     * @mbg.generated Sun Jul 02 11:55:35 CST 2017
     */
    private Integer balance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.register_time
     *
     * @mbg.generated Sun Jul 02 11:55:35 CST 2017
     */
    private Date registerTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Sun Jul 02 11:55:35 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Sun Jul 02 11:55:35 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbg.generated Sun Jul 02 11:55:35 CST 2017
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     *
     * @mbg.generated Sun Jul 02 11:55:35 CST 2017
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.age
     *
     * @return the value of user.age
     *
     * @mbg.generated Sun Jul 02 11:55:35 CST 2017
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.age
     *
     * @param age the value for user.age
     *
     * @mbg.generated Sun Jul 02 11:55:35 CST 2017
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gender
     *
     * @return the value of user.gender
     *
     * @mbg.generated Sun Jul 02 11:55:35 CST 2017
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gender
     *
     * @param gender the value for user.gender
     *
     * @mbg.generated Sun Jul 02 11:55:35 CST 2017
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.birthday
     *
     * @return the value of user.birthday
     *
     * @mbg.generated Sun Jul 02 11:55:35 CST 2017
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.birthday
     *
     * @param birthday the value for user.birthday
     *
     * @mbg.generated Sun Jul 02 11:55:35 CST 2017
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.balance
     *
     * @return the value of user.balance
     *
     * @mbg.generated Sun Jul 02 11:55:35 CST 2017
     */
    public Integer getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.balance
     *
     * @param balance the value for user.balance
     *
     * @mbg.generated Sun Jul 02 11:55:35 CST 2017
     */
    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.register_time
     *
     * @return the value of user.register_time
     *
     * @mbg.generated Sun Jul 02 11:55:35 CST 2017
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.register_time
     *
     * @param registerTime the value for user.register_time
     *
     * @mbg.generated Sun Jul 02 11:55:35 CST 2017
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

	public UserDmo() {
		super();
	}

	public UserDmo(Long id, String username, Integer age, Boolean gender, Date birthday, Integer balance,
			Date registerTime) {
		super();
		this.id = id;
		this.username = username;
		this.age = age;
		this.gender = gender;
		this.birthday = birthday;
		this.balance = balance;
		this.registerTime = registerTime;
	}
    
    
    
}