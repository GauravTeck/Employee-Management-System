package org.cfs.employeejpamngt.controller;

import org.cfs.employeejpamngt.entity.Employee;
import org.cfs.employeejpamngt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee saveEmployee( @RequestBody  Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById( @PathVariable Integer id){
        return employeeService.getEmployeeById(id);

    }

    @PutMapping
    public Employee updateEmployee(@RequestBody  Integer id ,@RequestBody Employee employee){
        return employeeService.updateEmployee(id,employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Integer id){
        employeeService.deleteEmployee(id);
        return "Employee deleted successfully";
    }
}
