package modelo;

// Generated 25/01/2012 10:43:43 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Requisicion generated by hbm2java
 */
@Entity
@Table(name = "requisicion", schema = "public")
public class Requisicion implements java.io.Serializable {

	private int codigoRequisicion;
	private DatoBasico datoBasico;
	private Personal personal;
	private Date fechaEmision;
	private Date fechaEntrega;
	private String motivoRequisicion;
	private char estatus;
	private Set<DetalleRequisicion> detalleRequisicions = new HashSet<DetalleRequisicion>(
			0);

	public Requisicion() {
	}

	public Requisicion(int codigoRequisicion, DatoBasico datoBasico,
			Personal personal, Date fechaEmision, Date fechaEntrega,
			char estatus) {
		this.codigoRequisicion = codigoRequisicion;
		this.datoBasico = datoBasico;
		this.personal = personal;
		this.fechaEmision = fechaEmision;
		this.fechaEntrega = fechaEntrega;
		this.estatus = estatus;
	}

	public Requisicion(int codigoRequisicion, DatoBasico datoBasico,
			Personal personal, Date fechaEmision, Date fechaEntrega,
			String motivoRequisicion, char estatus,
			Set<DetalleRequisicion> detalleRequisicions) {
		this.codigoRequisicion = codigoRequisicion;
		this.datoBasico = datoBasico;
		this.personal = personal;
		this.fechaEmision = fechaEmision;
		this.fechaEntrega = fechaEntrega;
		this.motivoRequisicion = motivoRequisicion;
		this.estatus = estatus;
		this.detalleRequisicions = detalleRequisicions;
	}

	@Id
	@Column(name = "codigo_requisicion", unique = true, nullable = false)
	public int getCodigoRequisicion() {
		return this.codigoRequisicion;
	}

	public void setCodigoRequisicion(int codigoRequisicion) {
		this.codigoRequisicion = codigoRequisicion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_estado_requisicion", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula_rif", nullable = false)
	public Personal getPersonal() {
		return this.personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_emision", nullable = false, length = 13)
	public Date getFechaEmision() {
		return this.fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_entrega", nullable = false, length = 13)
	public Date getFechaEntrega() {
		return this.fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	@Column(name = "motivo_requisicion")
	public String getMotivoRequisicion() {
		return this.motivoRequisicion;
	}

	public void setMotivoRequisicion(String motivoRequisicion) {
		this.motivoRequisicion = motivoRequisicion;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "requisicion")
	public Set<DetalleRequisicion> getDetalleRequisicions() {
		return this.detalleRequisicions;
	}

	public void setDetalleRequisicions(
			Set<DetalleRequisicion> detalleRequisicions) {
		this.detalleRequisicions = detalleRequisicions;
	}

}
