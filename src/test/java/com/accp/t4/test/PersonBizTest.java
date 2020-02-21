package com.accp.t4.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.t4.biz.PersonBiz;
import com.accp.t4.pojo.Address;
import com.accp.t4.pojo.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-ctx.xml" })
public class PersonBizTest {
	
	@Autowired
	private PersonBiz personBiz;
	
	@Test
	public void testQuery() {
		
	}
}
