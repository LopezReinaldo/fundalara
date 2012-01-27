package modelo;

// Generated 25/01/2012 12:32:42 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EgresoFormaPagoId generated by hbm2java
 */
@Embeddable
public class EgresoFormaPagoId implements java.io.Serializable {

	private int codigoEgresoFormaPago;
	private int codigoEgreso;

	public EgresoFormaPagoId() {
	}

	public EgresoFormaPagoId(int codigoEgresoFormaPago, int codigoEgreso) {
		this.codigoEgresoFormaPago = codigoEgresoFormaPago;
		this.codigoEgreso = codigoEgreso;
	}

	@Column(name = "codigo_egreso_forma_pago", nullable = false)
	public int getCodigoEgresoFormaPago() {
		return this.codigoEgresoFormaPago;
	}

	public void setCodigoEgresoFormaPago(int codigoEgresoFormaPago) {
		this.codigoEgresoFormaPago = codigoEgresoFormaPago;
	}

	@Column(name = "codigo_egreso", nullable = false)
	public int getCodigoEgreso() {
		return this.codigoEgreso;
	}

	public void setCodigoEgreso(int codigoEgreso) {
		this.codigoEgreso = codigoEgreso;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EgresoFormaPagoId))
			return false;
		EgresoFormaPagoId castOther = (EgresoFormaPagoId) other;

		return (this.getCodigoEgresoFormaPago() == castOther
				.getCodigoEgresoFormaPago())
				&& (this.getCodigoEgreso() == castOther.getCodigoEgreso());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoEgresoFormaPago();
		result = 37 * result + this.getCodigoEgreso();
		return result;
	}

}
