package com.employee.management.api.service;

import com.employee.management.api.entity.Employee;
import com.employee.management.api.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee addEmployee(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Employee updateEmployee(int id, Employee updatedEmployee) {
        Employee emp = repository.findById(id).orElse(null);
        if (emp != null) {
            emp.setName(updatedEmployee.getName());
            emp.setAge(updatedEmployee.getAge());
            emp.setDepartment(updatedEmployee.getDepartment());
            emp.setSalary(updatedEmployee.getSalary());
            return repository.save(emp);
        }
        return null;
    }

    public void deleteEmployee(int id) {
        repository.deleteById(id);
    }
}
