package ph.com.alliance.jpa.functions.employee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ph.com.alliance.jpa.functions.employee.model.Employee;
import ph.com.alliance.jpa.functions.employee.model.EmployeeModel;
import ph.com.alliance.jpa.functions.ticket.model.Ticket;

@Repository
public interface IEmployeeDao extends JpaRepository<EmployeeModel, Integer>{
	@Query(value="select * from hr.employee where username = :username and password = :password", nativeQuery = true)
	List<EmployeeModel> findEmployee(@Param(value = "username") String username, @Param(value = "password") String password);

}