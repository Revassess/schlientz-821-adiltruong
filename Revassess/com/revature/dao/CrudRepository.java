package com.revature.dao;

import com.revature.model.User;

public interface CrudRepository {

	public User getUser(int id);
	public boolean updateUser(int id, User p);
	public boolean addUser(User p);
	public boolean deleteUser(String username);
}