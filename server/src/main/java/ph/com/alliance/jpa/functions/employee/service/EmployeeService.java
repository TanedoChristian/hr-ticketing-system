package ph.com.alliance.jpa.functions.employee.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

import ph.com.alliance.jpa.functions.employee.dao.IEmployeeDao;
import ph.com.alliance.jpa.functions.employee.model.Employee;
import ph.com.alliance.jpa.functions.employee.model.EmployeeModel;
import ph.com.alliance.jpa.functions.ticket.model.Ticket;
import ph.com.alliance.jpa.functions.ticket.model.TicketModel;

@Service
public class EmployeeService implements IEmployeeService{

	@Autowired
	IEmployeeDao employeeDao;

	@Override
	public Object getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	

	@Override
	public List<EmployeeModel> findEmployee(String username, String password) {
		employeeDao.findEmployee(username, password);
		List<EmployeeModel> employees = employeeDao.findEmployee(username, password);
		return employees;
	}



	@Override
	public void insertEmployee(Employee employee) {
		
		EmployeeModel employeeModel = new EmployeeModel();
		try {
			
			employee.setEmployeeId(null);
			BeanUtils.copyProperties(employeeModel, employee);
			employeeDao.saveAndFlush(employeeModel);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
	}



	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		employeeDao.deleteById(id);
	}



	@Override
	public void updateEmployee(Integer id, Employee employee) {
		// TODO Auto-generated method stub
		try {
			
			EmployeeModel employeeModel = employeeDao.findById(id).orElse(null);
			employeeModel.setEmployeeId(id);
			
			if(employee.getFirstname() != null) {
				employeeModel.setFirstname(employee.getFirstname());
			}
			
			if(employee.getLastname() != null) {
				employeeModel.setLastname(employee.getLastname());
			}
			
			if(employee.getType() != null) {
				employeeModel.setType(employee.getType());
			}
			
			if(employee.getUsername() != null) {
				employeeModel.setUsername(employee.getUsername());
			}
			
			if(employee.getPassword() != null) {
				employeeModel.setPassword(employee.getPassword());
			}
			
			
			
			employeeDao.saveAndFlush(employeeModel);
			BeanUtils.copyProperties(employeeModel, employee);
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	



	
	
	
	
}