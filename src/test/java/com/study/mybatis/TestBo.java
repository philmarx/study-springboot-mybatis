package com.study.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.study.mybatis.bo.UserBo;
import com.study.mybatis.dmo.UserDmo;

@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(false)
public class TestBo {
	@Autowired
	UserBo userBo;

	@Test
	public void userInsert() throws Exception {
		UserDmo user = new UserDmo();
		user.setUsername("mybatis");
		this.userBo.insert(user);
	}
}
