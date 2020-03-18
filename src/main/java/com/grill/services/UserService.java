package com.grill.services;

import java.util.Date;

import com.grill.models.AddOn;
import com.grill.models.User;

public interface UserService {
	
	boolean signUp(User user);
	boolean signIn(String userName,String password);
	boolean bookGrill(User user,String grillType,AddOn addOn);
	boolean checkAvailability(int grillId,int renterId,Date date);
	boolean payment(int userId,int renterId);
	
}
