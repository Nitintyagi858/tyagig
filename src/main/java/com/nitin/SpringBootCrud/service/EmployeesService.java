package com.nitin.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitin.SpringBootCrud.bean.Employees;
import com.nitin.SpringBootCrud.repository.EmployeesRepository;


@Service
public class EmployeesService {
	@Autowired
	public EmployeesRepository emprepo;
	
	public List<Employees> getAllEmployees(){
		
		List<Employees> employees = new ArrayList<>();
		emprepo.findAll().forEach(employees::add);
		return employees;
	}
	public void addEmployees(Employees employees) {
		emprepo.save(employees);
	}
	public void updateEmployees(Integer e_id, Employees employees) {
		emprepo.save(employees);
		
	}
	public void deleteEmployees(Integer e_id) {
		emprepo.deleteById(e_id);
	}
	
	

}
