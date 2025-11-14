package mz.com.ngoca.repository;

import mz.com.ngoca.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}
