package modelo;

// Generated 16/12/2011 10:21:41 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PersonalJuegoId generated by hbm2java
 */
@Embeddable
public class PersonalJuegoId implements java.io.Serializable {

	private String cedulaPersonal;
	private String codigoJuegoPersonal;

	public PersonalJuegoId() {
	}

	public PersonalJuegoId(String cedulaPersonal, String codigoJuegoPersonal) {
		this.cedulaPersonal = cedulaPersonal;
		this.codigoJuegoPersonal = codigoJuegoPersonal;
	}

	@Column(name = "cedula_personal", nullable = false)
	public String getCedulaPersonal() {
		return this.cedulaPersonal;
	}

	public void setCedulaPersonal(String cedulaPersonal) {
		this.cedulaPersonal = cedulaPersonal;
	}

	@Column(name = "codigo_juego_personal", nullable = false)
	public String getCodigoJuegoPersonal() {
		return this.codigoJuegoPersonal;
	}

	public void setCodigoJuegoPersonal(String codigoJuegoPersonal) {
		this.codigoJuegoPersonal = codigoJuegoPersonal;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PersonalJuegoId))
			return false;
		PersonalJuegoId castOther = (PersonalJuegoId) other;

		return ((this.getCedulaPersonal() == castOther.getCedulaPersonal()) || (this
				.getCedulaPersonal() != null
				&& castOther.getCedulaPersonal() != null && this
				.getCedulaPersonal().equals(castOther.getCedulaPersonal())))
				&& ((this.getCodigoJuegoPersonal() == castOther
						.getCodigoJuegoPersonal()) || (this
						.getCodigoJuegoPersonal() != null
						&& castOther.getCodigoJuegoPersonal() != null && this
						.getCodigoJuegoPersonal().equals(
								castOther.getCodigoJuegoPersonal())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCedulaPersonal() == null ? 0 : this.getCedulaPersonal()
						.hashCode());
		result = 37
				* result
				+ (getCodigoJuegoPersonal() == null ? 0 : this
						.getCodigoJuegoPersonal().hashCode());
		return result;
	}

}
