package com.tomasba.micro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tomasba.micro.domain.Player;
import com.tomasba.micro.domain.Team;
import com.tomasba.micro.repository.TeamRepository;

@SpringBootApplication
public class MicrobootApplication {

	@Autowired
	private TeamRepository teamRepository; 
	
	public static void main(String[] args) {
		SpringApplication.run(MicrobootApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		
		Set<Player> set = new HashSet<>();
	  	set.add(new Player("Big Easy", "Showman"));
	  	set.add(new Player("Buckets", "Guard"));
	  	set.add(new Player("Dizzy", "Guard"));		
		
	  	List<Team> list = new ArrayList<>();	  	
	  	
	  	list.add(new Team("Harlem", "Globetrotters", "", set));
	  	list.add(new Team("Washington","Generals", "", null));

	  	teamRepository.save(list);		
	}
}
