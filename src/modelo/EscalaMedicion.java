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
 * EscalaMedicion generated by hbm2java
 */
@Entity
@Table(name = "escala_medicion", schema = "public")
public class EscalaMedicion implements java.io.Serializable {

	private int codigoEscala;
	private DatoBasico datoBasico;
	private String nombre;
	private char estatus;
	private String descripcion;
	private Set<ValorEscala> valorEscalas = new HashSet<ValorEscala>(0);
	private Set<IndicadorActividadEscala> indicadorActividadEscalas = new HashSet<IndicadorActividadEscala>(
			0);

	public EscalaMedicion() {
	}

	public EscalaMedicion(int codigoEscala, DatoBasico datoBasico,
			String nombre, char estatus, String descripcion) {
		this.codigoEscala = codigoEscala;
		this.datoBasico = datoBasico;
		this.nombre = nombre;
		this.estatus = estatus;
		this.descripcion = descripcion;
	}

	public EscalaMedicion(int codigoEscala, DatoBasico datoBasico,
			String nombre, char estatus, String descripcion,
			Set<ValorEscala> valorEscalas,
			Set<IndicadorActividadEscala> indicadorActividadEscalas) {
		this.codigoEscala = codigoEscala;
		this.datoBasico = datoBasico;
		this.nombre = nombre;
		this.estatus = estatus;
		this.descripcion = descripcion;
		this.valorEscalas = valorEscalas;
		this.indicadorActividadEscalas = indicadorActividadEscalas;
	}

	@Id
	@Column(name = "codigo_escala", unique = true, nullable = false)
	public int getCodigoEscala() {
		return this.codigoEscala;
	}

	public void setCodigoEscala(int codigoEscala) {
		this.codigoEscala = codigoEscala;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo_escala", nullable = false)
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

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@Column(name = "descripcion", nullable = false)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "escalaMedicion")
	public Set<ValorEscala> getValorEscalas() {
		return this.valorEscalas;
	}

	public void setValorEscalas(Set<ValorEscala> valorEscalas) {
		this.valorEscalas = valorEscalas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "escalaMedicion")
	public Set<IndicadorActividadEscala> getIndicadorActividadEscalas() {
		return this.indicadorActividadEscalas;
	}

	public void setIndicadorActividadEscalas(
			Set<IndicadorActividadEscala> indicadorActividadEscalas) {
		this.indicadorActividadEscalas = indicadorActividadEscalas;
	}

}
