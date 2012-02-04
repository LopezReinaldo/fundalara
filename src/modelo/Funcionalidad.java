package modelo;

// Generated 25/01/2012 10:43:43 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Funcionalidad generated by hbm2java
 */
@Entity
@Table(name = "funcionalidad", schema = "public")
public class Funcionalidad implements java.io.Serializable {

	private int codigoFunconalidad;
	private Funcionalidad funcionalidad;
	private String nombre;
	private char estatus;
	private Set<Grupo> grupos = new HashSet<Grupo>(0);
	private Set<Funcionalidad> funcionalidads = new HashSet<Funcionalidad>(0);

	public Funcionalidad() {
	}

	public Funcionalidad(int codigoFunconalidad, Funcionalidad funcionalidad,
			String nombre, char estatus) {
		this.codigoFunconalidad = codigoFunconalidad;
		this.funcionalidad = funcionalidad;
		this.nombre = nombre;
		this.estatus = estatus;
	}

	public Funcionalidad(int codigoFunconalidad, Funcionalidad funcionalidad,
			String nombre, char estatus, Set<Grupo> grupos,
			Set<Funcionalidad> funcionalidads) {
		this.codigoFunconalidad = codigoFunconalidad;
		this.funcionalidad = funcionalidad;
		this.nombre = nombre;
		this.estatus = estatus;
		this.grupos = grupos;
		this.funcionalidads = funcionalidads;
	}

	@Id
	@Column(name = "codigo_funconalidad", unique = true, nullable = false)
	public int getCodigoFunconalidad() {
		return this.codigoFunconalidad;
	}

	public void setCodigoFunconalidad(int codigoFunconalidad) {
		this.codigoFunconalidad = codigoFunconalidad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_codigo_funconalidad", nullable = false)
	public Funcionalidad getFuncionalidad() {
		return this.funcionalidad;
	}

	public void setFuncionalidad(Funcionalidad funcionalidad) {
		this.funcionalidad = funcionalidad;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "funcionalidad_grupo", schema = "public", joinColumns = { @JoinColumn(name = "codigo_funconalidad", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "codigo_grupo", nullable = false, updatable = false) })
	public Set<Grupo> getGrupos() {
		return this.grupos;
	}

	public void setGrupos(Set<Grupo> grupos) {
		this.grupos = grupos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "funcionalidad")
	public Set<Funcionalidad> getFuncionalidads() {
		return this.funcionalidads;
	}

	public void setFuncionalidads(Set<Funcionalidad> funcionalidads) {
		this.funcionalidads = funcionalidads;
	}

}
