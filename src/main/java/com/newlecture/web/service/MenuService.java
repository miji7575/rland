package com.newlecture.web.service;

import java.util.List;

import com.newlecture.web.entity.Menu;
import com.newlecture.web.entity.MenuView;

public interface MenuService {

	
	
	List<Menu> getList();
	
	int addToBasket(int id);
	
	
	void testTS();
	
	
}
