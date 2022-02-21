package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import java.util.List;

public interface EmployeeService {
	public String addEmployee(Employee e);
	public String insuranceScheme(double salary,String designation);
	public List<Employee> AllEmployee();
}