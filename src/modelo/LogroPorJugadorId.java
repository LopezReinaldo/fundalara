package modelo;

// Generated 25/01/2012 12:32:42 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LogroPorJugadorId generated by hbm2java
 */
@Embeddable
public class LogroPorJugadorId implements java.io.Serializable {

	private int codigoLogro;
	private int codigoDatoDeportivo;

	public LogroPorJugadorId() {
	}

	public LogroPorJugadorId(int codigoLogro, int codigoDatoDeportivo) {
		this.codigoLogro = codigoLogro;
		this.codigoDatoDeportivo = codigoDatoDeportivo;
	}

	@Column(name = "codigo_logro", nullable = false)
	public int getCodigoLogro() {
		return this.codigoLogro;
	}

	public void setCodigoLogro(int codigoLogro) {
		this.codigoLogro = codigoLogro;
	}

	@Column(name = "codigo_dato_deportivo", nullable = false)
	public int getCodigoDatoDeportivo() {
		return this.codigoDatoDeportivo;
	}

	public void setCodigoDatoDeportivo(int codigoDatoDeportivo) {
		this.codigoDatoDeportivo = codigoDatoDeportivo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LogroPorJugadorId))
			return false;
		LogroPorJugadorId castOther = (LogroPorJugadorId) other;

		return (this.getCodigoLogro() == castOther.getCodigoLogro())
				&& (this.getCodigoDatoDeportivo() == castOther
						.getCodigoDatoDeportivo());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoLogro();
		result = 37 * result + this.getCodigoDatoDeportivo();
		return result;
	}

}
