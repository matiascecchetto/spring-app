package app;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import org.springframework.scheduling.annotation.Async;
import java.util.concurrent.CompletableFuture;

// Direct Spring MVC to create RESTful endpoints at /people
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

	@Async
	CompletableFuture<Person> findByLastName(@Param("surname") String surname);
	@Async
  CompletableFuture<Person> findByFirstName(@Param("name") String name);

}
