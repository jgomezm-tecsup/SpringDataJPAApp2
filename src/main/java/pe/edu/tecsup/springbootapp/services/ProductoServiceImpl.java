package pe.edu.tecsup.springbootapp.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.tecsup.springbootapp.entities.Producto;
import pe.edu.tecsup.springbootapp.repositories.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	private static Logger log 
		= LoggerFactory.getLogger(ProductoServiceImpl.class);
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public List<Producto> findAll() {

		log.info("calling services ....!") ;
		
		return productoRepository.findAll();

	}

	@Override
	public Producto findById(Long id) {
		
		return productoRepository.findById(id).get();
	
	}

	@Override
	public Producto save(Producto producto) {

		return productoRepository.save(producto);
	
	}

	@Override
	public void deleteById(Long id) {

		productoRepository.deleteById(id);
	
	}

	@Override
	public List<Producto> findByNameLike(String nombre) {
		
		return productoRepository.findByNameLike(nombre);
		
	}

	
}
