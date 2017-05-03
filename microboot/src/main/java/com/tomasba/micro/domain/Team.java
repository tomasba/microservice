package com.tomasba.micro.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Team {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String location;
	private String mascottes;
	
	@OneToMany(cascade=CascadeType.ALL) 
	@JoinColumn(name="teamId")
	private Set<Player> players;
	
	public Team() {		
	}
	
	public Team(String name, String location, String mascottes, Set<Player> players) {
		this();
		this.name = name;
		this.location = location;
		this.mascottes = mascottes;
		this.players = players;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMascottes() {
		return mascottes;
	}
	public void setMascottes(String mascottes) {
		this.mascottes = mascottes;
	}
	public Set<Player> getPlayers() {
		return players;
	}
	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	
}
