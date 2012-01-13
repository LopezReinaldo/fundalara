package modelo;

// Generated 13/01/2012 03:34:55 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Horario generated by hbm2java
 */
@Entity
@Table(name = "horario", schema = "public")
public class Horario implements java.io.Serializable {

	private int codigoHorario;
	private PlanTemporada planTemporada;
	private DatoBasico datoBasico;
	private Date horaInicio;
	private Date horaFin;
	private char estatus;

	public Horario() {
	}

	public Horario(int codigoHorario, PlanTemporada planTemporada,
			DatoBasico datoBasico, Date horaInicio, Date horaFin, char estatus) {
		this.codigoHorario = codigoHorario;
		this.planTemporada = planTemporada;
		this.datoBasico = datoBasico;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.estatus = estatus;
	}

	@Id
	@Column(name = "codigo_horario", unique = true, nullable = false)
	public int getCodigoHorario() {
		return this.codigoHorario;
	}

	public void setCodigoHorario(int codigoHorario) {
		this.codigoHorario = codigoHorario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_plan_temporada", nullable = false)
	public PlanTemporada getPlanTemporada() {
		return this.planTemporada;
	}

	public void setPlanTemporada(PlanTemporada planTemporada) {
		this.planTemporada = planTemporada;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dia", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "hora_inicio", nullable = false, length = 13)
	public Date getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "hora_fin", nullable = false, length = 13)
	public Date getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
