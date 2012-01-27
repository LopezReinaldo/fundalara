package modelo;

// Generated 25/01/2012 12:32:42 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SolicitudMantenimientoId generated by hbm2java
 */
@Embeddable
public class SolicitudMantenimientoId implements java.io.Serializable {

	private int codigoSolicitud;
	private int codigoActividad;

	public SolicitudMantenimientoId() {
	}

	public SolicitudMantenimientoId(int codigoSolicitud, int codigoActividad) {
		this.codigoSolicitud = codigoSolicitud;
		this.codigoActividad = codigoActividad;
	}

	@Column(name = "codigo_solicitud", nullable = false)
	public int getCodigoSolicitud() {
		return this.codigoSolicitud;
	}

	public void setCodigoSolicitud(int codigoSolicitud) {
		this.codigoSolicitud = codigoSolicitud;
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
		if (!(other instanceof SolicitudMantenimientoId))
			return false;
		SolicitudMantenimientoId castOther = (SolicitudMantenimientoId) other;

		return (this.getCodigoSolicitud() == castOther.getCodigoSolicitud())
				&& (this.getCodigoActividad() == castOther.getCodigoActividad());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoSolicitud();
		result = 37 * result + this.getCodigoActividad();
		return result;
	}

}
