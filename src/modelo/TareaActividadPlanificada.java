<<<<<<< HEAD
package modelo;

// Generated 25/01/2012 10:43:43 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TareaActividadPlanificada generated by hbm2java
 */
@Entity
@Table(name = "tarea_actividad_planificada", schema = "public")
public class TareaActividadPlanificada implements java.io.Serializable {

	private int codigoTareaActividadPlanificada;
	private DatoBasico datoBasico;
	private PlanificacionActividad planificacionActividad;
	private PersonalActividadPlanificada personalActividadPlanificada;
	private FamiliarComisionEquipo familiarComisionEquipo;
	private char estatus;
	private boolean tareaEjecutada;

	public TareaActividadPlanificada() {
	}

	public TareaActividadPlanificada(int codigoTareaActividadPlanificada,
			DatoBasico datoBasico,
			PlanificacionActividad planificacionActividad, char estatus,
			boolean tareaEjecutada) {
		this.codigoTareaActividadPlanificada = codigoTareaActividadPlanificada;
		this.datoBasico = datoBasico;
		this.planificacionActividad = planificacionActividad;
		this.estatus = estatus;
		this.tareaEjecutada = tareaEjecutada;
	}

	public TareaActividadPlanificada(int codigoTareaActividadPlanificada,
			DatoBasico datoBasico,
			PlanificacionActividad planificacionActividad,
			PersonalActividadPlanificada personalActividadPlanificada,
			FamiliarComisionEquipo familiarComisionEquipo, char estatus,
			boolean tareaEjecutada) {
		this.codigoTareaActividadPlanificada = codigoTareaActividadPlanificada;
		this.datoBasico = datoBasico;
		this.planificacionActividad = planificacionActividad;
		this.personalActividadPlanificada = personalActividadPlanificada;
		this.familiarComisionEquipo = familiarComisionEquipo;
		this.estatus = estatus;
		this.tareaEjecutada = tareaEjecutada;
	}

	@Id
	@Column(name = "codigo_tarea_actividad_planificada", unique = true, nullable = false)
	public int getCodigoTareaActividadPlanificada() {
		return this.codigoTareaActividadPlanificada;
	}

	public void setCodigoTareaActividadPlanificada(
			int codigoTareaActividadPlanificada) {
		this.codigoTareaActividadPlanificada = codigoTareaActividadPlanificada;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tarea", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_planificacion_actividad", nullable = false)
	public PlanificacionActividad getPlanificacionActividad() {
		return this.planificacionActividad;
	}

