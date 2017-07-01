package com.study.mybatis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Rollback(false)
public class TestJdbc {
	@Autowired
	DataSource dataSource;

	@Test
	public void insert() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement("insert into user(username) values(?)");
			pstmt.setString(1, "jdbc");
			System.out.println(pstmt.execute());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Autowired
	JdbcTemplate jdbc;

	@Test
	public void userInsert() {
		Calendar birthday = Calendar.getInstance();
		birthday.set(1990, 10, 17);
		this.jdbc.update(
				"INSERT INTO study.user (username, age, gender, birthday, balance, register_time) VALUES (?, ?, ?, ?, ?, ?);",
				new Object[] { "张三", 18, true, birthday.getTime(), 100, new Date() });
	}

}
