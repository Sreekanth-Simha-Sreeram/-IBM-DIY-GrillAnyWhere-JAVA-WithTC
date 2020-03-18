package com.grill.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import com.grill.models.Renter;
import com.grill.models.User;



public class TestBoundary {
	@Test
    public void testUserpasswordLength()
    {
        User user=new User();
        user.setUserId(1);
        user.setAddress("1st cross peenya");
        user.setMailId("example@gmail.com");
        user.setPassword("123456abcd");
        user.setUserName("james");
        user.setPhoneNumber(1234567890);
        		
        int passwordLength=10;
assertEquals(passwordLength,user.getPassword().length());


    }
 
 @Test
    public void testUserPhoneNumberLength()
    {
        User user=new User();
        user.setUserId(1);
        user.setAddress("1st cross peenya");
        user.setMailId("example@gmail.com");
        user.setPassword("123456abcd");
        user.setUserName("james");
        user.setPhoneNumber(1234567890);
        		
        int phoneNumberLength=10;
        
        
        int getLengthOfNumber=(Integer.toString(user.getPhoneNumber()).length());
assertEquals( phoneNumberLength, getLengthOfNumber);
 }
 
 @Test
 public void testUserNameLength()
 {
 User user=new User();
 user.setUserId(1);
 user.setAddress("1st cross peenya");
 user.setMailId("example@gmail.com");
 user.setPassword("123456abcd");
 user.setUserName("james");
 user.setPhoneNumber(1234567890);
 
 int maxChar=5;
 boolean usernamelength=((user.getUserName().length())>=maxChar);
 assertEquals(1, usernamelength);
 }
 
 @Test
 public void testRenterNameLength()
 {
 Renter renter=new Renter();
 renter.setMailId("example@gmail.com");
 renter.setPassword("123456abcd");
 renter.setRenterName("diya");
 renter.setRenterId(2);
 renter.setPhoneNumber(1234567890);
 
 
 int maxChar=5;
 boolean renterNamelength=((renter.getRenterName().length())>=maxChar);
 assertEquals( 1,renterNamelength);
 }
 
 @Test
 public void testRenterPhoneNumberLength(){
	 
 Renter renter=new Renter();
 renter.setMailId("example@gmail.com");
 renter.setPassword("123456abcd");
 renter.setRenterName("diya");
 renter.setRenterId(2);
 renter.setPhoneNumber(1234567890);
 
     int phoneNumberLength=10;
     
     
     int getLengthOfNumber=(Integer.toString(renter.getPhoneNumber()).length());
assertEquals( phoneNumberLength, getLengthOfNumber);
}
 @Test
 public void testRenterpasswordLength()
 {
	 Renter renter=new Renter();
	 renter.setMailId("example@gmail.com");
	 renter.setPassword("123456abcd");
	 renter.setRenterName("diya");
	 renter.setRenterId(2);
	 renter.setPhoneNumber(1234567890);
     int passwordLength=10;
assertEquals(passwordLength,renter.getPassword().length());


 }
}
