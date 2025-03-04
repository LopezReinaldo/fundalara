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
 * ActividadCalendario generated by hbm2java
 */
@Entity
@Table(name = "actividad_calendario", schema = "public")
public class ActividadCalendario implements java.io.Serializable {

	private int codigoActividadCalendario;
	private DatoBasico datoBasico;
	private Competencia competencia;
	private Juego juego;
	private Actividad actividad;
	private Sesion sesion;
	private Date fechaInicio;
	private Date fechaCulminacion;
	private String descripcion;
	private char estatus;
	private String color;
	private Date horaInicio;
	private Date horaFin;

	public ActividadCalendario() {
	}

	public ActividadCalendario(int codigoActividadCalendario,
			DatoBasico datoBasico, Date fechaInicio, Date fechaCulminacion,
			String descripcion, char estatus, Date horaInicio, Date horaFin) {
		this.codigoActividadCalendario = codigoActividadCalendario;
		this.datoBasico = datoBasico;
		this.fechaInicio = fechaInicio;
		this.fechaCulminacion = fechaCulminacion;
		this.descripcion = descripcion;
		this.estatus = estatus;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	public ActividadCalendario(int codigoActividadCalendario,
			DatoBasico datoBasico, Competencia competencia, Juego juego,
			Actividad actividad, Sesion sesion, Date fechaInicio,
			Date fechaCulminacion, String descripcion, char estatus,
			String color, Date horaInicio, Date horaFin) {
		this.codigoActividadCalendario = codigoActividadCalendario;
		this.datoBasico = datoBasico;
		this.competencia = competencia;
		this.juego = juego;
		this.actividad = actividad;
		this.sesion = sesion;
		this.fechaInicio = fechaInicio;
		this.fechaCulminacion = fechaCulminacion;
		this.descripcion = descripcion;
		this.estatus = estatus;
		this.color = color;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	@Id
	@Column(name = "codigo_actividad_calendario", unique = true, nullable = false)
	public int getCodigoActividadCalendario() {
		return this.codigoActividadCalendario;
	}

	public void setCodigoActividadCalendario(int codigoActividadCalendario) {
		this.codigoActividadCalendario = codigoActividadCalendario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tipo_actividad", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_competencia")
	public Competencia getCompetencia() {
		return this.competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_juego")
	public Juego getJuego() {
		return this.juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_actividad")
	public Actividad getActividad() {
		return this.actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_sesion")
	public Sesion getSesion() {
		return this.sesion;
	}

	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
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
	@Column(name = "fecha_culminacion", nullable = false, length = 13)
	public Date getFechaCulminacion() {
		return this.fechaCulminacion;
	}

	public void setFechaCulminacion(Date fechaCulminacion) {
		this.fechaCulminacion = fechaCulminacion;
	}

	@Column(name = "descripcion", nullable = false)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@Column(name = "color")
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "hora_inicio", nullable = false, length = 15)
	public Date getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "hora_fin", nullable = false, length = 15)
	public Date getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
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
 * ActividadCalendario generated by hbm2java
 */
@Entity
@Table(name = "actividad_calendario", schema = "public")
public class ActividadCalendario implements java.io.Serializable {

	private int codigoActividadCalendario;
	private DatoBasico datoBasico;
	private Competencia competencia;
	private Juego juego;
	private Actividad actividad;
	private Sesion sesion;
	private Date fechaInicio;
	private Date fechaCulminacion;
	private String descripcion;
	private char estatus;
	private String color;
	private Date horaInicio;
	private Date horaFin;

	public ActividadCalendario() {
	}

	public ActividadCalendario(int codigoActividadCalendario,
			DatoBasico datoBasico, Date fechaInicio, Date fechaCulminacion,
			String descripcion, char estatus, Date horaInicio, Date horaFin) {
		this.codigoActividadCalendario = codigoActividadCalendario;
		this.datoBasico = datoBasico;
		this.fechaInicio = fechaInicio;
		this.fechaCulminacion = fechaCulminacion;
		this.descripcion = descripcion;
		this.estatus = estatus;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	public ActividadCalendario(int codigoActividadCalendario,
			DatoBasico datoBasico, Competencia competencia, Juego juego,
			Actividad actividad, Sesion sesion, Date fechaInicio,
			Date fechaCulminacion, String descripcion, char estatus,
			String color, Date horaInicio, Date horaFin) {
		this.codigoActividadCalendario = codigoActividadCalendario;
		this.datoBasico = datoBasico;
		this.competencia = competencia;
		this.juego = juego;
		this.actividad = actividad;
		this.sesion = sesion;
		this.fechaInicio = fechaInicio;
		this.fechaCulminacion = fechaCulminacion;
		this.descripcion = descripcion;
		this.estatus = estatus;
		this.color = color;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	@Id
	@Column(name = "codigo_actividad_calendario", unique = true, nullable = false)
	public int getCodigoActividadCalendario() {
		return this.codigoActividadCalendario;
	}

	public void setCodigoActividadCalendario(int codigoActividadCalendario) {
		this.codigoActividadCalendario = codigoActividadCalendario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tipo_actividad", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_competencia")
	public Competencia getCompetencia() {
		return this.competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_juego")
	public Juego getJuego() {
		return this.juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_actividad")
	public Actividad getActividad() {
		return this.actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_sesion")
	public Sesion getSesion() {
		return this.sesion;
	}

	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
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
	@Column(name = "fecha_culminacion", nullable = false, length = 13)
	public Date getFechaCulminacion() {
		return this.fechaCulminacion;
	}

	public void setFechaCulminacion(Date fechaCulminacion) {
		this.fechaCulminacion = fechaCulminacion;
	}

	@Column(name = "descripcion", nullable = false)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@Column(name = "color")
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "hora_inicio", nullable = false, length = 15)
	public Date getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "hora_fin", nullable = false, length = 15)
	public Date getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}

}
>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
