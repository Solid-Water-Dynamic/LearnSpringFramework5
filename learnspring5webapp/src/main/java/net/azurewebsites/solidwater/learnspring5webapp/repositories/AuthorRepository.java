package net.azurewebsites.solidwater.learnspring5webapp.repositories;

import net.azurewebsites.solidwater.learnspring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
