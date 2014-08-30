package pl.alkom.spring.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pl.alkom.spring.model.Person;

/**
 * Author: Daniel
 */
public interface PersonRepository extends CrudRepository<Person, Long> {

    public Iterable<Person> findByName(String name);

    @Query("select p from Person p where p.name = :name order by p.name")
    public Iterable<Person> findByNameUsingJPQL(@Param("name") String name);
}
