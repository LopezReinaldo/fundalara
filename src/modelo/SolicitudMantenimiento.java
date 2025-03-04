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
 * SolicitudMantenimiento generated by hbm2java
 */
@Entity
@Table(name = "solicitud_mantenimiento", schema = "public")
public class SolicitudMantenimiento implements java.io.Serializable {

	private int codigoSolicitud;
	private Actividad actividad;
	private DatoBasico datoBasico;
	private String descripcionActividad;
	private char estatus;
	private Date fechaSolicitud;

	public SolicitudMantenimiento() {
	}

	public SolicitudMantenimiento(int codigoSolicitud, Actividad actividad,
			DatoBasico datoBasico, String descripcionActividad, char estatus,
			Date fechaSolicitud) {
		this.codigoSolicitud = codigoSolicitud;
		this.actividad = actividad;
		this.datoBasico = datoBasico;
		this.descripcionActividad = descripcionActividad;
		this.estatus = estatus;
		this.fechaSolicitud = fechaSolicitud;
	}

	@Id
	@Column(name = "codigo_solicitud", unique = true, nullable = false)
	public int getCodigoSolicitud() {
		return this.codigoSolicitud;
	}

	public void setCodigoSolicitud(int codigoSolicitud) {
		this.codigoSolicitud = codigoSolicitud;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_actividad", nullable = false)
	public Actividad getActividad() {
		return this.actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_prioridad", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@Column(name = "descripcion_actividad", nullable = false)
	public String getDescripcionActividad() {
		return this.descripcionActividad;
	}

	public void setDescripcionActividad(String descripcionActividad) {
		this.descripcionActividad = descripcionActividad;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_solicitud", nullable = false, length = 13)
	public Date getFechaSolicitud() {
		return this.fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
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

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * SolicitudMantenimiento generated by hbm2java
 */
@Entity
@Table(name = "solicitud_mantenimiento", schema = "public")
public class SolicitudMantenimiento implements java.io.Serializable {

	private SolicitudMantenimientoId id;
	private Actividad actividad;
	private DatoBasico datoBasico;
<<<<<<< HEAD
	private String descripcionActividad;
=======
<<<<<<< HEAD
	private String descripcionActividad;
=======
<<<<<<< HEAD
	private String descripcionActividad;
=======
>>>>>>> 7d4823278d0a354855f5032a99e2b48c65b33e7f
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514
	private char estatus;

	public SolicitudMantenimiento() {
	}

	public SolicitudMantenimiento(SolicitudMantenimientoId id,
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514
			Actividad actividad, DatoBasico datoBasico,
			String descripcionActividad, char estatus) {
		this.id = id;
		this.actividad = actividad;
		this.datoBasico = datoBasico;
		this.descripcionActividad = descripcionActividad;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
			Actividad actividad, DatoBasico datoBasico, char estatus) {
		this.id = id;
		this.actividad = actividad;
		this.datoBasico = datoBasico;
>>>>>>> 7d4823278d0a354855f5032a99e2b48c65b33e7f
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514
		this.estatus = estatus;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoSolicitud", column = @Column(name = "codigo_solicitud", nullable = false)),
			@AttributeOverride(name = "codigoActividad", column = @Column(name = "codigo_actividad", nullable = false)) })
	public SolicitudMantenimientoId getId() {
		return this.id;
	}

	public void setId(SolicitudMantenimientoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_actividad", nullable = false, insertable = false, updatable = false)
	public Actividad getActividad() {
		return this.actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_prioridad", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514
	@Column(name = "descripcion_actividad", nullable = false)
	public String getDescripcionActividad() {
		return this.descripcionActividad;
	}

	public void setDescripcionActividad(String descripcionActividad) {
		this.descripcionActividad = descripcionActividad;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> 7d4823278d0a354855f5032a99e2b48c65b33e7f
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514
	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
