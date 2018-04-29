package hello.interfaces;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hello.model.Person;

@Repository
@Configuration
public interface PersonRepository extends JpaRepository<Person, Integer>{
	
}
