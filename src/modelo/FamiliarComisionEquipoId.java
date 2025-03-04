package modelo;

// Generated 24/01/2012 04:28:30 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FamiliarComisionEquipoId generated by hbm2java
 */
@Embeddable
public class FamiliarComisionEquipoId implements java.io.Serializable {

	private int codigoComisionEquipo;
	private int codigoFamiliarJugador;

	public FamiliarComisionEquipoId() {
	}

	public FamiliarComisionEquipoId(int codigoComisionEquipo,
			int codigoFamiliarJugador) {
		this.codigoComisionEquipo = codigoComisionEquipo;
		this.codigoFamiliarJugador = codigoFamiliarJugador;
	}

	@Column(name = "codigo_comision_equipo", nullable = false)
	public int getCodigoComisionEquipo() {
		return this.codigoComisionEquipo;
	}

	public void setCodigoComisionEquipo(int codigoComisionEquipo) {
		this.codigoComisionEquipo = codigoComisionEquipo;
	}

	@Column(name = "codigo_familiar_jugador", nullable = false)
	public int getCodigoFamiliarJugador() {
		return this.codigoFamiliarJugador;
	}

	public void setCodigoFamiliarJugador(int codigoFamiliarJugador) {
		this.codigoFamiliarJugador = codigoFamiliarJugador;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FamiliarComisionEquipoId))
			return false;
		FamiliarComisionEquipoId castOther = (FamiliarComisionEquipoId) other;

		return (this.getCodigoComisionEquipo() == castOther
				.getCodigoComisionEquipo())
				&& (this.getCodigoFamiliarJugador() == castOther
						.getCodigoFamiliarJugador());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoComisionEquipo();
		result = 37 * result + this.getCodigoFamiliarJugador();
		return result;
	}

}
