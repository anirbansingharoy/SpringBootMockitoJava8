package com.tcs.java8.dao;

import com.tcs.java8.dto.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface Java8Dao {

    public List<Employee> getEmployee();
    public List<Employee> getEmployeeById(int id);
 }

