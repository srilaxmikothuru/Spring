
//Exception for invalid input

package com.cg.mypaymentapp.exception;

public class InvalidInputException extends RuntimeException 
{

	public InvalidInputException(String msg) 
	{
		super(msg);
	}

	public InvalidInputException()
	{
		super();
		
	}

	public InvalidInputException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) 
	{
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public InvalidInputException(String message, Throwable cause) 
	{
		super(message, cause);
		
	}

	public InvalidInputException(Throwable cause) 
	{
		super(cause);
		
	}
	
}
