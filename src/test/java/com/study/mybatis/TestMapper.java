package com.study.mybatis;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.study.mybatis.dmo.UserDmo;
import com.study.mybatis.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(false)
public class TestMapper {
	@Test
	@Transactional(rollbackFor = Throwable.class)
	public void userInsert() throws Exception {
		UserDmo user = new UserDmo();
		user.setUsername("mybatis");
		this.userMapper.insert(user);
	}

	@Test
	public void userFindAll() {
		List<UserDmo> list = this.userMapper.selectAll();
		for (UserDmo userDmo : list) {
			System.out.println(userDmo.getId() + ":" + userDmo.getUsername());
		}
	}

	@Autowired
	UserMapper userMapper;

}
