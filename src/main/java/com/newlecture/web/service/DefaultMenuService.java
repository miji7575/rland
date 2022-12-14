package com.newlecture.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.newlecture.web.dao.MenuDao;
import com.newlecture.web.entity.Menu;





@Service
public class DefaultMenuService implements MenuService{
	
	
	@Autowired
	private MenuDao menuDao;
//	인터페이스로 
	
	
	public DefaultMenuService() {
	
	}

	
	
	public DefaultMenuService(MenuDao menuDao) {

		this.menuDao = menuDao;
}

	
	

	//@Autowired
	public void setMenuDao(MenuDao menuDao) {
		this.menuDao = menuDao;
	}
	



	@Override
	public List<Menu> getList() {
		
		
		
		// TODO Auto-generated method stub
		
//		String sql = "select * from Menu";
		
//		JdbcTemplate template = new JdbcTemplate();
//		template.query(sql, null);
//		template.update(null);
		//menuDao.getList();
		List<Menu> list = menuDao.getList(0, 10, null, null);
//		menuDao.get(3);
		System.out.println(list);
		return list;
	}



	@Override
	public int addToBasket(int id) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Transactional(isolation = Isolation.READ_COMMITTED)
	@Override
	public void testTS() {
		
		Menu menu = menuDao.get(15);
		System.out.println(menu);
		menu.setPrice(menu.getPrice()-500);
		System.out.print(menu.getPrice());
		menuDao.update(menu);
		menuDao.updateAll(null);
		
//		menu.setPrice(menu.getPrice()-500);
//		menuDao.update(menu);
//		
	}

}
