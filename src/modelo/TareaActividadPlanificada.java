package modelo;

// Generated 25/01/2012 12:32:42 AM by Hibernate Tools 3.4.0.CR1

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
