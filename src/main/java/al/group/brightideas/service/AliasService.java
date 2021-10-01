package main.java.al.group.brightideas.service;

import java.util.Set;

import org.springframework.data.mapping.Alias;

import main.java.al.group.brightideas.model.Like;

public interface AliasService {
	
Like findByName(String name);
	
	Set<Alias> findAll();
	

}
