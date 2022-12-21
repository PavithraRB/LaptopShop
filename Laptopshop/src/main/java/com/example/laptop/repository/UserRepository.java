package com.example.laptop.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.laptop.model.User;



public interface UserRepository extends JpaRepository<User,Long>  {
	Optional<User> findByNameAndPassword(String name,String password);
	Optional<User> findByEmailID(String EmailID);

}
