package com.grill.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grill.dao.RenterDao;
import com.grill.dao.UserDao;
import com.grill.models.AddOn;
import com.grill.models.User;
@Component
@Service("UserService")
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	
	@Transactional
	public boolean signUp(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean signIn(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Transactional
	public boolean checkAvailability(int grillId, int renterId, Date date) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean payment(int userId, int renterId) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean bookGrill(User user, String grillType, AddOn addOn) {
		// TODO Auto-generated method stub
		return false;
	}

}
