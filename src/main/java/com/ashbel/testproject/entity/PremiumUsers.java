package com.ashbel.testproject.entity;

import org.springframework.beans.factory.annotation.Value;

public class PremiumUsers extends Users {

	private String userType;
	public String getUserType() {
		return userType;
	}



	public void setUserType(String userType) {
		this.userType = userType;
	}



	public int getMessageLimit() {
		return messageLimit;
	}


	@Value("${premium.message.limit}")
	public void setMessageLimit(int messageLimit) {
		this.messageLimit = messageLimit;
	}



	public int getSwipeLimit() {
		return swipeLimit;
	}


	@Value("${premium.swipe.limit}")
	public void setSwipeLimit(int swipeLimit) {
		this.swipeLimit = swipeLimit;
	}



	private int messageLimit;
	private int swipeLimit;
	
	
	
	@Override
	public void sendMessage(String messageText) {
		System.out.println("premium message limit");
		
	}
	
	

}
