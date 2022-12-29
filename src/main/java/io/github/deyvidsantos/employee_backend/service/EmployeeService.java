package io.github.deyvidsantos.employee_backend.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import io.github.deyvidsantos.employee_backend.exception.UserNotFoundException;
import io.github.deyvidsantos.employee_backend.models.Employee;
import io.github.deyvidsantos.employee_backend.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // CREATE
    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    // READ
    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

    // UPDATE
    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee findEmployeeById(Long id) {
        return employeeRepository.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }
    // DELETE
    public void deleteEmployee(Long id){
        employeeRepository.deleteEmployeeById(id);
    }
    


    
}
