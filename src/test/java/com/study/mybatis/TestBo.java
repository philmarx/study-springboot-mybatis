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
//默认测试生效
@Rollback(false)
public class TestBo {
	@Autowired
	UserBo userBo;

	//如果userBo中事务有异常，会回滚
	@Test
	public void userInsert() throws Exception {
		UserDmo user = new UserDmo();
		user.setUsername("mybatis");
		this.userBo.insert(user);
	}
}