	public void setPlanificacionActividad(
			PlanificacionActividad planificacionActividad) {
		this.planificacionActividad = planificacionActividad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_personal_actividad_plan")
	public PersonalActividadPlanificada getPersonalActividadPlanificada() {
		return this.personalActividadPlanificada;
	}

	public void setPersonalActividadPlanificada(
			PersonalActividadPlanificada personalActividadPlanificada) {
		this.personalActividadPlanificada = personalActividadPlanificada;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_familiar_comision")
	public FamiliarComisionEquipo getFamiliarComisionEquipo() {
		return this.familiarComisionEquipo;
	}

	public void setFamiliarComisionEquipo(
			FamiliarComisionEquipo familiarComisionEquipo) {
		this.familiarComisionEquipo = familiarComisionEquipo;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@Column(name = "tarea_ejecutada", nullable = false)
	public boolean isTareaEjecutada() {
		return this.tareaEjecutada;
	}

	public void setTareaEjecutada(boolean tareaEjecutada) {
		this.tareaEjecutada = tareaEjecutada;
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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import javax.persistence.JoinColumns;
>>>>>>> 7d4823278d0a354855f5032a99e2b48c65b33e7f
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TareaActividadPlanificada generated by hbm2java
 */
@Entity
@Table(name = "tarea_actividad_planificada", schema = "public")
public class TareaActividadPlanificada implements java.io.Serializable {

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514
	private int codigoTareaActividadPlanificada;
	private DatoBasico datoBasico;
	private PlanificacionActividad planificacionActividad;
	private PersonalActividadPlanificada personalActividadPlanificada;
	private FamiliarComisionEquipo familiarComisionEquipo;
	private char estatus;
	private boolean tareaEjecutada;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
	private int codigoPersonalActividadPlanificada;
	private PersonalActividadPlanificada personalActividadPlanificada;
	private DatoBasico datoBasico;
	private PlanificacionActividad planificacionActividad;
	private FamiliarComisionEquipo familiarComisionEquipo;
	private char estatus;
>>>>>>> 7d4823278d0a354855f5032a99e2b48c65b33e7f
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514

	public TareaActividadPlanificada() {
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514
	public TareaActividadPlanificada(int codigoTareaActividadPlanificada,
			DatoBasico datoBasico,
			PlanificacionActividad planificacionActividad,
			PersonalActividadPlanificada personalActividadPlanificada,
			FamiliarComisionEquipo familiarComisionEquipo, char estatus,
			boolean tareaEjecutada) {
		this.codigoTareaActividadPlanificada = codigoTareaActividadPlanificada;
		this.datoBasico = datoBasico;
		this.planificacionActividad = planificacionActividad;
		this.personalActividadPlanificada = personalActividadPlanificada;
		this.familiarComisionEquipo = familiarComisionEquipo;
		this.estatus = estatus;
		this.tareaEjecutada = tareaEjecutada;
	}

	@Id
	@Column(name = "codigo_tarea_actividad_planificada", unique = true, nullable = false)
	public int getCodigoTareaActividadPlanificada() {
		return this.codigoTareaActividadPlanificada;
	}

	public void setCodigoTareaActividadPlanificada(
			int codigoTareaActividadPlanificada) {
		this.codigoTareaActividadPlanificada = codigoTareaActividadPlanificada;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
	public TareaActividadPlanificada(int codigoPersonalActividadPlanificada,
			DatoBasico datoBasico,
			PlanificacionActividad planificacionActividad, char estatus) {
		this.codigoPersonalActividadPlanificada = codigoPersonalActividadPlanificada;
		this.datoBasico = datoBasico;
		this.planificacionActividad = planificacionActividad;
		this.estatus = estatus;
	}

	public TareaActividadPlanificada(int codigoPersonalActividadPlanificada,
			PersonalActividadPlanificada personalActividadPlanificada,
			DatoBasico datoBasico,
			PlanificacionActividad planificacionActividad,
			FamiliarComisionEquipo familiarComisionEquipo, char estatus) {
		this.codigoPersonalActividadPlanificada = codigoPersonalActividadPlanificada;
		this.personalActividadPlanificada = personalActividadPlanificada;
		this.datoBasico = datoBasico;
		this.planificacionActividad = planificacionActividad;
		this.familiarComisionEquipo = familiarComisionEquipo;
		this.estatus = estatus;
	}

	@Id
	@Column(name = "codigo_personal_actividad_planificada", unique = true, nullable = false)
	public int getCodigoPersonalActividadPlanificada() {
		return this.codigoPersonalActividadPlanificada;
	}

	public void setCodigoPersonalActividadPlanificada(
			int codigoPersonalActividadPlanificada) {
		this.codigoPersonalActividadPlanificada = codigoPersonalActividadPlanificada;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_personal_actividad_planificada_1")
	public PersonalActividadPlanificada getPersonalActividadPlanificada() {
		return this.personalActividadPlanificada;
	}

	public void setPersonalActividadPlanificada(
			PersonalActividadPlanificada personalActividadPlanificada) {
		this.personalActividadPlanificada = personalActividadPlanificada;
>>>>>>> 7d4823278d0a354855f5032a99e2b48c65b33e7f
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tarea", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_planificacion_actividad", nullable = false)
	public PlanificacionActividad getPlanificacionActividad() {
		return this.planificacionActividad;
	}

	public void setPlanificacionActividad(
			PlanificacionActividad planificacionActividad) {
		this.planificacionActividad = planificacionActividad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514
	@JoinColumn(name = "codigo_personal_actividad_plan", nullable = false)
	public PersonalActividadPlanificada getPersonalActividadPlanificada() {
		return this.personalActividadPlanificada;
	}

	public void setPersonalActividadPlanificada(
			PersonalActividadPlanificada personalActividadPlanificada) {
		this.personalActividadPlanificada = personalActividadPlanificada;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_familiar_comision", nullable = false)
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
	@JoinColumns({
			@JoinColumn(name = "codigo_comision_equipo", referencedColumnName = "codigo_comision_equipo"),
			@JoinColumn(name = "codigo_familiar_jugador", referencedColumnName = "codigo_familiar_jugador") })
>>>>>>> 7d4823278d0a354855f5032a99e2b48c65b33e7f
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514
	public FamiliarComisionEquipo getFamiliarComisionEquipo() {
		return this.familiarComisionEquipo;
	}

	public void setFamiliarComisionEquipo(
			FamiliarComisionEquipo familiarComisionEquipo) {
		this.familiarComisionEquipo = familiarComisionEquipo;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514
	@Column(name = "tarea_ejecutada", nullable = false)
	public boolean isTareaEjecutada() {
		return this.tareaEjecutada;
	}

	public void setTareaEjecutada(boolean tareaEjecutada) {
		this.tareaEjecutada = tareaEjecutada;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> 7d4823278d0a354855f5032a99e2b48c65b33e7f
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514
}
>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
