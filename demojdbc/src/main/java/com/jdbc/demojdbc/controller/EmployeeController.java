package com.jdbc.demojdbc.controller;

import com.jdbc.demojdbc.deo.EmployeeDEO;
import com.jdbc.demojdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDEO eDEO;
@GetMapping("/employees")
    public List<Employee> getEmployee(){
        return eDEO.getAll();
    }
    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id){
    return eDEO.getById(id);
    }
  @PostMapping("/employees")
    public String saveEmployee(@RequestBody Employee employee){
    return eDEO.save(employee)+" No. of rows saved to the database";
  }
    @PutMapping("/employees/{id}")
    public String updateEmployee(@RequestBody Employee employee,@PathVariable int id)
    {
        return eDEO.update(employee,id)+" data is updated";
    }
    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id)
    {
        return eDEO.delete(id)+" row is deleted";
    }


}
