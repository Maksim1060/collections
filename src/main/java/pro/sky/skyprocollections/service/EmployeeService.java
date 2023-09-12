package pro.sky.skyprocollections.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprocollections.controller.EmployeeController;
import pro.sky.skyprocollections.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private final List<Employee> employees = new ArrayList<>();
    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employees.add(employee);
        return employee;
    }
    public Employee remove(String firstName, String lastName) {
        return null;
    }
    public Employee get(String firstName, String lastName) {
        return null;
    }
    public List<Employee> getAll() {
        return employees;
    }
    }

