package hello.interfaces;

import org.springframework.stereotype.Service;

import hello.model.Person;

@Service
public interface PersonService {
	void addPerson(Person person) throws Exception;
}
