package com.techelevator.addressbook;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCPersonDAO implements PersonDAO {

	private JdbcTemplate jdbcTemplate;
	
	public JDBCPersonDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void save(Person person) {
		String sql = "INSERT INTO person (user_id, first_name, last_name) VALUES (DEFAULT, ?, ?) RETURNING user_id";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql, person.getFirstName(), person.getLastName());
		
		result.next();
		int id = result.getInt("user_id");
		person.setId(id);
		
	}

	@Override
	public Person getPersonById(int id) {
		String sql = "SELECT user_id, first_name, last_name FROM person WHERE user_id = ?";
		
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql, id);
		
		Person person = null;
		if (result.next()) {
			person = mapRowToPerson(result);
		}
		
		return person;
	}

	@Override
	public List<Person> getAllPersons() {
		String sql = "SELECT user_id, first_name, last_name  FROM person";
		
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
		
		List<Person> allPersons = new ArrayList<Person>();
		
		while (result.next()) {
			allPersons.add(mapRowToPerson(result));
		}
		
		return allPersons;
	}
	
	@Override
	public void update(Person person) {
		String sql = "UPDATE person SET first_name = ?, last_name = ? WHERE user_id = ?";
		jdbcTemplate.update(sql, person.getFirstName(), person.getLastName(), person.getId() );
		
	}
	
	@Override
	public void delete(int id) {
		String sql = "DELETE FROM person WHERE user_id = ?";
		jdbcTemplate.update(sql, id);
		
	}
	
	
	private Person mapRowToPerson(SqlRowSet result) {
		Person p = new Person();
		p.setId(result.getInt("user_id"));
		p.setFirstName(result.getString("first_name"));
		p.setLastName(result.getString("last_name"));
		return p;
	}





}
