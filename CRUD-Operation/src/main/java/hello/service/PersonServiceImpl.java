package hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.interfaces.PersonService;
import hello.model.Person;
import hello.repositories.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	PersonRepository personRepository;
	
	@Autowired
	public PersonServiceImpl(PersonRepository personRepository) {
		super();
		this.setPersonRepository(personRepository);
	}
	
	@Autowired
	public PersonRepository getPersonRepository() {
		return personRepository;
	}

	public void setPersonRepository(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public void addPerson(Person person) throws Exception {
		System.out.println("I am in Service: method addPerson");
		personRepository.save(person);
		
	}
	
}
