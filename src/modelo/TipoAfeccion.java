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
 * TipoAfeccion generated by hbm2java
 */
@Entity
@Table(name = "tipo_afeccion")
public class TipoAfeccion implements java.io.Serializable {

	private String codigoAfeccion;
	private String descripcion;
	private char estatus;
	private String nombre;
	private Set<AfeccionJugador> afeccionJugadors = new HashSet<AfeccionJugador>(
			0);

	public TipoAfeccion() {
	}

	public TipoAfeccion(String codigoAfeccion, String descripcion,
			char estatus, String nombre) {
		this.codigoAfeccion = codigoAfeccion;
		this.descripcion = descripcion;
		this.estatus = estatus;
		this.nombre = nombre;
	}

	public TipoAfeccion(String codigoAfeccion, String descripcion,
			char estatus, String nombre, Set<AfeccionJugador> afeccionJugadors) {
		this.codigoAfeccion = codigoAfeccion;
		this.descripcion = descripcion;
		this.estatus = estatus;
		this.nombre = nombre;
		this.afeccionJugadors = afeccionJugadors;
	}

	@Id
	@Column(name = "codigo_afeccion", unique = true, nullable = false)
	public String getCodigoAfeccion() {
		return this.codigoAfeccion;
	}

	public void setCodigoAfeccion(String codigoAfeccion) {
		this.codigoAfeccion = codigoAfeccion;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoAfeccion")
	public Set<AfeccionJugador> getAfeccionJugadors() {
		return this.afeccionJugadors;
	}

	public void setAfeccionJugadors(Set<AfeccionJugador> afeccionJugadors) {
		this.afeccionJugadors = afeccionJugadors;
	}

}
