/*
 * Created on 2006-5-23
 * TODO
 * author:gf
 */
package com.gc.junit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gc.vo.User;

import junit.framework.TestCase;

public class TestHibernate extends TestCase {
	private SessionFactory sessionFactory = null;
	private Session session = null;

	protected void setUp() throws Exception {
		super.setUp();
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
	}

	public void testCreate() {
		Transaction transaction = session.beginTransaction();
		User user = new User();

		user.setPassword("gd");
		user.setUsername("gd");
		session.save(user);
		transaction.commit();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		session.close();
		sessionFactory.close();
		sessionFactory = null;
	}
}
