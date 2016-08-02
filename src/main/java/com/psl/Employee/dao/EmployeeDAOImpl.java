package com.psl.Employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.psl.Employee.entity.Employee;

@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public List<Employee> getAllEmployees() {
		return template.query("select * from employee", new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int arg1)
					throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				return e;
			}
			
			
		});
	}

}
