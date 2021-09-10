package main.java.al.group.brightideas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.java.al.group.brightideas.model.User;



public interface UserRepository extends JpaRepository<User, Long> {
    
	User findByUsername(String username);
	
	User findByEmail(String email);
	
}
