package com.grill.dao;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.grill.models.AddOn;
import com.grill.models.User;
@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionfactory;
	
	public boolean signUp(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean signIn(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	

	public boolean checkAvailability(int grillId, int renterId, Date date) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean payment(int userId, int renterId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean bookGrill(User user, String grillType, AddOn addOn) {
		// TODO Auto-generated method stub
		return false;
	}

}
