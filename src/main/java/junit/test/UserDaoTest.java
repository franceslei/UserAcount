package junit.test;

import java.io.IOException;
import java.util.Date;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.junit.Test;

import lf.dao.UserDao;
import lf.dao.impl.UserDaoImpl;
import lf.domain.User;
import lf.utils.XmlUtils;

public class UserDaoTest {
	private static final Document document = null;


	@Test
	public void testAdd(){
		
		User user = new User();
		
		user.setBirthday(new Date());
		user.setEmail("nn@sina.com");
		user.setId("38998766");
		user.setNickname("FUN");
		user.setPassword("234");
		user.setUsername("Zhang");
		
		UserDao dao = new UserDaoImpl();
		dao.add(user);
	}
	
	@Test
	public void testFind(){
		UserDao dao = new UserDaoImpl();
		dao.find("aaa","123");
	}
	
	@Test
	public void testFindByUsername(){
		UserDao dao = new UserDaoImpl();
		System.out.println(dao.find("aaa"));
	}
	
	@Test
	public void getDocument(){
		try {
			XmlUtils.getDocument();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
@Test
	public void testWrite2Xml(){
	
		
			
				try {
					XmlUtils.Write2Xml(document);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
}
			
		
	}