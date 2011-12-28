package modelo;

// Generated 28/12/2011 03:24:38 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EstadoActividadId generated by hbm2java
 */
@Embeddable
public class EstadoActividadId implements java.io.Serializable {

	private int codigoEstado;
	private int codigoActividad;

	public EstadoActividadId() {
	}

	public EstadoActividadId(int codigoEstado, int codigoActividad) {
		this.codigoEstado = codigoEstado;
		this.codigoActividad = codigoActividad;
	}

	@Column(name = "codigo_estado", nullable = false)
	public int getCodigoEstado() {
		return this.codigoEstado;
	}

	public void setCodigoEstado(int codigoEstado) {
		this.codigoEstado = codigoEstado;
	}

	@Column(name = "codigo_actividad", nullable = false)
	public int getCodigoActividad() {
		return this.codigoActividad;
	}

	public void setCodigoActividad(int codigoActividad) {
		this.codigoActividad = codigoActividad;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EstadoActividadId))
			return false;
		EstadoActividadId castOther = (EstadoActividadId) other;

		return (this.getCodigoEstado() == castOther.getCodigoEstado())
				&& (this.getCodigoActividad() == castOther.getCodigoActividad());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoEstado();
		result = 37 * result + this.getCodigoActividad();
		return result;
	}

}
