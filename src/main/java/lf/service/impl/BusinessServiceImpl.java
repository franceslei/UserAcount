package lf.service.impl;

import lf.dao.UserDao;
import lf.dao.impl.UserDaoImpl;
import lf.domain.User;


//This class provides service for web tier
public class BusinessServiceImpl {
	
	private UserDao dao = new UserDaoImpl();
	// To JieOu, this plase should use BeanFactory or Spring, will replace later
	
	
	
	
	//provide service for web tier
	public static void register(User user){
		
	}
	
	
	public User login(String username, String password){
		return null;
		
	}

}
