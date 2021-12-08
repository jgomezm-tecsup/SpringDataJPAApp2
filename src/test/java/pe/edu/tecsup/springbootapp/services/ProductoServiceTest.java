package pe.edu.tecsup.springbootapp.services;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.tecsup.springbootapp.entities.Producto;

@SpringBootTest
class ProductoServiceTest {

	private static Logger log 
		= LoggerFactory.getLogger(ProductoServiceTest.class);

	@Autowired
	private ProductoService productoService;
	
	@Test
	void testListar() throws Exception {
		
		List<Producto> prods = productoService.findAll();
		
		log.info(">>>>" + prods.toString());
		
		assertThat(prods.isEmpty(), is(false));
		//assertThat(cats.size(), is(3));

	}
	
	@Test
	void testDummy() throws Exception {
		
		List<Producto> prods = productoService.findAll();

		log.info("Print by foreach");
		for(Producto cat : prods) log.info(cat.toString());
				
		log.info("Print by stream");
		prods.stream().forEach(item -> log.info(item.toString()));

	}

	
}
