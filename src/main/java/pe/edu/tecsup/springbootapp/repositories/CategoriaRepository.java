package pe.edu.tecsup.springbootapp.repositories;

import org.springframework.data.repository.CrudRepository;

import pe.edu.tecsup.springbootapp.entities.Categoria;

public interface CategoriaRepository 
		extends CrudRepository<Categoria, Long> {
	
	// CRUD : Create, Read , Update and Delete 
	

}
