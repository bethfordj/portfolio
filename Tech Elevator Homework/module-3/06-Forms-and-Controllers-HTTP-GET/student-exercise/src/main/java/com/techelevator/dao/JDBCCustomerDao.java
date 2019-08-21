package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.dao.model.Customer;
import com.techelevator.dao.model.Film;

/**
 * JDBCCustomerDao
 */
@Component
public class JDBCCustomerDao implements CustomerDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JDBCCustomerDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    @Override
    public List<Customer> searchAndSortCustomers(String search, String sort){
        List<Customer> matchingCustomers = new ArrayList<>();

        String customerSearchSql;
        SqlRowSet results;
        
        if (sort.equals("active")) {
            customerSearchSql = "Select first_name, last_name, email, active From customer " + 
            		"Where first_name Like ? OR last_name Like ? " + 
            		"Order By active ";
            results = jdbcTemplate.queryForRowSet(customerSearchSql, "%" + search.toUpperCase() + "%", "%" + search.toUpperCase() + "%");
        }
        
        else if (sort.equals("email")) {
            
	        customerSearchSql = "Select first_name, last_name, email, active From customer " + 
	        	"Where first_name Like ? OR last_name Like ? " + 
	        	"Order By email ";
	        results = jdbcTemplate.queryForRowSet(customerSearchSql, "%" + search.toUpperCase() + "%", "%" + search.toUpperCase() + "%");
        }
        
        else {
            customerSearchSql = "Select first_name, last_name, email, active From customer " + 
            	"Where first_name Like ? OR last_name Like ? " + 
            	"Order By last_name ";
            results = jdbcTemplate.queryForRowSet(customerSearchSql, "%" + search.toUpperCase() + "%", "%" + search.toUpperCase() + "%");
        }
        
        while (results.next()) {
            matchingCustomers.add(mapRowToCustomer(results));
        }
        return matchingCustomers;
    }
    
    private Customer mapRowToCustomer(SqlRowSet results) {
        Customer customerRow = new Customer();
        customerRow.setFirstName(results.getString("first_name"));
        customerRow.setLastName(results.getString("last_name"));
        customerRow.setEmail(results.getString("email"));
        customerRow.setActive(results.getBoolean("active"));

        return customerRow;
    }

}