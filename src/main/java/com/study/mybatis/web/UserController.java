package com.study.mybatis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.mybatis.bean.ResultModel;
import com.study.mybatis.dmo.UserDmo;
import com.study.mybatis.mapper.UserMapper;

@RestController
@RequestMapping("user")
public class UserController {
	@RequestMapping("insert")
	public Object insert(String username) {
		UserDmo record = new UserDmo();
		record.setUsername(username);
		this.userMapper.insert(record);
		return new ResultModel(true, "", record);
	}

	@Autowired
	UserMapper userMapper;
}
