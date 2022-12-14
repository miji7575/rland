package com.newlecture.web.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;



@AutoConfigureTestDatabase(replace=Replace.NONE)
@MybatisTest
class MenuDaoTest2 {
	
	@Autowired
	private MenuDao menuDao;

	//@Test
	void testGetList() {
		int offset = 1;
		int size = 10;
		System.out.print(menuDao);
		System.out.print(menuDao.getList(offset, size, null, null));
	}

	@Test
	void testGet() {
		int id=3;
		System.out.print(menuDao);
		System.out.print(menuDao.get(id));
	}

	//@Test
	void testCount() {
		fail("Not yet implemented");
	}

	//@Test
	void testInsert() {
		fail("Not yet implemented");
	}

	//@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	//@Test
	void testDelete() {
		fail("Not yet implemented");
	}

}
