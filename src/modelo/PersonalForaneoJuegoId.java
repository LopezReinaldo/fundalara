package modelo;

// Generated 31/12/2011 11:02:01 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PersonalForaneoJuegoId generated by hbm2java
 */
@Embeddable
public class PersonalForaneoJuegoId implements java.io.Serializable {

	private int codigoJuego;
	private int codigoPersonalForaneo;

	public PersonalForaneoJuegoId() {
	}

	public PersonalForaneoJuegoId(int codigoJuego, int codigoPersonalForaneo) {
		this.codigoJuego = codigoJuego;
		this.codigoPersonalForaneo = codigoPersonalForaneo;
	}

	@Column(name = "codigo_juego", nullable = false)
	public int getCodigoJuego() {
		return this.codigoJuego;
	}

	public void setCodigoJuego(int codigoJuego) {
		this.codigoJuego = codigoJuego;
	}

	@Column(name = "codigo_personal_foraneo", nullable = false)
	public int getCodigoPersonalForaneo() {
		return this.codigoPersonalForaneo;
	}

	public void setCodigoPersonalForaneo(int codigoPersonalForaneo) {
		this.codigoPersonalForaneo = codigoPersonalForaneo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PersonalForaneoJuegoId))
			return false;
		PersonalForaneoJuegoId castOther = (PersonalForaneoJuegoId) other;

		return (this.getCodigoJuego() == castOther.getCodigoJuego())
				&& (this.getCodigoPersonalForaneo() == castOther
						.getCodigoPersonalForaneo());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoJuego();
		result = 37 * result + this.getCodigoPersonalForaneo();
		return result;
	}

}
