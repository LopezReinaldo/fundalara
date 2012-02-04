package modelo;

// Generated 25/01/2012 10:43:43 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PlanEntrenamiento generated by hbm2java
 */
@Entity
@Table(name = "plan_entrenamiento", schema = "public")
public class PlanEntrenamiento implements java.io.Serializable {

	private int codigoPlanEntrenamiento;
	private PlanTemporada planTemporada;
	private Date fechaInicio;
	private Date fechaFin;
	private char estatus;
	private Set<Sesion> sesions = new HashSet<Sesion>(0);

	public PlanEntrenamiento() {
	}

	public PlanEntrenamiento(int codigoPlanEntrenamiento,
			PlanTemporada planTemporada, Date fechaInicio, Date fechaFin,
			char estatus) {
		this.codigoPlanEntrenamiento = codigoPlanEntrenamiento;
		this.planTemporada = planTemporada;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estatus = estatus;
	}

	public PlanEntrenamiento(int codigoPlanEntrenamiento,
			PlanTemporada planTemporada, Date fechaInicio, Date fechaFin,
			char estatus, Set<Sesion> sesions) {
		this.codigoPlanEntrenamiento = codigoPlanEntrenamiento;
		this.planTemporada = planTemporada;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estatus = estatus;
		this.sesions = sesions;
	}

	@Id
	@Column(name = "codigo_plan_entrenamiento", unique = true, nullable = false)
	public int getCodigoPlanEntrenamiento() {
		return this.codigoPlanEntrenamiento;
	}

	public void setCodigoPlanEntrenamiento(int codigoPlanEntrenamiento) {
		this.codigoPlanEntrenamiento = codigoPlanEntrenamiento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_plan_temporada", nullable = false)
	public PlanTemporada getPlanTemporada() {
		return this.planTemporada;
	}

	public void setPlanTemporada(PlanTemporada planTemporada) {
		this.planTemporada = planTemporada;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_inicio", nullable = false, length = 13)
	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_fin", nullable = false, length = 13)
	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "planEntrenamiento")
	public Set<Sesion> getSesions() {
		return this.sesions;
	}

	public void setSesions(Set<Sesion> sesions) {
		this.sesions = sesions;
	}

}
