package hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.interfaces.PersonRepository;
import hello.interfaces.PersonService;
import hello.model.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public void addPerson(Person person) {
		
		System.out.println("in service method: adderson " +person.getPersonName());
		person.getPersonName();
		personRepository.save(person);
		
	}

	/*@Autowired
	public PersonServiceImpl(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}*/
	
}
