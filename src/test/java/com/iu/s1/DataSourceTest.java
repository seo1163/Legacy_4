package com.iu.s1;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DataSourceTest extends JunitTest {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSession session;

	@Test
	public void connectionTest() throws Exception {
		assertNotNull(dataSource.getConnection());
	}
	
	@Test
	public void sessionTest() {
		assertNotNull(session);
	}

}