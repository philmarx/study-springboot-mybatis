package com.study.mybatis.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.mybatis.dmo.UserDmo;
import com.study.mybatis.mapper.UserMapper;

@Service
public class UserBo {
	@Autowired
	UserMapper userMapper;

	@Transactional(rollbackFor = Throwable.class)
	public void insert(UserDmo user) throws Exception {
		this.userMapper.insert(user);
		throw new Exception();
	}
}
