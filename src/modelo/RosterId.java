package modelo;

// Generated 12/12/2011 09:17:13 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RosterId generated by hbm2java
 */
@Embeddable
public class RosterId implements java.io.Serializable {

	private String cedulaJugador;
	private String codigoEquipo;

	public RosterId() {
	}

	public RosterId(String cedulaJugador, String codigoEquipo) {
		this.cedulaJugador = cedulaJugador;
		this.codigoEquipo = codigoEquipo;
	}

	@Column(name = "cedula_jugador", nullable = false)
	public String getCedulaJugador() {
		return this.cedulaJugador;
	}

	public void setCedulaJugador(String cedulaJugador) {
		this.cedulaJugador = cedulaJugador;
	}

	@Column(name = "codigo_equipo", nullable = false)
	public String getCodigoEquipo() {
		return this.codigoEquipo;
	}

	public void setCodigoEquipo(String codigoEquipo) {
		this.codigoEquipo = codigoEquipo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RosterId))
			return false;
		RosterId castOther = (RosterId) other;

		return ((this.getCedulaJugador() == castOther.getCedulaJugador()) || (this
				.getCedulaJugador() != null
				&& castOther.getCedulaJugador() != null && this
				.getCedulaJugador().equals(castOther.getCedulaJugador())))
				&& ((this.getCodigoEquipo() == castOther.getCodigoEquipo()) || (this
						.getCodigoEquipo() != null
						&& castOther.getCodigoEquipo() != null && this
						.getCodigoEquipo().equals(castOther.getCodigoEquipo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCedulaJugador() == null ? 0 : this.getCedulaJugador()
						.hashCode());
		result = 37
				* result
				+ (getCodigoEquipo() == null ? 0 : this.getCodigoEquipo()
						.hashCode());
		return result;
	}

}
