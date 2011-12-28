package modelo;

// Generated 28/12/2011 03:24:38 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AsistenciaPersonalEntrenamiento generated by hbm2java
 */
@Entity
@Table(name = "asistencia_personal_entrenamiento", schema = "public")
public class AsistenciaPersonalEntrenamiento implements java.io.Serializable {

	private AsistenciaPersonalEntrenamientoId id;
	private SesionEjecutada sesionEjecutada;
	private PersonalEquipo personalEquipo;
	private Usuario usuario;
	private boolean asistencia;
	private String observacion;
	private Date fechaCreacion;
	private Date horaCreacion;
	private Date fechaModificacion;
	private Date horaModificacion;

	public AsistenciaPersonalEntrenamiento() {
	}

	public AsistenciaPersonalEntrenamiento(
			AsistenciaPersonalEntrenamientoId id,
			SesionEjecutada sesionEjecutada, PersonalEquipo personalEquipo,
			Usuario usuario, boolean asistencia, String observacion,
			Date fechaCreacion, Date horaCreacion, Date fechaModificacion,
			Date horaModificacion) {
		this.id = id;
		this.sesionEjecutada = sesionEjecutada;
		this.personalEquipo = personalEquipo;
		this.usuario = usuario;
		this.asistencia = asistencia;
		this.observacion = observacion;
		this.fechaCreacion = fechaCreacion;
		this.horaCreacion = horaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.horaModificacion = horaModificacion;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoSesionEjecutada", column = @Column(name = "codigo_sesion_ejecutada", nullable = false)),
			@AttributeOverride(name = "codigoPersonalEquipo", column = @Column(name = "codigo_personal_equipo", nullable = false)) })
	public AsistenciaPersonalEntrenamientoId getId() {
		return this.id;
	}

	public void setId(AsistenciaPersonalEntrenamientoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_sesion_ejecutada", nullable = false, insertable = false, updatable = false)
	public SesionEjecutada getSesionEjecutada() {
		return this.sesionEjecutada;
	}

	public void setSesionEjecutada(SesionEjecutada sesionEjecutada) {
		this.sesionEjecutada = sesionEjecutada;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_personal_equipo", nullable = false, insertable = false, updatable = false)
	public PersonalEquipo getPersonalEquipo() {
		return this.personalEquipo;
	}

	public void setPersonalEquipo(PersonalEquipo personalEquipo) {
		this.personalEquipo = personalEquipo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula_rif", nullable = false)
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Column(name = "asistencia", nullable = false)
	public boolean isAsistencia() {
		return this.asistencia;
	}

	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}

	@Column(name = "observacion", nullable = false)
	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_creacion", nullable = false, length = 13)
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "hora_creacion", nullable = false, length = 15)
	public Date getHoraCreacion() {
		return this.horaCreacion;
	}

	public void setHoraCreacion(Date horaCreacion) {
		this.horaCreacion = horaCreacion;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_modificacion", nullable = false, length = 13)
	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "hora_modificacion", nullable = false, length = 15)
	public Date getHoraModificacion() {
		return this.horaModificacion;
	}

	public void setHoraModificacion(Date horaModificacion) {
		this.horaModificacion = horaModificacion;
	}

}
