package com.geekster.EmployeeAddress.service;

import com.geekster.EmployeeAddress.model.Employee;
import com.geekster.EmployeeAddress.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo;

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepo.findById(id).get();
    }

    public String addEmployee(Employee newEmployee) {
        employeeRepo.save(newEmployee);
        return newEmployee.getEmployeeFirstName() + " employee added!";
    }

    public String updateEmployeeById(Long id, String newFirstName) {
        Employee newEmployee = employeeRepo.findById(id).get();
        newEmployee.setEmployeeFirstName(newFirstName);
        employeeRepo.save(newEmployee);
        return "Employee's firstName Updated!";
    }

    public String deleteEmployeeById(Long id) {
        employeeRepo.deleteById(id);
        return id+ "'s employee deleted!";
    }
}
