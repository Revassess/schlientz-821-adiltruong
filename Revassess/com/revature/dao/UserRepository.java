package com.revature.dao;

import com.revature.model.User;

public class UserRepository implements CrudRepository {

	@Override
	public User getUser(int id) {
		//SELECT STATEMENT
		return null;
	}

	@Override
	public boolean updateUser(int id, User p) {
		// UPDATE STATEMENT
		return false;
	}

	@Override
	public boolean addUser(User p) {
		// INSERT STATEMENT
		return false;
	}

	@Override
	public boolean deleteUser(String username) {
		// DELETE STATEMENT
		return false;
	}

}