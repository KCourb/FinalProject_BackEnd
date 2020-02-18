package com.projet.clinique.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	@OneToMany(mappedBy="user")
	private List<Roles> lstRoles;
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public String getLogin() {
		return username;
	}
	public void setLogin(String login) {
		this.username = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	public List<Roles> getLstRoles() {
		return lstRoles;
	}
	public void setLstRoles(List<Roles> lstRoles) {
		this.lstRoles = lstRoles;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(long idUser, String login, String password, boolean activated, List<Roles> lstRoles) {
		super();
		this.idUser = idUser;
		this.username = login;
		this.password = password;
		this.activated = activated;
		this.lstRoles = lstRoles;
	}
	
	

}
