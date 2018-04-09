package co.edw.proyecto.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the GRUPO database table.
 * 
 */
@Entity
@NamedQuery(name="Grupos.findAll", query="SELECT g FROM Grupos g")
@Table(name = "GRUPOS", schema = "ANONYMOUS")
public class Grupos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="GRUPO_ID_GENERATOR", sequenceName="SEQ_GRUPO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GRUPO_ID_GENERATOR")
	private long id;

	private BigDecimal estado;

	private String nombre;

	//bi-directional many-to-one association to Empleados
	@OneToMany(mappedBy="gruposBean")
	private List<Empleados> empleados;

	public Grupos() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getEstado() {
		return this.estado;
	}

	public void setEstado(BigDecimal estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Empleados> getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(List<Empleados> empleados) {
		this.empleados = empleados;
	}

	public Empleados addEmpleados(Empleados empleados) {
		getEmpleados().add(empleados);
		empleados.setGruposBean(this);

		return empleados;
	}

	public Empleados removeEmpleados(Empleados empleados) {
		getEmpleados().remove(empleados);
		empleados.setGruposBean(null);

		return empleados;
	}

}