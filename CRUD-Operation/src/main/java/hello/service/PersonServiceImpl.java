package hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.interfaces.PersonDAO;
import hello.interfaces.PersonService;
import hello.model.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDAO personDAO;
	
	public void addPerson(Person person) {
		
		System.out.println("in service " +person.getPersonName());
		person.getPersonName();
		personDAO.addPerson(person);
		
	}
	
}
