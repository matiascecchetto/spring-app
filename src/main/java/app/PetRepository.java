package app;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
// import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//
// @RepositoryRestResource(collectionResourceRel = "pets")
public interface PetRepository extends CrudRepository<Pet, Long> {

}
