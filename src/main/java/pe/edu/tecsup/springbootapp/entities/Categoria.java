package pe.edu.tecsup.springbootapp.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {
	
	private Long id;
	
	private String nombre;
	
	private Integer orden;

}
