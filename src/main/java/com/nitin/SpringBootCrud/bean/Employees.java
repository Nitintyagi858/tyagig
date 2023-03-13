package com.nitin.SpringBootCrud.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employees {
	
	@Id
	private int e_id;
	private String name;
	private int department_id;
	
	
	public Employees() {
	}
	
	public Employees(int e_id, String name, int department_id) {
		this.e_id = e_id;
		this.name = name;
		this.department_id = department_id;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	

}
