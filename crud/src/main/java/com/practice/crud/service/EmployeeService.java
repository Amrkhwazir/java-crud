package com.practice.crud.service;

import com.practice.crud.dao.EmployeeDao;
import com.practice.crud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public Employee saveEmployee(Employee employee) {
    return employeeDao.save(employee);
    }
}
