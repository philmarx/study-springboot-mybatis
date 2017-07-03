package com.study.mybatis.dao;

import com.study.mybatis.dmo.ClazzDmo;
import java.util.List;

public interface ClazzDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbg.generated Mon Jul 03 19:40:52 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbg.generated Mon Jul 03 19:40:52 CST 2017
     */
    int insert(ClazzDmo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbg.generated Mon Jul 03 19:40:52 CST 2017
     */
    ClazzDmo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbg.generated Mon Jul 03 19:40:52 CST 2017
     */
    List<ClazzDmo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbg.generated Mon Jul 03 19:40:52 CST 2017
     */
    int updateByPrimaryKey(ClazzDmo record);
}