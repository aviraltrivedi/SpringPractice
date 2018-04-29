package hello.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hello.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
