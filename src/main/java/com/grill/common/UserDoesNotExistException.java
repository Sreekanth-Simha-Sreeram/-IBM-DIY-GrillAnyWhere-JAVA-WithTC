package com.grill.common;

public class UserDoesNotExistException extends Exception{
	public static  String message="user does not exists !..please SignUp";


	public UserDoesNotExistException()
	{
		
	}
	public UserDoesNotExistException(String message)
	{
		this.message=message;
	}
}
