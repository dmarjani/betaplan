package main.java.al.group.brightideas.service;

import java.util.Set;

import main.java.al.group.brightideas.model.Role;



public interface RoleService {

	Role findByName(String name);
	
	Set<Role> findAll();
	
}
