package com.cdoss.bank.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cdoss.bank.entity.Customer;

@Repository
public class CustomerRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public Customer findById(int id) {
		return jdbcTemplate.queryForObject("select * from customer where id=?", new Object[] { id },
				new BeanPropertyRowMapper<Customer>(Customer.class));
	}

	class CustomerRowMapper implements RowMapper<Customer> {
		@Override
		public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
			Customer customer = new Customer();
			customer.setId(rs.getInt("id"));
			customer.setFirstName(rs.getString("first_name"));
			customer.setMiddleInitial(rs.getString("middle_initial"));
			customer.setLastName(rs.getString("last_name"));
			customer.setSuffix(rs.getString("suffix"));
			return customer;
		}
	}

	public List<Customer> findAll() {
		return jdbcTemplate.query("select * from customer", new CustomerRowMapper());
	}
}
