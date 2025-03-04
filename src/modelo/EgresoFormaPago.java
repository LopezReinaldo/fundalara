<<<<<<< HEAD
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
 * EgresoFormaPago generated by hbm2java
 */
@Entity
@Table(name = "egreso_forma_pago", schema = "public")
public class EgresoFormaPago implements java.io.Serializable {

	private EgresoFormaPagoId id;
	private Egreso egreso;
	private DatoBasico datoBasicoByCodigoFormaPago;
	private DatoBasico datoBasicoByCodigoBanco;
	private DatoBasico datoBasicoByCodigoTarjeta;
	private double monto;
	private char estatus;
	private String numeroDocuemntoPago;

	public EgresoFormaPago() {
	}

	public EgresoFormaPago(EgresoFormaPagoId id, Egreso egreso, double monto,
			char estatus) {
		this.id = id;
		this.egreso = egreso;
		this.monto = monto;
		this.estatus = estatus;
	}

	public EgresoFormaPago(EgresoFormaPagoId id, Egreso egreso,
			DatoBasico datoBasicoByCodigoFormaPago,
			DatoBasico datoBasicoByCodigoBanco,
			DatoBasico datoBasicoByCodigoTarjeta, double monto, char estatus,
			String numeroDocuemntoPago) {
		this.id = id;
		this.egreso = egreso;
		this.datoBasicoByCodigoFormaPago = datoBasicoByCodigoFormaPago;
		this.datoBasicoByCodigoBanco = datoBasicoByCodigoBanco;
		this.datoBasicoByCodigoTarjeta = datoBasicoByCodigoTarjeta;
		this.monto = monto;
		this.estatus = estatus;
		this.numeroDocuemntoPago = numeroDocuemntoPago;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoEgresoFormaPago", column = @Column(name = "codigo_egreso_forma_pago", nullable = false)),
			@AttributeOverride(name = "codigoEgreso", column = @Column(name = "codigo_egreso", nullable = false)) })
	public EgresoFormaPagoId getId() {
		return this.id;
	}

	public void setId(EgresoFormaPagoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_egreso", nullable = false, insertable = false, updatable = false)
	public Egreso getEgreso() {
		return this.egreso;
	}

	public void setEgreso(Egreso egreso) {
		this.egreso = egreso;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_forma_pago")
	public DatoBasico getDatoBasicoByCodigoFormaPago() {
		return this.datoBasicoByCodigoFormaPago;
	}

	public void setDatoBasicoByCodigoFormaPago(
			DatoBasico datoBasicoByCodigoFormaPago) {
		this.datoBasicoByCodigoFormaPago = datoBasicoByCodigoFormaPago;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_banco")
	public DatoBasico getDatoBasicoByCodigoBanco() {
		return this.datoBasicoByCodigoBanco;
	}

	public void setDatoBasicoByCodigoBanco(DatoBasico datoBasicoByCodigoBanco) {
		this.datoBasicoByCodigoBanco = datoBasicoByCodigoBanco;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tarjeta")
	public DatoBasico getDatoBasicoByCodigoTarjeta() {
		return this.datoBasicoByCodigoTarjeta;
	}

	public void setDatoBasicoByCodigoTarjeta(
			DatoBasico datoBasicoByCodigoTarjeta) {
		this.datoBasicoByCodigoTarjeta = datoBasicoByCodigoTarjeta;
	}

	@Column(name = "monto", nullable = false, precision = 17, scale = 17)
	public double getMonto() {
		return this.monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@Column(name = "numero_docuemnto_pago")
	public String getNumeroDocuemntoPago() {
		return this.numeroDocuemntoPago;
	}

	public void setNumeroDocuemntoPago(String numeroDocuemntoPago) {
		this.numeroDocuemntoPago = numeroDocuemntoPago;
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
 * EgresoFormaPago generated by hbm2java
 */
@Entity
@Table(name = "egreso_forma_pago", schema = "public")
public class EgresoFormaPago implements java.io.Serializable {

	private EgresoFormaPagoId id;
	private Egreso egreso;
	private DatoBasico datoBasicoByCodigoFormaPago;
	private DatoBasico datoBasicoByCodigoBanco;
	private DatoBasico datoBasicoByCodigoTarjeta;
	private double monto;
	private char estatus;
	private String numeroDocuemntoPago;

	public EgresoFormaPago() {
	}

	public EgresoFormaPago(EgresoFormaPagoId id, Egreso egreso, double monto,
			char estatus) {
		this.id = id;
		this.egreso = egreso;
		this.monto = monto;
		this.estatus = estatus;
	}

	public EgresoFormaPago(EgresoFormaPagoId id, Egreso egreso,
			DatoBasico datoBasicoByCodigoFormaPago,
			DatoBasico datoBasicoByCodigoBanco,
			DatoBasico datoBasicoByCodigoTarjeta, double monto, char estatus,
			String numeroDocuemntoPago) {
		this.id = id;
		this.egreso = egreso;
		this.datoBasicoByCodigoFormaPago = datoBasicoByCodigoFormaPago;
		this.datoBasicoByCodigoBanco = datoBasicoByCodigoBanco;
		this.datoBasicoByCodigoTarjeta = datoBasicoByCodigoTarjeta;
		this.monto = monto;
		this.estatus = estatus;
		this.numeroDocuemntoPago = numeroDocuemntoPago;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoEgresoFormaPago", column = @Column(name = "codigo_egreso_forma_pago", nullable = false)),
			@AttributeOverride(name = "codigoEgreso", column = @Column(name = "codigo_egreso", nullable = false)) })
	public EgresoFormaPagoId getId() {
		return this.id;
	}

	public void setId(EgresoFormaPagoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_egreso", nullable = false, insertable = false, updatable = false)
	public Egreso getEgreso() {
		return this.egreso;
	}

	public void setEgreso(Egreso egreso) {
		this.egreso = egreso;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_forma_pago")
	public DatoBasico getDatoBasicoByCodigoFormaPago() {
		return this.datoBasicoByCodigoFormaPago;
	}

	public void setDatoBasicoByCodigoFormaPago(
			DatoBasico datoBasicoByCodigoFormaPago) {
		this.datoBasicoByCodigoFormaPago = datoBasicoByCodigoFormaPago;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_banco")
	public DatoBasico getDatoBasicoByCodigoBanco() {
		return this.datoBasicoByCodigoBanco;
	}

	public void setDatoBasicoByCodigoBanco(DatoBasico datoBasicoByCodigoBanco) {
		this.datoBasicoByCodigoBanco = datoBasicoByCodigoBanco;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tarjeta")
	public DatoBasico getDatoBasicoByCodigoTarjeta() {
		return this.datoBasicoByCodigoTarjeta;
	}

	public void setDatoBasicoByCodigoTarjeta(
			DatoBasico datoBasicoByCodigoTarjeta) {
		this.datoBasicoByCodigoTarjeta = datoBasicoByCodigoTarjeta;
	}

	@Column(name = "monto", nullable = false, precision = 17, scale = 17)
	public double getMonto() {
		return this.monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@Column(name = "numero_docuemnto_pago")
	public String getNumeroDocuemntoPago() {
		return this.numeroDocuemntoPago;
	}

	public void setNumeroDocuemntoPago(String numeroDocuemntoPago) {
		this.numeroDocuemntoPago = numeroDocuemntoPago;
	}

}
>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
