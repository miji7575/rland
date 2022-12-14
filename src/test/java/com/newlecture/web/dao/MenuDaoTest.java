package com.newlecture.web.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

@AutoConfigureTestDatabase(replace=Replace.NONE)
@MybatisTest
class MenuDaoTest {
	
	@Autowired
	private MenuDao menuDao;

	@Test
	void testGetList() {
//		fail("Not yet implemented");
		int offset = 1;
		int size = 10;
		System.out.print(menuDao);
		System.out.print(menuDao.getList(offset, size, null, null));
	}

}
