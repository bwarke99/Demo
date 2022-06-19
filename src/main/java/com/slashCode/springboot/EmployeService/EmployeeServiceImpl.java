package com.slashCode.springboot.EmployeService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slashCode.springboot.dao.IEmployeeDao;
import com.slashCode.springboot.dto.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	List<Employee> empList = new ArrayList<>( Arrays.asList(new Employee(1, "rohan", "payment"), 
			new Employee(2, "sushrut", "devisonal"),
			new Employee(3, "saurabh", "S1234"), 
			new Employee(4, "shravam", "S4561")

	));
	
	@Autowired
	private IEmployeeDao daoRef;

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		//return empList;
	 return	daoRef.findAll();
	}
	
	/*  
	 @Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empList;
	 
	}

	  */

	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		//return empList.stream().filter(e -> e.getEmpId() == empId).findFirst().get();
		return daoRef.getOne(empId);

	}
	
	/*
	 @Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return empList.stream().filter(e -> e.getEmpId() == empId).findFirst().get();
		}
	 
	 */

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		empList.add(employee);
		daoRef.save(employee);
		
	}

	@Override
	public void updateEmployee(Employee employee, int empId) {
		/*
		 * // TODO Auto-generated method stub for(int i=0; i< empList.size();i++ ) {
		 * Employee e = empList.get(i); if(e.getEmpId()==empId) { empList.set(i,
		 * employee); return; }
		 * 
		 * }
	
		 *
		 */
		
		daoRef.save(employee);
		
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		//empList.removeIf(e->e.getEmpId()==empId);
		daoRef.deleteById(empId);
		
	}

	
}
