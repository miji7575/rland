package com.newlecture.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.newlecture.web.entity.Menu;


@Mapper
public interface MenuDao {
	
	
//	시퀄문을 함수로 만들었다
//	시퀄이 갖고잇는 기능 기반에 이름을 붙였다.
//	서비스 : 사용자 요청을 이름화한것
//	다오 : 시퀄에 기반한 내용을 이름화 한 것
//	다오에 들어가는 함수는 거의 모든 것이 비슷하다. 최대한 줄여보자
	
	//@Select("select * from Menu where name like '%${query}%'")//=>select * from Menu where title like hello
	//	@Select("select * from Menu where title like #{title}")//select * from Menu where title like 'hello'
	//이렇게도 쓸 수 있지만 쿼리문이 인터페티스 코드보다 더러워지기 때문에
	//	이 쿼리문을 다른 파일로 뺼 것이다
	
	//일반적으로 인터페이스별로 파일을 만드는 경우가 많다.
	//인터페이스명 뒤에 Mapper라는 이름을 붙여서 xml 파일을 만드는게 암묵적인 룰
	//ex> menuDaoMapper.xml
	//그렇다면 이파일은 어디에 저장할까?
	//static(노출되는 영역. css..image...) Templete(자동으로 숨겨지는 폴더. 비공개영역)
	
	//	src/main/resources 에다가 Mapper라는 이름으로 폴더 하나 추가해서 저장해보자.
	int offset = 1;
	int size = 10;
	
	List<Menu> getList(int offset, int size,
						String field,
						String query);//title="hello"
	
	
	Menu get(int id);
	int count(String query);
	
	int insert(Menu menu);
	
	int update(Menu menu);
	@Transactional(propagation = Propagation.SUPPORTS
			)
	int updateAll(Menu[] menus);
	
	int delete(int id);	//삭제된 열의 갯수를 return함.
	@Transactional
	int deleteAll(int[] ids);
	
	

}
