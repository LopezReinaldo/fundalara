package modelo;

// Generated 28/12/2011 03:24:38 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PersonalJuegoId generated by hbm2java
 */
@Embeddable
public class PersonalJuegoId implements java.io.Serializable {

	private int codigoJuego;
	private String cedulaRif;

	public PersonalJuegoId() {
	}

	public PersonalJuegoId(int codigoJuego, String cedulaRif) {
		this.codigoJuego = codigoJuego;
		this.cedulaRif = cedulaRif;
	}

	@Column(name = "codigo_juego", nullable = false)
	public int getCodigoJuego() {
		return this.codigoJuego;
	}

	public void setCodigoJuego(int codigoJuego) {
		this.codigoJuego = codigoJuego;
	}

	@Column(name = "cedula_rif", nullable = false)
	public String getCedulaRif() {
		return this.cedulaRif;
	}

	public void setCedulaRif(String cedulaRif) {
		this.cedulaRif = cedulaRif;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PersonalJuegoId))
			return false;
		PersonalJuegoId castOther = (PersonalJuegoId) other;

		return (this.getCodigoJuego() == castOther.getCodigoJuego())
				&& ((this.getCedulaRif() == castOther.getCedulaRif()) || (this
						.getCedulaRif() != null
						&& castOther.getCedulaRif() != null && this
						.getCedulaRif().equals(castOther.getCedulaRif())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoJuego();
		result = 37 * result
				+ (getCedulaRif() == null ? 0 : this.getCedulaRif().hashCode());
		return result;
	}

}
