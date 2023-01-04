package com.backend.cinema.repository;
import java.util.List;

import org.hibernate.usertype.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.backend.cinema.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	  @Query(value = "select * from user where first_name = :name", nativeQuery = true)
	  User findUserByFirstNameWithNativeQuery(String name);
	  
	  // 1. query from method name
//	  List<User> findByType(UserType type);

}