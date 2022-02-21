package com.cg.eis.dao;

import com.cg.eis.bean.Employee;
import java.util.List;

public interface EmployeeDao {
	public String addEmployee(Employee e);
	public String insuranceScheme(double salary, String designation);
	public List<Employee> AllEmployee();
	

}