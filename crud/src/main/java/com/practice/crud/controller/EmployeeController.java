package com.practice.crud.controller;

import com.practice.crud.entity.Employee;
import com.practice.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
       return employeeService.saveEmployee(employee);
    }

    @GetMapping("/get/employees")
    public List<Employee> getEmployees(){
       return employeeService.getEmployees();
    }

    @GetMapping("/get/employee/{employeeId}")
    public Employee getEmployeeById(@PathVariable Integer employeeId){
        return employeeService.getEmployees(employeeId);
    }
}
