package app;

import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.query.Param;

import org.springframework.scheduling.annotation.Async;
import java.util.concurrent.CompletableFuture;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
// import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//
// @RepositoryRestResource(collectionResourceRel = "pets")
public interface PetRepository extends CrudRepository<Pet, Long> {

  @Async
  CompletableFuture<Pet> findByName(@Param("name") String name);
  @Async
  CompletableFuture<Pet> findByEmail(@Param("email") String email);

}
