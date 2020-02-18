package com.projet.clinique.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="roles")
public class Roles {
	@Id
	private long idRole;
	@Column(name = "rolename")
	private String rolename;
	public long getIdRole() {
		return idRole;
	}
	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public Roles(long idRole, String rolename) {
		super();
		this.idRole = idRole;
		this.rolename = rolename;
	}
	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}
