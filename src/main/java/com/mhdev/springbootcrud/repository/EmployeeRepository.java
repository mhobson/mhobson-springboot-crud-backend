package com.mhdev.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mhdev.springbootcrud.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
