package com.slashCode.springboot.Employcontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slashCode.springboot.EmployeService.IEmployeeService;
import com.slashCode.springboot.dto.Employee;

@RestController
public class EmployController {
	@Autowired
	IEmployeeService empServiceRef;
	
	@RequestMapping("/welcome")
	public String welcomeEmploye() {
		return "hello Employee";
	}

	@RequestMapping("/Employees")
	public List<Employee> getAllEmployee() {
		System.out.println("empGetAllEmploy is hitted");
		return empServiceRef.getAllEmployee();
	}
	
	@RequestMapping("/Employees/{empId}")
	public Employee getEmployeeById(@PathVariable int empId) {
		System.out.println("empById is hitted");
		return empServiceRef.getEmployeeById(empId);
	}
	
	@RequestMapping(method = RequestMethod.POST , value="/addEmployees")
	public void addEmployee( @RequestBody Employee employee) {
		System.out.println("addEmployeeIsHited is hitted");
		empServiceRef.addEmployee( employee );
		
	}
	
	@RequestMapping(method = RequestMethod.PUT , value="/updateEmployees/{empId}")
	public void updateEmployee( @RequestBody Employee employee, @PathVariable int empId) {
		System.out.println("updateEmployeeIsHited is hitted");
		empServiceRef.updateEmployee( employee,empId );
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value="/deleteEmployees/{empId}")
	public void deleteEmployee( @PathVariable int empId) {
		System.out.println("deleteEmployeeIsHited is hitted");
		empServiceRef.deleteEmployee(empId );
		
	}
	
	


}
