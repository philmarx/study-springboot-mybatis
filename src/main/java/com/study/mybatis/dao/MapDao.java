package com.study.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MapDao {
	List<Map<String, Object>> findAll(@Param("table") String table, @Param("order") String order);
}
