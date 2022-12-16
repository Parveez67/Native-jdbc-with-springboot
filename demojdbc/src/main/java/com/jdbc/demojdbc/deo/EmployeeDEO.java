package com.jdbc.demojdbc.deo;

import com.jdbc.demojdbc.model.Employee;

import java.util.List;

public interface EmployeeDEO
{
int save(Employee employee);
int update(Employee employee,int id);
int delete(int id);
List<Employee> getAll();
Employee getById(int id);

}
