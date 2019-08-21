package com.techelevator.inventory.reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.inventory.Slot;

@Component
public class JdbcInventoryReader extends InventoryReader {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcInventoryReader(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Map<String, Slot> read() {
		
		String sql = "select (slot || ',' || name || ',' || price || ',' || type) AS item from inventory";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
		
		List<String> lines = new ArrayList<String>();
		
		while (result.next()) {
			String line = result.getString("item");
			lines.add(line);
		}
		
		return loadInventoryFromDelimitedLines(lines, ",");
	}
	
	
	
	
}
