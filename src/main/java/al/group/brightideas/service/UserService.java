package main.java.al.group.brightideas.service;

import java.util.List;

import main.java.al.group.brightideas.model.User;


public interface UserService {
	
    void save(User user);

    User findByUsername(String username);
    
    User findByEmail(String email);
    
    User findById(Long id);
    
    List<User> findAll();
    
}
