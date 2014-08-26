package pl.alkom.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.alkom.spring.model.Person;

/**
 * Author: Daniel
 */
public interface PersonRepository extends CrudRepository<Person, Long> {
}
