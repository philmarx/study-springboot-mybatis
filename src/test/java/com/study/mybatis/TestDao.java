package com.study.mybatis;

import java.lang.reflect.Field;
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
		user.setUsername("spring-boot-mybatis");
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
	public void userUpdate() {
		UserDmo user = this.userDao.selectByPrimaryKey(31L);
		user.setAge(25);
		int result = this.userDao.updateByPrimaryKey(user);
		System.out.println(result);
	}

	@Test
	public void userDelete() {
		this.userDao.deleteByPrimaryKey(33L);
	}

	@Test
	public void userFindAll() {
		List<UserDmo> list = this.userDao.selectAll();
		for (UserDmo userDmo : list) {
			System.out.println(userDmo.getId() + ":" + userDmo.getUsername() + ":" + userDmo.getRegisterTime());
		}
	}

	@Test
	public void userFindOne() throws IllegalArgumentException, IllegalAccessException {
		UserDmo user = this.userDao.selectByPrimaryKey(30L);
		Field[] fs = UserDmo.class.getDeclaredFields();
		for (Field field : fs) {
			field.setAccessible(true);
			System.out.println(field.getName() + ":" + field.get(user));
		}
	}

	@Autowired
	UserDao userDao;

	@Test
	public void userFindByExample() {
		UserDmo example = new UserDmo();
		example.setUsername("mybatis");
		List<UserDmo> users = this.userDao.selectByExample(example);
		System.out.println(users.size());
	}

	@Test
	public void userFindByUsernameLike() {
		List<UserDmo> users = this.userDao.selectByUsernameLike("%m%");
		System.out.println(users.size());
	}
}
