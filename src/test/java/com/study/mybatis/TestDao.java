package com.study.mybatis;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.study.mybatis.dao.UserDao;
import com.study.mybatis.dmo.UserDmo;

@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(false)
public class TestDao {
	@Test
	public void userInsert() throws Exception {
		UserDmo user = new UserDmo();
		user.setUsername("spring-boot");
		user.setAge(30);
		user.setBalance(100);
		Calendar cal = Calendar.getInstance();
		cal.set(1992, 10, 17);
		user.setBirthday(cal.getTime());
		user.setGender(true);
		user.setRegisterTime(new Date());
		this.userDao.insert(user);
	}

	@Test
	public void userFindAll() {
		List<UserDmo> list = this.userDao.selectAll();
		for (UserDmo userDmo : list) {
			System.out.println(userDmo.getId() + ":" + userDmo.getUsername());
		}
	}

	@Autowired
	UserDao userDao;

}
