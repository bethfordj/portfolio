package com.techelevator.addressbook;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCPhoneDAO implements PhoneDAO {

	private JdbcTemplate jdbcTemplate;
	
	public JDBCPhoneDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public Phone getPhoneById(int phoneId) {
		Phone phone = null;
		String sql = "SELECT phone.phone_id, category, other_description, phone_number, person_phone.user_id AS person_id" + 
				" FROM phone" + 
				" JOIN person_phone ON phone.phone_id = person_phone.phone_id" + 
				" WHERE phone.phone_id = ?";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, phoneId);
		
		if (results.next()) {
			phone = mapRowToPhone(results);
		}
		return phone;
	}

	@Override
	public List<Phone> getPhoneEntriesByPersonId(int personId) {

		List<Phone> phones = new ArrayList<Phone>();
		String sql = " SELECT pp.user_id AS person_id, p.phone_id, p.category, p.other_description, p.phone_number" +
				" FROM person_phone pp" +
				" JOIN phone p ON pp.phone_id = p.phone_id " +
				" WHERE user_id = ?";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, personId);
		
		while(results.next()) {
			phones.add(mapRowToPhone(results));
		}
		
		return phones;
	}

	@Override
	public void save(Phone phone) {
		String sql = "INSERT INTO PHONE (phone_id, category, other_description, phone_number) VALUES (DEFAULT, ?, ?, ?) RETURNING phone_id";
		Integer id = (Integer) jdbcTemplate.queryForObject(sql, Integer.class, phone.getCategory(), phone.getCategoryDescription(), phone.getPhoneNumber());
		phone.setPhoneId(id);
		savePhonePersonRelationship(phone.getPersonId(), phone.getPhoneId());
	}

	@Override
	public void update(Phone phone) {
		String sql = "UPDATE phone SET category = ?, other_description = ?, phone_number = ? WHERE phone_id = ?";
		jdbcTemplate.update(sql, phone.getCategory(), phone.getCategoryDescription(), phone.getPhoneNumber(), phone.getPhoneId());
		
	}

	@Override
	public void delete(int phoneId) {
		deleteAllPersonRelationshipsForPhoneId(phoneId);
		String sql = "DELETE FROM phone WHERE phone_id = ?";
		jdbcTemplate.update(sql, phoneId);
	}
	
	private void deleteAllPersonRelationshipsForPhoneId(int phoneId) {
		String sql = "DELETE FROM person_phone WHERE phone_id = ?";
		jdbcTemplate.update(sql, phoneId);
	}
	
	private void savePhonePersonRelationship(int personId, int phoneId) {
		String sql = "INSERT INTO person_phone (user_id, phone_id) VALUES (?, ?)";
		jdbcTemplate.update(sql, personId, phoneId);
	}
	
	private Phone mapRowToPhone(SqlRowSet result) {
		Phone phone = new Phone();
		phone.setPhoneId(result.getInt("phone_id"));
		phone.setPersonId(result.getInt("person_id"));
		phone.setCategory(result.getString("category"));
		phone.setCategoryDescription(result.getString("other_description"));
		phone.setPhoneNumber(result.getString("phone_number"));
		return phone;
	}

}
