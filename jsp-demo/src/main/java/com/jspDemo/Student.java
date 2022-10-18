package com.jspDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({@NamedQuery(name="CrudOperations.getAll", query="SELECT * FROM STUDENT")})
@Table(name = "STUDENT")
public class Student {

	@Id
	@Column(name="STUD_ID")
	private String id;
	
	@Column(name="STUD_NAME")
	private String name;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="BRANCH")
	private String branch;
	
	@Column(name="PASSWORD")
	private String password;

	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.address = "INDIA";
		this.branch = "CS";
		this.password = "HOLAGOA";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
