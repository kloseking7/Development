package com.glassbox.webinvoice.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import junit.framework.TestCase;

public class MyTest {

	

	@Test
	public void test2() {
		System.out.println("Testing");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// SessionFactory sf = new Configuration().configure()
		// .buildSessionFactory();

		// Session session = sf.openSession();

		// session.close();
//		us = (UserService) context.getBean("userService");
//		System.out.println(us.findUser("123", "123"));
//	
//		Assert.assertNotNull("123");
	}
}
