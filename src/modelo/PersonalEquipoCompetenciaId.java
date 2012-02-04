<<<<<<< HEAD
package modelo;

// Generated 25/01/2012 10:43:43 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PersonalEquipoCompetenciaId generated by hbm2java
 */
@Embeddable
public class PersonalEquipoCompetenciaId implements java.io.Serializable {

	private int codigoPersonalEquipo;
	private int codigoCompetencia;

	public PersonalEquipoCompetenciaId() {
	}

	public PersonalEquipoCompetenciaId(int codigoPersonalEquipo,
			int codigoCompetencia) {
		this.codigoPersonalEquipo = codigoPersonalEquipo;
		this.codigoCompetencia = codigoCompetencia;
	}

	@Column(name = "codigo_personal_equipo", nullable = false)
	public int getCodigoPersonalEquipo() {
		return this.codigoPersonalEquipo;
	}

	public void setCodigoPersonalEquipo(int codigoPersonalEquipo) {
		this.codigoPersonalEquipo = codigoPersonalEquipo;
	}

	@Column(name = "codigo_competencia", nullable = false)
	public int getCodigoCompetencia() {
		return this.codigoCompetencia;
	}

	public void setCodigoCompetencia(int codigoCompetencia) {
		this.codigoCompetencia = codigoCompetencia;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PersonalEquipoCompetenciaId))
			return false;
		PersonalEquipoCompetenciaId castOther = (PersonalEquipoCompetenciaId) other;

		return (this.getCodigoPersonalEquipo() == castOther
				.getCodigoPersonalEquipo())
				&& (this.getCodigoCompetencia() == castOther
						.getCodigoCompetencia());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoPersonalEquipo();
		result = 37 * result + this.getCodigoCompetencia();
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
 * PersonalEquipoCompetenciaId generated by hbm2java
 */
@Embeddable
public class PersonalEquipoCompetenciaId implements java.io.Serializable {

	private int codigoPersonalEquipo;
	private int codigoCompetencia;

	public PersonalEquipoCompetenciaId() {
	}

	public PersonalEquipoCompetenciaId(int codigoPersonalEquipo,
			int codigoCompetencia) {
		this.codigoPersonalEquipo = codigoPersonalEquipo;
		this.codigoCompetencia = codigoCompetencia;
	}

	@Column(name = "codigo_personal_equipo", nullable = false)
	public int getCodigoPersonalEquipo() {
		return this.codigoPersonalEquipo;
	}

	public void setCodigoPersonalEquipo(int codigoPersonalEquipo) {
		this.codigoPersonalEquipo = codigoPersonalEquipo;
	}

	@Column(name = "codigo_competencia", nullable = false)
	public int getCodigoCompetencia() {
		return this.codigoCompetencia;
	}

	public void setCodigoCompetencia(int codigoCompetencia) {
		this.codigoCompetencia = codigoCompetencia;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PersonalEquipoCompetenciaId))
			return false;
		PersonalEquipoCompetenciaId castOther = (PersonalEquipoCompetenciaId) other;

		return (this.getCodigoPersonalEquipo() == castOther
				.getCodigoPersonalEquipo())
				&& (this.getCodigoCompetencia() == castOther
						.getCodigoCompetencia());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoPersonalEquipo();
		result = 37 * result + this.getCodigoCompetencia();
		return result;
	}

}
>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
