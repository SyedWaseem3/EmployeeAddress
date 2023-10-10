package com.geekster.EmployeeAddress.controller;

import com.geekster.EmployeeAddress.model.Employee;
import com.geekster.EmployeeAddress.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    //Get all employees
    @GetMapping("getAllEmployees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    //Get an employee by id
    @GetMapping("getEmployeeById/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    //Create a new employee
    @PostMapping("addEmployee")
    public String addEmployee(@RequestBody Employee newEmployee){
        return employeeService.addEmployee(newEmployee);
    }

    //Update lastName of employee by id
    @PutMapping("updateEmployeeById/{id}/firstName/{newFirstName}")
    public String updateEmployeeById(@PathVariable Long id, @PathVariable String newFirstName){
        return employeeService.updateEmployeeById(id, newFirstName);
    }

    //Delete an employee by id
    @DeleteMapping("deleteEmployeeById/{id}")
    public String deleteEmployeeById(@PathVariable Long id){
        return employeeService.deleteEmployeeById(id);
    }
}
