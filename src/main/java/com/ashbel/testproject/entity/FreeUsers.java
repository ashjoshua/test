package com.ashbel.testproject.entity;

import org.springframework.beans.factory.annotation.Value;

public class FreeUsers extends Users {
	
	private String userType;
	private int messageLimit;
	private int swipeLimit;
	
	public void sendMessage(String messageText) {
		 System.out.println("Not allowed");
	
	}
	

	
	public String userType() {
		return userType;
	}



	public void setUserType(String userType) {
		this.userType = userType;
	}



	public int getMessageLimit() {
		return messageLimit;
	}


	@Value("${free.message.limit}")
	public void setMessageLimit(int messageLimit) {
		this.messageLimit = messageLimit;
	}



	public int getSwipeLimit() {
		return swipeLimit;
	}


	@Value("${free.swipe.limit}")
	public void setSwipeLimit(int swipeLimit) {
		this.swipeLimit = swipeLimit;
	}


	
	public void displayPrevileges() { 	
    	System.out.println("Basic Previleges");
    }
}
