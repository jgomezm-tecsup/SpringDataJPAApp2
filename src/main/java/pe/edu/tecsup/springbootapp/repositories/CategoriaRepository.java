package pe.edu.tecsup.springbootapp.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import pe.edu.tecsup.springbootapp.entities.Categoria;

public interface CategoriaRepository 
		extends CrudRepository<Categoria, Long> {

	// CRUD : Create, Read , Update and Delete 
	
	@Override
	List<Categoria> findAll();

	@Override
	Optional<Categoria> findById(Long id);
	
}
