package com.nitin.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nitin.SpringBootCrud.bean.Employees;
import com.nitin.SpringBootCrud.service.EmployeesService;


@RestController
@RequestMapping("/api")
public class EmployeesController {
	
	@Autowired
	private EmployeesService empService;
	
	
	@GetMapping("/employees")
	public List<Employees> getAllEmployees(){
		return empService.getAllEmployees();
	}
	@RequestMapping(method=RequestMethod.POST,value="/employees")
	public void addEmployees(@RequestBody Employees employees) {
		empService.addEmployees(employees);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/employees/{e_id}")
	public void updateEmployees(@PathVariable Integer e_id,@RequestBody Employees employees) {
	empService.updateEmployees(e_id,employees);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/employees/{e_id}")
	public void deleteEmployees(@PathVariable Integer e_id) {
		empService.deleteEmployees(e_id);
	}

}
