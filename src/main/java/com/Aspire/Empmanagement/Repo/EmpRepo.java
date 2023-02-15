package com.Aspire.Empmanagement.Repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Aspire.Empmanagement.Entity.Employee;


public interface EmpRepo extends JpaRepository <Employee, Long>{

	List<Employee> getByjoindate(LocalDate joindate);
	
	
	

}



