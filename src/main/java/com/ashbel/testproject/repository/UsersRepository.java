package com.ashbel.testproject.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ashbel.testproject.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{
	
	Users findByUserName(String userName );
	Users findByEmail(String email);
	List<Users> findByAgeGreaterThan(int age);
	
	/*@Modifying
	@Query("INSERT INTO USERS ( userName,age,email,joiningDate,realName,gender) values (:userName,:age,:email,:joiningDate,:realName,:gender)")
	void saveUser(@Param("userName") String userName,
			@Param("age") int age,
			@Param("email") String email,
			@Param("joiningDate") LocalDate joiningDate,
			@Param("realName") String realName,
			@Param("gender") String gender);
*/
}
