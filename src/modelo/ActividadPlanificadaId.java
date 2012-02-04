<<<<<<< HEAD
package modelo;

// Generated 25/01/2012 10:43:43 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ActividadPlanificadaId generated by hbm2java
 */
@Embeddable
public class ActividadPlanificadaId implements java.io.Serializable {

	private int codigoSesion;
	private int codActividadEntrenamiento;

	public ActividadPlanificadaId() {
	}

	public ActividadPlanificadaId(int codigoSesion,
			int codActividadEntrenamiento) {
		this.codigoSesion = codigoSesion;
		this.codActividadEntrenamiento = codActividadEntrenamiento;
	}

	@Column(name = "codigo_sesion", nullable = false)
	public int getCodigoSesion() {
		return this.codigoSesion;
	}

	public void setCodigoSesion(int codigoSesion) {
		this.codigoSesion = codigoSesion;
	}

	@Column(name = "cod_actividad_entrenamiento", nullable = false)
	public int getCodActividadEntrenamiento() {
		return this.codActividadEntrenamiento;
	}

	public void setCodActividadEntrenamiento(int codActividadEntrenamiento) {
		this.codActividadEntrenamiento = codActividadEntrenamiento;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ActividadPlanificadaId))
			return false;
		ActividadPlanificadaId castOther = (ActividadPlanificadaId) other;

		return (this.getCodigoSesion() == castOther.getCodigoSesion())
				&& (this.getCodActividadEntrenamiento() == castOther
						.getCodActividadEntrenamiento());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoSesion();
		result = 37 * result + this.getCodActividadEntrenamiento();
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
 * ActividadPlanificadaId generated by hbm2java
 */
@Embeddable
public class ActividadPlanificadaId implements java.io.Serializable {

	private int codigoSesion;
<<<<<<< HEAD
	private int codigoActividadEntrenamiento;
=======
<<<<<<< HEAD
	private int codigoActividadEntrenamiento;
=======
<<<<<<< HEAD
	private int codigoActividadEntrenamiento;
=======
	private int codActividadEntrenamiento;
>>>>>>> 7d4823278d0a354855f5032a99e2b48c65b33e7f
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514

	public ActividadPlanificadaId() {
	}

	public ActividadPlanificadaId(int codigoSesion,
<<<<<<< HEAD
			int codigoActividadEntrenamiento) {
		this.codigoSesion = codigoSesion;
		this.codigoActividadEntrenamiento = codigoActividadEntrenamiento;
=======
<<<<<<< HEAD
			int codigoActividadEntrenamiento) {
		this.codigoSesion = codigoSesion;
		this.codigoActividadEntrenamiento = codigoActividadEntrenamiento;
=======
<<<<<<< HEAD
			int codigoActividadEntrenamiento) {
		this.codigoSesion = codigoSesion;
		this.codigoActividadEntrenamiento = codigoActividadEntrenamiento;
=======
			int codActividadEntrenamiento) {
		this.codigoSesion = codigoSesion;
		this.codActividadEntrenamiento = codActividadEntrenamiento;
>>>>>>> 7d4823278d0a354855f5032a99e2b48c65b33e7f
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514
	}

	@Column(name = "codigo_sesion", nullable = false)
	public int getCodigoSesion() {
		return this.codigoSesion;
	}

	public void setCodigoSesion(int codigoSesion) {
		this.codigoSesion = codigoSesion;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514
	@Column(name = "codigo_actividad_entrenamiento", nullable = false)
	public int getCodigoActividadEntrenamiento() {
		return this.codigoActividadEntrenamiento;
	}

	public void setCodigoActividadEntrenamiento(int codigoActividadEntrenamiento) {
		this.codigoActividadEntrenamiento = codigoActividadEntrenamiento;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
	@Column(name = "cod_actividad_entrenamiento", nullable = false)
	public int getCodActividadEntrenamiento() {
		return this.codActividadEntrenamiento;
	}

	public void setCodActividadEntrenamiento(int codActividadEntrenamiento) {
		this.codActividadEntrenamiento = codActividadEntrenamiento;
>>>>>>> 7d4823278d0a354855f5032a99e2b48c65b33e7f
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ActividadPlanificadaId))
			return false;
		ActividadPlanificadaId castOther = (ActividadPlanificadaId) other;

		return (this.getCodigoSesion() == castOther.getCodigoSesion())
<<<<<<< HEAD
				&& (this.getCodigoActividadEntrenamiento() == castOther
						.getCodigoActividadEntrenamiento());
=======
<<<<<<< HEAD
				&& (this.getCodigoActividadEntrenamiento() == castOther
						.getCodigoActividadEntrenamiento());
=======
<<<<<<< HEAD
				&& (this.getCodigoActividadEntrenamiento() == castOther
						.getCodigoActividadEntrenamiento());
=======
				&& (this.getCodActividadEntrenamiento() == castOther
						.getCodActividadEntrenamiento());
>>>>>>> 7d4823278d0a354855f5032a99e2b48c65b33e7f
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoSesion();
<<<<<<< HEAD
		result = 37 * result + this.getCodigoActividadEntrenamiento();
=======
<<<<<<< HEAD
		result = 37 * result + this.getCodigoActividadEntrenamiento();
=======
<<<<<<< HEAD
		result = 37 * result + this.getCodigoActividadEntrenamiento();
=======
		result = 37 * result + this.getCodActividadEntrenamiento();
>>>>>>> 7d4823278d0a354855f5032a99e2b48c65b33e7f
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514
		return result;
	}

}
>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
