package com.slashCode.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slashCode.springboot.dto.Employee;

@Repository
public interface IEmployeeDao extends JpaRepository<Employee, Integer> {

}
