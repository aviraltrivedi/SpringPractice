package hello.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties.Hibernate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hello.interfaces.PersonDAO;
import hello.model.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {

	@Autowired
	Person person;

	SessionFactory sessionFactory;
	Transaction transaction;

	public void addPerson(Person person) {
		String name = person.getPersonName();
		System.out.println("in DAO "+name);
		/*Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(person);
		session.flush();
		session.close();*/
	}

}
