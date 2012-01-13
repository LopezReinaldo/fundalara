package modelo;

// Generated 13/01/2012 03:34:55 AM by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Persona generated by hbm2java
 */
@Entity
@Table(name = "persona", schema = "public")
public class Persona implements java.io.Serializable {

	private String cedulaRif;
	private DatoBasico datoBasicoByCodigoParroquia;
	private DatoBasico datoBasicoByCodigoTipoPersona;
	private String telefonoHabitacion;
	private Date fechaIngreso;
	private String correoElectronico;
	private String twitter;
	private String direccion;
	private Date fechaEgreso;
	private char estatus;
	private PersonaJuridica personaJuridica;
	private Set<DocumentoAcreedor> documentoAcreedorsForCedulaAtleta = new HashSet<DocumentoAcreedor>(
			0);
	private Set<CuentaPagar> cuentaPagars = new HashSet<CuentaPagar>(0);
	private Set<DocumentoAcreedor> documentoAcreedorsForCedulaRif = new HashSet<DocumentoAcreedor>(
			0);
	private PersonaNatural personaNatural;

	public Persona() {
	}

	public Persona(String cedulaRif, DatoBasico datoBasicoByCodigoTipoPersona,
			Date fechaIngreso, char estatus) {
		this.cedulaRif = cedulaRif;
		this.datoBasicoByCodigoTipoPersona = datoBasicoByCodigoTipoPersona;
		this.fechaIngreso = fechaIngreso;
		this.estatus = estatus;
	}

	public Persona(String cedulaRif, DatoBasico datoBasicoByCodigoParroquia,
			DatoBasico datoBasicoByCodigoTipoPersona,
			String telefonoHabitacion, Date fechaIngreso,
			String correoElectronico, String twitter, String direccion,
			Date fechaEgreso, char estatus, PersonaJuridica personaJuridica,
			Set<DocumentoAcreedor> documentoAcreedorsForCedulaAtleta,
			Set<CuentaPagar> cuentaPagars,
			Set<DocumentoAcreedor> documentoAcreedorsForCedulaRif,
			PersonaNatural personaNatural) {
		this.cedulaRif = cedulaRif;
		this.datoBasicoByCodigoParroquia = datoBasicoByCodigoParroquia;
		this.datoBasicoByCodigoTipoPersona = datoBasicoByCodigoTipoPersona;
		this.telefonoHabitacion = telefonoHabitacion;
		this.fechaIngreso = fechaIngreso;
		this.correoElectronico = correoElectronico;
		this.twitter = twitter;
		this.direccion = direccion;
		this.fechaEgreso = fechaEgreso;
		this.estatus = estatus;
		this.personaJuridica = personaJuridica;
		this.documentoAcreedorsForCedulaAtleta = documentoAcreedorsForCedulaAtleta;
		this.cuentaPagars = cuentaPagars;
		this.documentoAcreedorsForCedulaRif = documentoAcreedorsForCedulaRif;
		this.personaNatural = personaNatural;
	}

	@Id
	@Column(name = "cedula_rif", unique = true, nullable = false)
	public String getCedulaRif() {
		return this.cedulaRif;
	}

	public void setCedulaRif(String cedulaRif) {
		this.cedulaRif = cedulaRif;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_parroquia")
	public DatoBasico getDatoBasicoByCodigoParroquia() {
		return this.datoBasicoByCodigoParroquia;
	}

	public void setDatoBasicoByCodigoParroquia(
			DatoBasico datoBasicoByCodigoParroquia) {
		this.datoBasicoByCodigoParroquia = datoBasicoByCodigoParroquia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tipo_persona", nullable = false)
	public DatoBasico getDatoBasicoByCodigoTipoPersona() {
		return this.datoBasicoByCodigoTipoPersona;
	}

	public void setDatoBasicoByCodigoTipoPersona(
			DatoBasico datoBasicoByCodigoTipoPersona) {
		this.datoBasicoByCodigoTipoPersona = datoBasicoByCodigoTipoPersona;
	}

	@Column(name = "telefono_habitacion")
	public String getTelefonoHabitacion() {
		return this.telefonoHabitacion;
	}

	public void setTelefonoHabitacion(String telefonoHabitacion) {
		this.telefonoHabitacion = telefonoHabitacion;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_ingreso", nullable = false, length = 13)
	public Date getFechaIngreso() {
		return this.fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Column(name = "correo_electronico")
	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	@Column(name = "twitter")
	public String getTwitter() {
		return this.twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	@Column(name = "direccion")
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_egreso", length = 13)
	public Date getFechaEgreso() {
		return this.fechaEgreso;
	}

	public void setFechaEgreso(Date fechaEgreso) {
		this.fechaEgreso = fechaEgreso;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "persona")
	public PersonaJuridica getPersonaJuridica() {
		return this.personaJuridica;
	}

	public void setPersonaJuridica(PersonaJuridica personaJuridica) {
		this.personaJuridica = personaJuridica;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personaByCedulaAtleta")
	public Set<DocumentoAcreedor> getDocumentoAcreedorsForCedulaAtleta() {
		return this.documentoAcreedorsForCedulaAtleta;
	}

	public void setDocumentoAcreedorsForCedulaAtleta(
			Set<DocumentoAcreedor> documentoAcreedorsForCedulaAtleta) {
		this.documentoAcreedorsForCedulaAtleta = documentoAcreedorsForCedulaAtleta;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	public Set<CuentaPagar> getCuentaPagars() {
		return this.cuentaPagars;
	}

	public void setCuentaPagars(Set<CuentaPagar> cuentaPagars) {
		this.cuentaPagars = cuentaPagars;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personaByCedulaRif")
	public Set<DocumentoAcreedor> getDocumentoAcreedorsForCedulaRif() {
		return this.documentoAcreedorsForCedulaRif;
	}

	public void setDocumentoAcreedorsForCedulaRif(
			Set<DocumentoAcreedor> documentoAcreedorsForCedulaRif) {
		this.documentoAcreedorsForCedulaRif = documentoAcreedorsForCedulaRif;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "persona")
	public PersonaNatural getPersonaNatural() {
		return this.personaNatural;
	}

	public void setPersonaNatural(PersonaNatural personaNatural) {
		this.personaNatural = personaNatural;
	}

}
