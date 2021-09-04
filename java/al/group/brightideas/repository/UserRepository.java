package java.al.group.brightideas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import al.marjani.tvshows.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
	User findByUsername(String username);
	
	User findByEmail(String email);
	
}
