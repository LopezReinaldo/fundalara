package modelo;

// Generated 25/01/2012 10:43:43 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * InstalacionEjecutada generated by hbm2java
 */
@Entity
@Table(name = "instalacion_ejecutada", schema = "public")
public class InstalacionEjecutada implements java.io.Serializable {

	private InstalacionEjecutadaId id;
	private DatoBasico datoBasico;
	private SesionEjecutada sesionEjecutada;
	private InstalacionUtilizada instalacionUtilizada;
	private String observacion;
	private char estatus;

	public InstalacionEjecutada() {
	}

	public InstalacionEjecutada(InstalacionEjecutadaId id,
			DatoBasico datoBasico, SesionEjecutada sesionEjecutada,
			InstalacionUtilizada instalacionUtilizada, String observacion,
			char estatus) {
		this.id = id;
		this.datoBasico = datoBasico;
		this.sesionEjecutada = sesionEjecutada;
		this.instalacionUtilizada = instalacionUtilizada;
		this.observacion = observacion;
		this.estatus = estatus;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoSesionEjecutada", column = @Column(name = "codigo_sesion_ejecutada", nullable = false)),
			@AttributeOverride(name = "codigoInstalacionUtilizada", column = @Column(name = "codigo_instalacion_utilizada", nullable = false)) })
	public InstalacionEjecutadaId getId() {
		return this.id;
	}

	public void setId(InstalacionEjecutadaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "eventualidad_instalacion", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_sesion_ejecutada", nullable = false, insertable = false, updatable = false)
	public SesionEjecutada getSesionEjecutada() {
		return this.sesionEjecutada;
	}

	public void setSesionEjecutada(SesionEjecutada sesionEjecutada) {
		this.sesionEjecutada = sesionEjecutada;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_instalacion_utilizada", nullable = false, insertable = false, updatable = false)
	public InstalacionUtilizada getInstalacionUtilizada() {
		return this.instalacionUtilizada;
	}

	public void setInstalacionUtilizada(
			InstalacionUtilizada instalacionUtilizada) {
		this.instalacionUtilizada = instalacionUtilizada;
	}

	@Column(name = "observacion", nullable = false)
	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
