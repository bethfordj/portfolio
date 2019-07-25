package com.bethfordj.dao;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

public abstract class DAOIntegrationTest {

	private static SingleConnectionDataSource dataSource;

	@BeforeClass
	public static void setupDataSource() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/local_businesses");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");

		/* Turn Off AutoCommit */
		dataSource.setAutoCommit(true);
	}

	@AfterClass
	public static void closeDataSource() throws SQLException {
		dataSource.destroy();
	}
//
//	/* Rollback */
//	@After
//	public void rollback() throws SQLException {
//		dataSource.getConnection().rollback();
//	}

	/* Offer Access to the DB */
	public DataSource getDataSource() {
		return dataSource;
	}
}
