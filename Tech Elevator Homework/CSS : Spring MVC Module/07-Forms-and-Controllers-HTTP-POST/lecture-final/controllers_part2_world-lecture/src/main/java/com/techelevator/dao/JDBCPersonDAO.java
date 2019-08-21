package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.dao.model.Person;


@Component
public class JDBCPersonDAO implements PersonDAO {

	private JdbcTemplate db;
	
	@Autowired
	public JDBCPersonDAO(DataSource addBookDataSource) {
		db = new JdbcTemplate(addBookDataSource);
	}
	
	
	@Override
	public List<Person> getAll() {
		String sql = "SELECT user_id, first_name, last_name FROM person";
		
		SqlRowSet result = db.queryForRowSet(sql);
		
		List<Person> persons = new ArrayList<Person>();
		
		while (result.next()) {
			Person p = new Person();
			p.setUserId(result.getLong("user_id"));
			p.setFirstName(result.getString("first_name"));
			p.setLastName(result.getString("last_name"));
			persons.add(p);
		}
		return persons;
	}

	@Override
	public void add(Person person) {
		String sql = "INSERT INTO person VALUES (DEFAULT, ?, ?)";
		db.update(sql, person.getFirstName(), person.getLastName());
		
	}

	
	
}
