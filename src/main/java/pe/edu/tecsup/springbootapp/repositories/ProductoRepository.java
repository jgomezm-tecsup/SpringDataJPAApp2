package pe.edu.tecsup.springbootapp.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import pe.edu.tecsup.springbootapp.entities.Producto;

public interface ProductoRepository 
		extends CrudRepository<Producto, Long> {

	// CRUD : Create, Read , Update and Delete 
	
	@Override
	List<Producto> findAll();

	@Override
	Optional<Producto> findById(Long id);
	
}
