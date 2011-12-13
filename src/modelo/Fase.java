package modelo;

// Generated 12/12/2011 09:17:13 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Fase generated by hbm2java
 */
@Entity
@Table(name = "fase")
public class Fase implements java.io.Serializable {

	private String codFaseEntrenamiento;
	private String descripcion;
	private char estatus;
	private String nombre;
	private Set<ActividadEntrenamiento> actividadEntrenamientos = new HashSet<ActividadEntrenamiento>(
			0);

	public Fase() {
	}

	public Fase(String codFaseEntrenamiento, String descripcion, char estatus,
			String nombre) {
		this.codFaseEntrenamiento = codFaseEntrenamiento;
		this.descripcion = descripcion;
		this.estatus = estatus;
		this.nombre = nombre;
	}

	public Fase(String codFaseEntrenamiento, String descripcion, char estatus,
			String nombre, Set<ActividadEntrenamiento> actividadEntrenamientos) {
		this.codFaseEntrenamiento = codFaseEntrenamiento;
		this.descripcion = descripcion;
		this.estatus = estatus;
		this.nombre = nombre;
		this.actividadEntrenamientos = actividadEntrenamientos;
	}

	@Id
	@Column(name = "cod_fase_entrenamiento", unique = true, nullable = false)
	public String getCodFaseEntrenamiento() {
		return this.codFaseEntrenamiento;
	}

	public void setCodFaseEntrenamiento(String codFaseEntrenamiento) {
		this.codFaseEntrenamiento = codFaseEntrenamiento;
	}

	@Column(name = "descripcion", nullable = false)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fase")
	public Set<ActividadEntrenamiento> getActividadEntrenamientos() {
		return this.actividadEntrenamientos;
	}

	public void setActividadEntrenamientos(
			Set<ActividadEntrenamiento> actividadEntrenamientos) {
		this.actividadEntrenamientos = actividadEntrenamientos;
	}

}
