package main.java.al.group.brightideas.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.al.group.brightideas.model.Like;
import main.java.al.group.brightideas.repository.LikeRepository;


@Service
public class LikeServiceImpl implements LikeService {

	    @Autowired
	    private LikeRepository likeRepo;
		
		@Override
		public Like findByName(String name) {
			return this.likeRepo.findByName(name);
		}
		
		@Override
		public Set<Like> findAll() {
			return new HashSet<Like>(this.likeRepo.findAll());
		}


}
