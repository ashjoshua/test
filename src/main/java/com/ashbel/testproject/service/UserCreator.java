package com.ashbel.testproject.service;

import com.ashbel.testproject.entity.FreeUsers;
import com.ashbel.testproject.entity.PremiumUsers;
import com.ashbel.testproject.entity.Users;
import com.ashbel.testproject.repository.UsersRepository;

public class UserCreator {
	
	private final UsersRepository usersRepository;
	
	
	public UserCreator(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
	
	
	public Users createUser(String userName,String email, int age, String userType) {
		Users users = null;
	
		switch (userType.toLowerCase()) {
		
		case "free" : 
			users = new FreeUsers();
			users.setMessageLimit(0);
			users.setSwipeLimit(0);
			break;
			
			
		case "Premium" :
			users = new PremiumUsers();
			users.setMessageLimit(0);
			users.setSwipeLimit(0);
			break;
		
		default :
			throw new IllegalArgumentException("Invalid User Type "+ userType );
		}
	
		usersRepository.save(users);
		return users;
	}
	
	
}
