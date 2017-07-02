package com.study.mybatis.dao;

import java.util.List;

import com.study.mybatis.dmo.UserDmo;

public interface UserDao {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table user
	 *
	 * @mbg.generated Sun Jul 02 11:55:35 CST 2017
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table user
	 *
	 * @mbg.generated Sun Jul 02 11:55:35 CST 2017
	 */
	void insert(UserDmo record);//或者返回int类型

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table user
	 *
	 * @mbg.generated Sun Jul 02 11:55:35 CST 2017
	 */
	UserDmo selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table user
	 *
	 * @mbg.generated Sun Jul 02 11:55:35 CST 2017
	 */
	List<UserDmo> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table user
	 *
	 * @mbg.generated Sun Jul 02 11:55:35 CST 2017
	 */
	int updateByPrimaryKey(UserDmo record);

	List<UserDmo> selectByExample(UserDmo example);

	List<UserDmo> selectByUsernameLike(String username);
}