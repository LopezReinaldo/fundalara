<<<<<<< HEAD
package modelo;

// Generated 25/01/2012 10:43:43 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ClasificacionCompetencia generated by hbm2java
 */
@Entity
@Table(name = "clasificacion_competencia", schema = "public")
public class ClasificacionCompetencia implements java.io.Serializable {

	private int codigoClasificacionCompetencia;
	private DatoBasico datoBasico;
	private String nombre;
	private String descripcion;
	private char estatus;
	private Set<CondicionCompetencia> condicionCompetencias = new HashSet<CondicionCompetencia>(
			0);
	private Set<Competencia> competencias = new HashSet<Competencia>(0);

	public ClasificacionCompetencia() {
	}

	public ClasificacionCompetencia(int codigoClasificacionCompetencia,
			DatoBasico datoBasico, String nombre, char estatus) {
		this.codigoClasificacionCompetencia = codigoClasificacionCompetencia;
		this.datoBasico = datoBasico;
		this.nombre = nombre;
		this.estatus = estatus;
	}

	public ClasificacionCompetencia(int codigoClasificacionCompetencia,
			DatoBasico datoBasico, String nombre, String descripcion,
			char estatus, Set<CondicionCompetencia> condicionCompetencias,
			Set<Competencia> competencias) {
		this.codigoClasificacionCompetencia = codigoClasificacionCompetencia;
		this.datoBasico = datoBasico;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estatus = estatus;
		this.condicionCompetencias = condicionCompetencias;
		this.competencias = competencias;
	}

	@Id
	@Column(name = "codigo_clasificacion_competencia", unique = true, nullable = false)
	public int getCodigoClasificacionCompetencia() {
		return this.codigoClasificacionCompetencia;
	}

	public void setCodigoClasificacionCompetencia(
			int codigoClasificacionCompetencia) {
		this.codigoClasificacionCompetencia = codigoClasificacionCompetencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo_competencia", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion")
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clasificacionCompetencia")
	public Set<CondicionCompetencia> getCondicionCompetencias() {
		return this.condicionCompetencias;
	}

	public void setCondicionCompetencias(
			Set<CondicionCompetencia> condicionCompetencias) {
		this.condicionCompetencias = condicionCompetencias;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clasificacionCompetencia")
	public Set<Competencia> getCompetencias() {
		return this.competencias;
	}

	public void setCompetencias(Set<Competencia> competencias) {
		this.competencias = competencias;
	}

}
=======
package modelo;

<<<<<<< HEAD
// Generated 25/01/2012 12:32:42 AM by Hibernate Tools 3.4.0.CR1
=======
<<<<<<< HEAD
// Generated 25/01/2012 12:32:42 AM by Hibernate Tools 3.4.0.CR1
=======
<<<<<<< HEAD
// Generated 25/01/2012 12:32:42 AM by Hibernate Tools 3.4.0.CR1
=======
// Generated 24/01/2012 04:28:30 AM by Hibernate Tools 3.4.0.CR1
>>>>>>> 7d4823278d0a354855f5032a99e2b48c65b33e7f
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ClasificacionCompetencia generated by hbm2java
 */
@Entity
@Table(name = "clasificacion_competencia", schema = "public")
public class ClasificacionCompetencia implements java.io.Serializable {

	private int codigoClasificacionCompetencia;
	private DatoBasico datoBasico;
	private String nombre;
	private String descripcion;
	private char estatus;
	private Set<CondicionCompetencia> condicionCompetencias = new HashSet<CondicionCompetencia>(
			0);
	private Set<Competencia> competencias = new HashSet<Competencia>(0);

	public ClasificacionCompetencia() {
	}

	public ClasificacionCompetencia(int codigoClasificacionCompetencia,
			DatoBasico datoBasico, String nombre, char estatus) {
		this.codigoClasificacionCompetencia = codigoClasificacionCompetencia;
		this.datoBasico = datoBasico;
		this.nombre = nombre;
		this.estatus = estatus;
	}

	public ClasificacionCompetencia(int codigoClasificacionCompetencia,
			DatoBasico datoBasico, String nombre, String descripcion,
			char estatus, Set<CondicionCompetencia> condicionCompetencias,
			Set<Competencia> competencias) {
		this.codigoClasificacionCompetencia = codigoClasificacionCompetencia;
		this.datoBasico = datoBasico;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estatus = estatus;
		this.condicionCompetencias = condicionCompetencias;
		this.competencias = competencias;
	}

	@Id
	@Column(name = "codigo_clasificacion_competencia", unique = true, nullable = false)
	public int getCodigoClasificacionCompetencia() {
		return this.codigoClasificacionCompetencia;
	}

	public void setCodigoClasificacionCompetencia(
			int codigoClasificacionCompetencia) {
		this.codigoClasificacionCompetencia = codigoClasificacionCompetencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo_competencia", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion")
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clasificacionCompetencia")
	public Set<CondicionCompetencia> getCondicionCompetencias() {
		return this.condicionCompetencias;
	}

	public void setCondicionCompetencias(
			Set<CondicionCompetencia> condicionCompetencias) {
		this.condicionCompetencias = condicionCompetencias;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clasificacionCompetencia")
	public Set<Competencia> getCompetencias() {
		return this.competencias;
	}

	public void setCompetencias(Set<Competencia> competencias) {
		this.competencias = competencias;
	}

}
>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
