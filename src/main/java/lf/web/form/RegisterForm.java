package lf.web.form;

import java.util.HashMap;
import java.util.Map;

public class RegisterForm {

	private String username;
	private String password;
	private String password2;
	private String email;
	private String birthday;
	private String nickname;
	
	private Map errors = new HashMap();
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
	public boolean validate(){
		boolean isOk = true;
		if (this.username==null || this.username.trim().equals("")){
			isOk = false;
			errors.put(username, "Username can't be empty");
		} else {
			if (!this.username.matches("[A-Za-z]{3,8}")){
				isOk = false;
				errors.put(username,"Username should be 3 to 8 letters");
			}
		}
		
		return isOk;
	}
	
	
	

}
