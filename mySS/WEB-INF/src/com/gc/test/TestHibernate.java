/*
 * Created on 2006-5-23
 * TODO
 * author:gf
 */
package com.gc.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gc.vo.User;

public class TestHibernate {
	private SessionFactory sessionFactory = new Configuration().configure()
			.buildSessionFactory();

	public static void main(String[] args) throws HibernateException {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();

		User user = new User();
		user.setPassword("gd");
		user.setUsername("gd");
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
