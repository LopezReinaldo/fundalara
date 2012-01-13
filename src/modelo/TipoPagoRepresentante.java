package modelo;

// Generated 13/01/2012 03:34:55 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TipoPagoRepresentante generated by hbm2java
 */
@Entity
@Table(name = "tipo_pago_representante", schema = "public")
public class TipoPagoRepresentante implements java.io.Serializable {

	private int codigoTipoPagoRepresentante;
	private DatoBasico datoBasico;
	private String descripcion;
	private Double monto;
	private char estatus;

	public TipoPagoRepresentante() {
	}

	public TipoPagoRepresentante(int codigoTipoPagoRepresentante,
			DatoBasico datoBasico, String descripcion, char estatus) {
		this.codigoTipoPagoRepresentante = codigoTipoPagoRepresentante;
		this.datoBasico = datoBasico;
		this.descripcion = descripcion;
		this.estatus = estatus;
	}

	public TipoPagoRepresentante(int codigoTipoPagoRepresentante,
			DatoBasico datoBasico, String descripcion, Double monto,
			char estatus) {
		this.codigoTipoPagoRepresentante = codigoTipoPagoRepresentante;
		this.datoBasico = datoBasico;
		this.descripcion = descripcion;
		this.monto = monto;
		this.estatus = estatus;
	}

	@Id
	@Column(name = "codigo_tipo_pago_representante", unique = true, nullable = false)
	public int getCodigoTipoPagoRepresentante() {
		return this.codigoTipoPagoRepresentante;
	}

	public void setCodigoTipoPagoRepresentante(int codigoTipoPagoRepresentante) {
		this.codigoTipoPagoRepresentante = codigoTipoPagoRepresentante;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tipo_ingreso", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@Column(name = "descripcion", nullable = false)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "monto", precision = 17, scale = 17)
	public Double getMonto() {
		return this.monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
