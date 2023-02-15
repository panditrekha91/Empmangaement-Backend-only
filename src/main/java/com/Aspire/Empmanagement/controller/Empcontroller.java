package com.Aspire.Empmanagement.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Aspire.Empmanagement.Entity.Employee;
import com.Aspire.Empmanagement.Repo.EmpRepo;

@CrossOrigin("http://localhost:3000/")
@RestController
public class Empcontroller {

	@Autowired
	private EmpRepo obj;
	
	@PostMapping("/add-employee")
	public String addEmprecord(@Valid @RequestBody Employee adde)
	{
		obj.save(adde);
		return "employee add successfully";
	}
	
	@GetMapping("/Getemplist")
	public List<Employee> getEmpList()
	{
		return obj.findAll();
		
	}
	
	@GetMapping("/justid/{empid}")
	public ResponseEntity<Employee> getempid(@PathVariable long empid)
	{
		Employee o=obj.findById(empid).get();
		System.out.println("accepted data"+o);
		return ResponseEntity.ok(o);
	}
	
	@PutMapping("updatebyid/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id,@RequestBody Employee empDetails) {
        Employee upemp = obj.findById(id).get();
               
        upemp.setName(empDetails.getName());
        upemp.setSalary(empDetails.getSalary());
        upemp.setJoindate(empDetails.getJoindate());
        upemp.setEmail(empDetails.getEmail());
        obj.save(upemp);
        

        return ResponseEntity.ok(upemp);
}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Employee> deleteemp(@PathVariable long id)
	{
		 Employee emp=obj.findById(id).get();
		 obj.delete(emp);
		 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/joindate")
	 public List<Employee> bydate(@PathVariable LocalDate joindate)
	 {
		return obj.getByjoindate(joindate);
		
	 }
	
}
