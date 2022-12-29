package io.github.deyvidsantos.employee_backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import io.github.deyvidsantos.employee_backend.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

    @Transactional
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
    
}
