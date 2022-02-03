package com.legatohealth.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.legatohealth.beans.User;
import com.legatohealth.dao.UserDao;
import com.legatohealth.exceptions.UserNotFoundException;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;
	
	@Override
	@Transactional
	public User store(User user) {
		User userCreated=dao.save(user);
		return null;
	}
	

	@Override
	public User fetchUser(int id) throws UserNotFoundException {
		User user=null;
		Optional<User> optional=dao.findById(id);
		if(optional.isPresent()) {
			user=optional.get();//returns thw id	
		}
		else {
			throw new UserNotFoundException("user is" +id+"not found ");
		}
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	@Transactional
	public void deleteUser(int id) throws UserNotFoundException {
		User user=fetchUser(id);
		
		dao.delete(user);
	}

	@Override
	@Transactional
	public User updatePassword(int id, String password) throws UserNotFoundException {
		User user=fetchUser(id);
		user.setPassword(password);
		return dao.save(user);
	}

	@Override
	public List<User> fetchAllUsers() {
		List<User> users=dao.findAll();
		return users;
	}


	@Override
	public User updateUser(int id, User user) throws UserNotFoundException {
		User uUser=fetchUser(id);
		uUser.setName(user.getName());
		uUser.setPassword(user.getPassword());
		uUser.setAge(user.getAge());
		
		
		
		return dao.save(uUser);
	}

	

}
