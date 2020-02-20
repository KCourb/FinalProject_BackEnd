package com.projet.clinique.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	
	@Id
	private long idUser;
	@Column(name="username")
	private String username;
	@Column
	private String password;
	@Column
	private Boolean activated;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idRole")
	private Roles role;
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getActivated() {
		return activated;
	}
	public void setActivated(Boolean activated) {
		this.activated = activated;
	}
	public Roles getRole() {
		return role;
	}
	public void setRole(Roles role) {
		this.role = role;
	}
	public Users(long idUser, String username, String password, Boolean activated, Roles role) {
		super();
		this.idUser = idUser;
		this.username = username;
		this.password = password;
		this.activated = activated;
		this.role = role;
	}
	
	

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	
	

}
