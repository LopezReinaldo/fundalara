<<<<<<< HEAD
package modelo;

// Generated 25/01/2012 10:43:43 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ResultadoActividadId generated by hbm2java
 */
@Embeddable
public class ResultadoActividadId implements java.io.Serializable {

	private int codigoResultado;
	private int codigoActividad;

	public ResultadoActividadId() {
	}

	public ResultadoActividadId(int codigoResultado, int codigoActividad) {
		this.codigoResultado = codigoResultado;
		this.codigoActividad = codigoActividad;
	}

	@Column(name = "codigo_resultado", nullable = false)
	public int getCodigoResultado() {
		return this.codigoResultado;
	}

	public void setCodigoResultado(int codigoResultado) {
		this.codigoResultado = codigoResultado;
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
		if (!(other instanceof ResultadoActividadId))
			return false;
		ResultadoActividadId castOther = (ResultadoActividadId) other;

		return (this.getCodigoResultado() == castOther.getCodigoResultado())
				&& (this.getCodigoActividad() == castOther.getCodigoActividad());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoResultado();
		result = 37 * result + this.getCodigoActividad();
		return result;
	}

}
=======
package modelo;

<<<<<<< HEAD
// Generated 25/01/2012 12:32:42 AM by Hibernate Tools 3.4.0.CR1
=======
<<<<<<< HEAD
// Generated 25/01/2012 12:32:42 AM by Hibernate Tools 3.4.0.CR1
=======
<<<<<<< HEAD
// Generated 25/01/2012 12:32:42 AM by Hibernate Tools 3.4.0.CR1
=======
// Generated 24/01/2012 04:28:30 AM by Hibernate Tools 3.4.0.CR1
>>>>>>> 7d4823278d0a354855f5032a99e2b48c65b33e7f
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ResultadoActividadId generated by hbm2java
 */
@Embeddable
public class ResultadoActividadId implements java.io.Serializable {

	private int codigoResultado;
	private int codigoActividad;

	public ResultadoActividadId() {
	}

	public ResultadoActividadId(int codigoResultado, int codigoActividad) {
		this.codigoResultado = codigoResultado;
		this.codigoActividad = codigoActividad;
	}

	@Column(name = "codigo_resultado", nullable = false)
	public int getCodigoResultado() {
		return this.codigoResultado;
	}

	public void setCodigoResultado(int codigoResultado) {
		this.codigoResultado = codigoResultado;
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
		if (!(other instanceof ResultadoActividadId))
			return false;
		ResultadoActividadId castOther = (ResultadoActividadId) other;

		return (this.getCodigoResultado() == castOther.getCodigoResultado())
				&& (this.getCodigoActividad() == castOther.getCodigoActividad());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoResultado();
		result = 37 * result + this.getCodigoActividad();
		return result;
	}

}
>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
