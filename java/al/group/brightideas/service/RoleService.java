package java.al.group.brightideas.service;

import java.util.Set;

import al.marjani.tvshows.model.Role;

public interface RoleService {

	Role findByName(String name);
	
	Set<Role> findAll();
	
}
