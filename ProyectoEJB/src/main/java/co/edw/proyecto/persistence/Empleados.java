package co.edw.proyecto.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the EMPLEADOS database table.
 * 
 */
@Entity
@Table(name="EMPLEADOS")
@NamedQueries({
	@NamedQuery(name=Empleados.Queries.CONSULTAR_EMPLEADOS_POR_ESTADO, query="SELECT t FROM Empleados t WHERE t.estado = :estado")
})
//@NamedQuery(name="Empleados.findAll", query="SELECT e FROM Empleados e")
public class Empleados implements Serializable {
	private static final long serialVersionUID = 1L;

	public interface Queries {
		String CONSULTAR_EMPLEADOS_POR_ESTADO = "Empleados.findByEstado";
	}
	
	@Id
	@SequenceGenerator(name="EMPLEADOS_ID_GENERATOR", sequenceName="SEQ_EMPLEADOS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMPLEADOS_ID_GENERATOR")
	private long id;

	private BigDecimal estado;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String nombre;

	private BigDecimal salario;

	//bi-directional many-to-one association to Grupos
	@ManyToOne
	@JoinColumn(name="GRUPOS")
	private Grupos gruposBean;

	public Empleados() {
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

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getSalario() {
		return this.salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Grupos getGruposBean() {
		return this.gruposBean;
	}

	public void setGruposBean(Grupos gruposBean) {
		this.gruposBean = gruposBean;
	}

}