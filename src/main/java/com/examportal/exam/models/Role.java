package com.examportal.exam.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="roles")
public class Role {
	@Id
	private Long roleId;
	private String roleName;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="role")
	private Set<userRole> userrole=new HashSet<>();
	
	
	
	
	public Set<userRole> getUserrole() {
		return userrole;
	}
	public void setUserrole(Set<userRole> userrole) {
		this.userrole = userrole;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Role(Long roleId, String roleName, Set<userRole> userrole) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.userrole = userrole;
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 

}
