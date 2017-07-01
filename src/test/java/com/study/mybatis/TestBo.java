package com.study.mybatis;

import java.util.Calendar;
import java.util.Date;

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
// 默认测试生效
@Rollback(false)
public class TestBo {
	@Autowired
	UserBo userBo;

	// 如果userBo中事务有异常，会回滚
	@Test
	public void userInsert() throws Exception {
		UserDmo user = new UserDmo();
		user.setUsername("李四");
		user.setAge(30);
		user.setBalance(100);
		Calendar cal = Calendar.getInstance();
		cal.set(1992, 10, 17);
		user.setBirthday(cal.getTime());
		user.setGender(true);
		user.setRegisterTime(new Date());
		this.userBo.insert(user);
	}
}
