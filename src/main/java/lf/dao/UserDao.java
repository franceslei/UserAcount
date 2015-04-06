package lf.dao;

import lf.domain.User;

public interface UserDao {

	public abstract void add(User user);

	public abstract User find(String username, String password);

	public abstract boolean find(String username);

}