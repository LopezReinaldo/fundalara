<<<<<<< HEAD
package modelo;

// Generated 25/01/2012 10:43:43 AM by Hibernate Tools 3.4.0.CR1

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
 * PersonalContrato generated by hbm2java
 */
@Entity
@Table(name = "personal_contrato", schema = "public")
public class PersonalContrato implements java.io.Serializable {

	private int codigoPersonalContrato;
	private DatoBasico datoBasicoByCodigoModalidad;
	private DatoBasico datoBasicoByCodigoHorario;
	private Personal personal;
	private Date fechaInicio;
	private Date fechaFin;
	private char estatus;

	public PersonalContrato() {
	}

	public PersonalContrato(int codigoPersonalContrato,
			DatoBasico datoBasicoByCodigoModalidad, Personal personal,
			Date fechaInicio, char estatus) {
		this.codigoPersonalContrato = codigoPersonalContrato;
		this.datoBasicoByCodigoModalidad = datoBasicoByCodigoModalidad;
		this.personal = personal;
		this.fechaInicio = fechaInicio;
		this.estatus = estatus;
	}

	public PersonalContrato(int codigoPersonalContrato,
			DatoBasico datoBasicoByCodigoModalidad,
			DatoBasico datoBasicoByCodigoHorario, Personal personal,
			Date fechaInicio, Date fechaFin, char estatus) {
		this.codigoPersonalContrato = codigoPersonalContrato;
		this.datoBasicoByCodigoModalidad = datoBasicoByCodigoModalidad;
		this.datoBasicoByCodigoHorario = datoBasicoByCodigoHorario;
		this.personal = personal;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estatus = estatus;
	}

	@Id
	@Column(name = "codigo_personal_contrato", unique = true, nullable = false)
	public int getCodigoPersonalContrato() {
		return this.codigoPersonalContrato;
	}

	public void setCodigoPersonalContrato(int codigoPersonalContrato) {
		this.codigoPersonalContrato = codigoPersonalContrato;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_modalidad", nullable = false)
	public DatoBasico getDatoBasicoByCodigoModalidad() {
		return this.datoBasicoByCodigoModalidad;
	}

	public void setDatoBasicoByCodigoModalidad(
			DatoBasico datoBasicoByCodigoModalidad) {
		this.datoBasicoByCodigoModalidad = datoBasicoByCodigoModalidad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_horario")
	public DatoBasico getDatoBasicoByCodigoHorario() {
		return this.datoBasicoByCodigoHorario;
	}

	public void setDatoBasicoByCodigoHorario(
			DatoBasico datoBasicoByCodigoHorario) {
		this.datoBasicoByCodigoHorario = datoBasicoByCodigoHorario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula_rif", nullable = false)
	public Personal getPersonal() {
		return this.personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
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
	@Column(name = "fecha_fin", length = 13)
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
 * PersonalContrato generated by hbm2java
 */
@Entity
@Table(name = "personal_contrato", schema = "public")
public class PersonalContrato implements java.io.Serializable {

	private int codigoPersonalContrato;
	private DatoBasico datoBasicoByCodigoModalidad;
	private DatoBasico datoBasicoByCodigoHorario;
	private Personal personal;
	private Date fechaInicio;
	private Date fechaFin;
	private char estatus;

	public PersonalContrato() {
	}

	public PersonalContrato(int codigoPersonalContrato,
			DatoBasico datoBasicoByCodigoModalidad, Personal personal,
			Date fechaInicio, char estatus) {
		this.codigoPersonalContrato = codigoPersonalContrato;
		this.datoBasicoByCodigoModalidad = datoBasicoByCodigoModalidad;
		this.personal = personal;
		this.fechaInicio = fechaInicio;
		this.estatus = estatus;
	}

	public PersonalContrato(int codigoPersonalContrato,
			DatoBasico datoBasicoByCodigoModalidad,
			DatoBasico datoBasicoByCodigoHorario, Personal personal,
			Date fechaInicio, Date fechaFin, char estatus) {
		this.codigoPersonalContrato = codigoPersonalContrato;
		this.datoBasicoByCodigoModalidad = datoBasicoByCodigoModalidad;
		this.datoBasicoByCodigoHorario = datoBasicoByCodigoHorario;
		this.personal = personal;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estatus = estatus;
	}

	@Id
	@Column(name = "codigo_personal_contrato", unique = true, nullable = false)
	public int getCodigoPersonalContrato() {
		return this.codigoPersonalContrato;
	}

	public void setCodigoPersonalContrato(int codigoPersonalContrato) {
		this.codigoPersonalContrato = codigoPersonalContrato;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_modalidad", nullable = false)
	public DatoBasico getDatoBasicoByCodigoModalidad() {
		return this.datoBasicoByCodigoModalidad;
	}

	public void setDatoBasicoByCodigoModalidad(
			DatoBasico datoBasicoByCodigoModalidad) {
		this.datoBasicoByCodigoModalidad = datoBasicoByCodigoModalidad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_horario")
	public DatoBasico getDatoBasicoByCodigoHorario() {
		return this.datoBasicoByCodigoHorario;
	}

	public void setDatoBasicoByCodigoHorario(
			DatoBasico datoBasicoByCodigoHorario) {
		this.datoBasicoByCodigoHorario = datoBasicoByCodigoHorario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula_rif", nullable = false)
	public Personal getPersonal() {
		return this.personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
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
	@Column(name = "fecha_fin", length = 13)
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

}
>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
