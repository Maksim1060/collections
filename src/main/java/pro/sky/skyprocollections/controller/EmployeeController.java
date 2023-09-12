package pro.sky.skyprocollections.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pro.sky.skyprocollections.model.Employee;
import pro.sky.skyprocollections.service.EmployeeService;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
@GetMapping("/add")
    public Employee add(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.add(firstName, lastName);
    }
@GetMapping
    public List<Employee> getAll() {
        return employeeService.getAll();
    }
    }



