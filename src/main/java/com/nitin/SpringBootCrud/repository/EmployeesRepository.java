package com.nitin.SpringBootCrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.nitin.SpringBootCrud.bean.Employees;


public interface EmployeesRepository extends CrudRepository<Employees, Integer> {

}
