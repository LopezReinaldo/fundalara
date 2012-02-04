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
 * Indicador generated by hbm2java
 */
@Entity
@Table(name = "indicador", schema = "public")
public class Indicador implements java.io.Serializable {

	private int codigoIndicador;
	private DatoBasico datoBasicoByCodigoModalidad;
	private DatoBasico datoBasicoByCodigoTipoIndicador;
	private DatoBasico datoBasicoByCodigoMedicion;
	private String nombre;
	private String abreviatura;
	private String formula;
	private char estatus;
	private Set<IndicadorCategoriaCompetencia> indicadorCategoriaCompetencias = new HashSet<IndicadorCategoriaCompetencia>(
			0);

	public Indicador() {
	}

	public Indicador(int codigoIndicador,
			DatoBasico datoBasicoByCodigoModalidad,
			DatoBasico datoBasicoByCodigoTipoIndicador,
			DatoBasico datoBasicoByCodigoMedicion, String nombre,
			String abreviatura, char estatus) {
		this.codigoIndicador = codigoIndicador;
		this.datoBasicoByCodigoModalidad = datoBasicoByCodigoModalidad;
		this.datoBasicoByCodigoTipoIndicador = datoBasicoByCodigoTipoIndicador;
		this.datoBasicoByCodigoMedicion = datoBasicoByCodigoMedicion;
		this.nombre = nombre;
		this.abreviatura = abreviatura;
		this.estatus = estatus;
	}

	public Indicador(int codigoIndicador,
			DatoBasico datoBasicoByCodigoModalidad,
			DatoBasico datoBasicoByCodigoTipoIndicador,
			DatoBasico datoBasicoByCodigoMedicion, String nombre,
			String abreviatura, String formula, char estatus,
			Set<IndicadorCategoriaCompetencia> indicadorCategoriaCompetencias) {
		this.codigoIndicador = codigoIndicador;
		this.datoBasicoByCodigoModalidad = datoBasicoByCodigoModalidad;
		this.datoBasicoByCodigoTipoIndicador = datoBasicoByCodigoTipoIndicador;
		this.datoBasicoByCodigoMedicion = datoBasicoByCodigoMedicion;
		this.nombre = nombre;
		this.abreviatura = abreviatura;
		this.formula = formula;
		this.estatus = estatus;
		this.indicadorCategoriaCompetencias = indicadorCategoriaCompetencias;
	}

	@Id
	@Column(name = "codigo_indicador", unique = true, nullable = false)
	public int getCodigoIndicador() {
		return this.codigoIndicador;
	}

	public void setCodigoIndicador(int codigoIndicador) {
		this.codigoIndicador = codigoIndicador;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_modalidad", nullable = false)
	public DatoBasico getDatoBasicoByCodigoModalidad() {
		return this.datoBasicoByCodigoModalidad;
	}

	public void setDatoBasicoByCodigoModalidad(
			DatoBasico datoBasicoByCodigoModalidad) {
		this.datoBasicoByCodigoModalidad = datoBasicoByCodigoModalidad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tipo_indicador", nullable = false)
	public DatoBasico getDatoBasicoByCodigoTipoIndicador() {
		return this.datoBasicoByCodigoTipoIndicador;
	}

	public void setDatoBasicoByCodigoTipoIndicador(
			DatoBasico datoBasicoByCodigoTipoIndicador) {
		this.datoBasicoByCodigoTipoIndicador = datoBasicoByCodigoTipoIndicador;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_medicion", nullable = false)
	public DatoBasico getDatoBasicoByCodigoMedicion() {
		return this.datoBasicoByCodigoMedicion;
	}

	public void setDatoBasicoByCodigoMedicion(
			DatoBasico datoBasicoByCodigoMedicion) {
		this.datoBasicoByCodigoMedicion = datoBasicoByCodigoMedicion;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "abreviatura", nullable = false)
	public String getAbreviatura() {
		return this.abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	@Column(name = "formula")
	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "indicador")
	public Set<IndicadorCategoriaCompetencia> getIndicadorCategoriaCompetencias() {
		return this.indicadorCategoriaCompetencias;
	}

	public void setIndicadorCategoriaCompetencias(
			Set<IndicadorCategoriaCompetencia> indicadorCategoriaCompetencias) {
		this.indicadorCategoriaCompetencias = indicadorCategoriaCompetencias;
	}

}
