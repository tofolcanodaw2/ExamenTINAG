package aplicacion.modelo.pojo;

import javax.xml.bind.annotation.XmlRootElement;

/***
 * Pojo con los datos de un tipo de sexo
 * 
 * @author tofol
 *
 */
@XmlRootElement
public class TiposSexo {
	private Integer id;
	private String nombre;

	public TiposSexo() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
