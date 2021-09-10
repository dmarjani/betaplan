package java.al.group.brightideas.service;

import java.util.List;

import al.marjani.tvshows.model.User;

public interface UserService {
	
    void save(User user);

    User findByUsername(String username);
    
    User findByEmail(String email);
    
    User findById(Long id);
    
    List<User> findAll();
    
}
