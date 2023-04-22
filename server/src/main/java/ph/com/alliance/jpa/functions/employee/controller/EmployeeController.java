package ph.com.alliance.jpa.functions.employee.controller;

import java.util.List;

import javax.mail.search.IntegerComparisonTerm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

import ph.com.alliance.jpa.common.ApiResult;
import ph.com.alliance.jpa.functions.employee.model.Employee;
import ph.com.alliance.jpa.functions.employee.model.EmployeeModel;
import ph.com.alliance.jpa.functions.employee.service.IEmployeeService;

@RestController
@RequestMapping("/employee")

public class EmployeeController{
	
	@Autowired
	IEmployeeService service;

	@GetMapping("/getall")
	public Object getAllEmployee() {
		// TODO Auto-generated method stub
		return service.getAllEmployee();
		
	}
	
	@PostMapping("/insert")
	public Object insertEmployee(@RequestBody Employee employee) {
		service.insertEmployee(employee);
		return employee;
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ApiResult deleteEmployee(@PathVariable Integer id) {
	
		service.deleteEmployee(id);
		return ApiResult.CreateSuccess("Successfully Deleted!");
	}
	
	
	@PutMapping("/update/{id}")
	public ApiResult updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
		service.updateEmployee(id, employee);
		return ApiResult.CreateSuccess("Successfully Updated");
	}
	
	
	@PostMapping("/employee-login")
	public ApiResult findUsername(@RequestBody Employee employee) {
		// TODO Auto-generated method stub
		service.findEmployee(employee.getUsername(), employee.getPassword());
		return ApiResult.CreateSuccess(service.findEmployee(employee.getUsername(), employee.getPassword()));
	}
	
}