package com.study.mybatis.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.mybatis.dao.UserDao;
import com.study.mybatis.dmo.UserDmo;

@Service
public class UserBo {
	@Autowired
	UserDao userDao;

	@Transactional(rollbackFor = Throwable.class)
	public void insert(UserDmo user) throws Exception {
		this.userDao.insert(user);
		throw new Exception();
	}
}
