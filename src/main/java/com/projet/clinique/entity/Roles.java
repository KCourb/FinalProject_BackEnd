package com.projet.clinique.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="roles")
public class Roles {
	@Id
	private long idRole;
	@Column(name = "rolename")
	private String rolename;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idUser")
	private Users user;
	public long getIdRole() {
		return idRole;
	}
	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}
	public String getRoleName() {
		return rolename;
	}
	public void setRoleName(String roleName) {
		this.rolename = roleName;
	}
	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Roles(long idRole, String roleName) {
		super();
		this.idRole = idRole;
		this.rolename = roleName;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	
	
	

}
