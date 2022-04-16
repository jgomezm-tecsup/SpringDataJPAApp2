package pe.edu.tecsup.springbootapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pe.edu.tecsup.springbootapp.entities.Producto;

public interface ProductoRepository 
		extends CrudRepository<Producto, Long> {

	// CRUD : Create, Read , Update and Delete 
	
	@Override
	List<Producto> findAll();
	
	@Query("SELECT p FROM Producto p WHERE p.nombre LIKE %:name%")
	List<Producto> findByNameLike(@Param("name") String nombre);

	
}
