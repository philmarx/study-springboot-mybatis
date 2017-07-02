package com.study.mybatis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.mybatis.bean.ResultModel;
import com.study.mybatis.dao.UserDao;
import com.study.mybatis.dmo.UserDmo;

@RestController
@RequestMapping("user")
public class UserController {
	@RequestMapping("insert")
	public Object insert(String username) {
		UserDmo record = new UserDmo();
		record.setUsername(username);
		this.userDao.insert(record);
		return new ResultModel(true, "", record);
	}

	@Autowired
	UserDao userDao;
}
