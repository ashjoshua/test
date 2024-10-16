package com.ashbel.testproject.entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "users")
public abstract class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generated ID
    private Long id;  // Change this to primary key
    
    @NotNull(message = "User Name cannot be null")
    @Size(min = 3, max = 20, message = "User Name must be 3 to 20 chars")
    @Column(unique = true)  // Ensure user name is unique
    private String userName;
    
    @Min(value = 18, message = "Dating only allowed if you are 18 or above")
    @NotNull(message = "Age is needed")
    private Integer age;  // Change int to Integer to support @NotNull
    
    @Email(message = "Email should be valid")
    @NotNull(message = "Email is needed")
    private String email;
    
    private LocalDate joiningDate;

    @NotNull(message = "Name is needed")
    @Size(min = 2, max = 25, message = "Name must be 2 to 25 chars")
    private String realName;

    @NotNull(message = "Gender is needed")
    @Pattern(regexp = "male|female", message = "Gender must be 'male' or 'female'")
    private String gender;

    
    private String userType;
    private int swipeLimit;
    private int messageLimit;
    
    
    public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getSwipeLimit() {
		return swipeLimit;
	}

	public void setSwipeLimit(int swipeLimit) {
		this.swipeLimit = swipeLimit;
	}

	public int getMessageLimit() {
		return messageLimit;
	}

	public void setMessageLimit(int messageLimit) {
		this.messageLimit = messageLimit;
	}

	
    
    
    // No-argument constructor required by JPA
    public Users() {}

    public Users(String userName, Integer age, String email, String realName, String gender) {
        this.userName = userName;
        this.age = age;
        this.email = email;
        this.realName = realName;
        this.gender = gender;
        this.joiningDate = LocalDate.now();
    }

    // Getters and setters
    public Long getId() { return id; }
    public String getUserName() { return userName; }
    public Integer getAge() { return age; }
    public String getEmail() { return email; }
    public LocalDate getJoiningDate() { return joiningDate; }
    public String getRealName() { return realName; }
    public String getGender() { return gender; }

    public void setId(Long id) { this.id = id; }
    public void setUserName(String userName) { this.userName = userName; }
    public void setAge(Integer age) { this.age = age; }
    public void setEmail(String email) { this.email = email; }
    public void setJoiningDate(LocalDate joiningDate) { this.joiningDate = joiningDate; }
    public void setRealName(String realName) { this.realName = realName; }
    public void setGender(String gender) { this.gender = gender; }
    
    // Abstract methods for child classes
    public abstract void sendMessage(String messageText);

    public void displayPrevileges() { 	
    	System.out.println("display none");
    }
}
