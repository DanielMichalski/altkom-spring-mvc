package pl.alkom.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.alkom.spring.model.Team;

/**
 * Author: Daniel
 */
public interface TeamRepository extends CrudRepository<Team, Long> {
}
