package lf.dao.impl;

import java.util.Date;

import lf.dao.UserDao;
import lf.domain.User;

public class test {

	public static void main(String[] args) {
		
		User user = new User();
		
		user.setBirthday(new Date());
		user.setEmail("nn@sina.com");
		user.setId("38998766");
		user.setNickname("FUN");
		user.setPassword("234");
		user.setUsername("Zhang");
		// TODO Auto-generated method stub
		
		UserDao dao = new UserDaoImpl();
		dao.add(user);
		
	}
	
}
