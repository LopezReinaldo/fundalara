package modelo;

// Generated 13/01/2012 02:49:46 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * IngresoFormaPago generated by hbm2java
 */
@Entity
@Table(name = "ingreso_forma_pago", schema = "public")
public class IngresoFormaPago implements java.io.Serializable {

	private int codigoIngresoFormaPago;
	private Ingreso ingreso;
	private DatoBasico datoBasicoByCodigoFormaPago;
	private DatoBasico datoBasicoByCodigoTarjeta;
	private DatoBasico datoBasicoByCodigoBanco;
	private double monto;
	private char estatus;
	private String numeroDocumentoPago;

	public IngresoFormaPago() {
	}

	public IngresoFormaPago(int codigoIngresoFormaPago, double monto,
			char estatus) {
		this.codigoIngresoFormaPago = codigoIngresoFormaPago;
		this.monto = monto;
		this.estatus = estatus;
	}

	public IngresoFormaPago(int codigoIngresoFormaPago, Ingreso ingreso,
			DatoBasico datoBasicoByCodigoFormaPago,
			DatoBasico datoBasicoByCodigoTarjeta,
			DatoBasico datoBasicoByCodigoBanco, double monto, char estatus,
			String numeroDocumentoPago) {
		this.codigoIngresoFormaPago = codigoIngresoFormaPago;
		this.ingreso = ingreso;
		this.datoBasicoByCodigoFormaPago = datoBasicoByCodigoFormaPago;
		this.datoBasicoByCodigoTarjeta = datoBasicoByCodigoTarjeta;
		this.datoBasicoByCodigoBanco = datoBasicoByCodigoBanco;
		this.monto = monto;
		this.estatus = estatus;
		this.numeroDocumentoPago = numeroDocumentoPago;
	}

	@Id
	@Column(name = "codigo_ingreso_forma_pago", unique = true, nullable = false)
	public int getCodigoIngresoFormaPago() {
		return this.codigoIngresoFormaPago;
	}

	public void setCodigoIngresoFormaPago(int codigoIngresoFormaPago) {
		this.codigoIngresoFormaPago = codigoIngresoFormaPago;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "numero_documento")
	public Ingreso getIngreso() {
		return this.ingreso;
	}

	public void setIngreso(Ingreso ingreso) {
		this.ingreso = ingreso;
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
	@JoinColumn(name = "codigo_tarjeta")
	public DatoBasico getDatoBasicoByCodigoTarjeta() {
		return this.datoBasicoByCodigoTarjeta;
	}

	public void setDatoBasicoByCodigoTarjeta(
			DatoBasico datoBasicoByCodigoTarjeta) {
		this.datoBasicoByCodigoTarjeta = datoBasicoByCodigoTarjeta;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_banco")
	public DatoBasico getDatoBasicoByCodigoBanco() {
		return this.datoBasicoByCodigoBanco;
	}

	public void setDatoBasicoByCodigoBanco(DatoBasico datoBasicoByCodigoBanco) {
		this.datoBasicoByCodigoBanco = datoBasicoByCodigoBanco;
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

	@Column(name = "numero_documento_pago")
	public String getNumeroDocumentoPago() {
		return this.numeroDocumentoPago;
	}

	public void setNumeroDocumentoPago(String numeroDocumentoPago) {
		this.numeroDocumentoPago = numeroDocumentoPago;
	}

}
