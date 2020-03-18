package com.grill.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grill.common.UserAlreadyExistException;
import com.grill.common.UserDoesNotExistException;
import com.grill.models.Renter;
import com.grill.models.User;
import com.grill.services.RenterService;
import com.grill.services.UserService;

import junit.framework.Assert;

public class TestException {
	@Test
    public void testForUserRegistration() throws UserAlreadyExistException 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
	   User user=new User();
	   
	user.setUserId(1);
    user.setAddress("1st cross peenya");
    user.setMailId("example@gmail.com");
    user.setPassword("123456abcd");
    user.setUserName("james");
    user.setPhoneNumber(1234567890);
    		
	 UserService userservice = (UserService) context.getBean("UserService");
	 userservice.signUp(user);
Assert.assertEquals(UserAlreadyExistException.message," user already exists !..please login");
    }
	
	
	@Test
    public void testForUserLogin() throws UserDoesNotExistException  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
	   User user=new User();
	   user.setUserId(1);
	   user.setAddress("1st cross peenya");
	    user.setMailId("example@gmail.com");
	    user.setPassword("123456abcd");
	    user.setUserName("hello");
	    user.setPhoneNumber(1234567890);
	
		 UserService userservice = (UserService) context.getBean("UserService");
		 userservice.signIn(user.getUserName(),user.getPassword());
Assert.assertEquals(UserDoesNotExistException.message," user already exists !..please login");
     }
	
	@Test
    public void testForRenterRegistration() throws UserAlreadyExistException 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
	 Renter renter=new Renter();
	 renter.setMailId("example@gmail.com");
	 renter.setPassword("123456abcd");
	 renter.setRenterName("diya");
	 renter.setRenterId(2);
	 renter.setPhoneNumber(1234567890);
	 RenterService renterservice = (RenterService) context.getBean("RenterService");
	 renterservice.signUp(renter);
Assert.assertEquals(UserAlreadyExistException.message," user already exists !..please login");
    }
	
	@Test
    public void testForRenterLogin() throws UserDoesNotExistException  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
	 Renter renter=new Renter();
	 renter.setMailId("example@gmail.com");
	 renter.setPassword("123456abcd");
	 renter.setRenterName("diya");
	 renter.setRenterId(2);
	 renter.setPhoneNumber(1234567890);
	
	 RenterService renterservice = (RenterService) context.getBean("RenterService");
	 renterservice.signIn(renter.getRenterName(),renter.getPassword());
Assert.assertEquals(UserDoesNotExistException.message," user does not exists !..please signUp");
     }
	
}
