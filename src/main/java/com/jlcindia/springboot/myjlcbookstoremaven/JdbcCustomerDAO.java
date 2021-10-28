package com.jlcindia.springboot.myjlcbookstoremaven;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("custDAO")
public class JdbcCustomerDAO implements CustomerDAO {

	@Autowired
	JdbcTemplate jdbcTemp;

	public void addCustomer(Customer cust) {
		// TODO Auto-generated method stub
		String sql = "insert into customers values(?,?,?,?,?)";
		jdbcTemp.update(sql, cust.getCid(), cust.getCname(), cust.getEmail(), cust.getPhone(), cust.getCity());

	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		String sql = "select * from customers";
		List<Customer> list=jdbcTemp.query(sql, new CustomerRowMapper());
		return list;
	}

	
}
