package com.Aspire.Empmanagement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Aspire.Empmanagement.Entity.Employee;
import com.Aspire.Empmanagement.controller.Empcontroller;

@SpringBootTest
class EmpmanagementApplicationTests {

	@Autowired
	private Empcontroller emp;
	
	
	
	@Test
	void forSaveEmp() {
		
		Employee obj=new Employee();
		obj.setName("aman Gupta");
		obj.setEmail("aman@gmail.com");
		obj.setJoindate(LocalDate.now());
		obj.setSalary(54000);
		String result= emp.addEmprecord(obj);
		assertEquals("employee add fail", result);
		
		
		
	}



	

}
