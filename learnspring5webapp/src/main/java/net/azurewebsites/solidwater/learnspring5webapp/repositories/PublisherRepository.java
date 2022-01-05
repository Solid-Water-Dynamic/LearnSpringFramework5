package net.azurewebsites.solidwater.learnspring5webapp.repositories;

import net.azurewebsites.solidwater.learnspring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
