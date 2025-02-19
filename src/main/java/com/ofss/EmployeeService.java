package com.ofss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // Create or Update Employee
    public Mono<Employee> saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Get all Employees
    public Flux<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Get Employee by ID
    public Mono<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    // Delete Employee
    public Mono<Void> deleteEmployee(Long id) {
        return employeeRepository.deleteById(id);
    }
}

