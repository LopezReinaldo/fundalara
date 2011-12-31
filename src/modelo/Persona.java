package modelo;

// Generated 31/12/2011 11:02:01 AM by Hibernate Tools 3.4.0.CR1

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
	private DatoBasico datoBasico;
	private String telefonoHabitacion;
	private Date fechaIngreso;
	private String correoElectronico;
	private String facebook;
	private String twitter;
	private String direccion;
	private Date fechaEgreso;
	private Date fechaNacimiento;
	private char sexo;
	private PersonaJuridica personaJuridica;
	private Jugador jugador;
	private Set<EquipoCompetencia> equipoCompetencias = new HashSet<EquipoCompetencia>(
			0);
	private Set<DocumentoAcreedor> documentoAcreedorsForCedulaAtleta = new HashSet<DocumentoAcreedor>(
			0);
	private Set<CuentaPagar> cuentaPagars = new HashSet<CuentaPagar>(0);
	private Set<DocumentoAcreedor> documentoAcreedorsForCedulaRif = new HashSet<DocumentoAcreedor>(
			0);
	private Familiar familiar;
	private PersonaNatural personaNatural;

	public Persona() {
	}

	public Persona(String cedulaRif, DatoBasico datoBasico, Date fechaIngreso,
			String direccion, char sexo) {
		this.cedulaRif = cedulaRif;
		this.datoBasico = datoBasico;
		this.fechaIngreso = fechaIngreso;
		this.direccion = direccion;
		this.sexo = sexo;
	}

	public Persona(String cedulaRif, DatoBasico datoBasico,
			String telefonoHabitacion, Date fechaIngreso,
			String correoElectronico, String facebook, String twitter,
			String direccion, Date fechaEgreso, Date fechaNacimiento,
			char sexo, PersonaJuridica personaJuridica, Jugador jugador,
			Set<EquipoCompetencia> equipoCompetencias,
			Set<DocumentoAcreedor> documentoAcreedorsForCedulaAtleta,
			Set<CuentaPagar> cuentaPagars,
			Set<DocumentoAcreedor> documentoAcreedorsForCedulaRif,
			Familiar familiar, PersonaNatural personaNatural) {
		this.cedulaRif = cedulaRif;
		this.datoBasico = datoBasico;
		this.telefonoHabitacion = telefonoHabitacion;
		this.fechaIngreso = fechaIngreso;
		this.correoElectronico = correoElectronico;
		this.facebook = facebook;
		this.twitter = twitter;
		this.direccion = direccion;
		this.fechaEgreso = fechaEgreso;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.personaJuridica = personaJuridica;
		this.jugador = jugador;
		this.equipoCompetencias = equipoCompetencias;
		this.documentoAcreedorsForCedulaAtleta = documentoAcreedorsForCedulaAtleta;
		this.cuentaPagars = cuentaPagars;
		this.documentoAcreedorsForCedulaRif = documentoAcreedorsForCedulaRif;
		this.familiar = familiar;
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
	@JoinColumn(name = "codigo_parroquia", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
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

	@Column(name = "facebook")
	public String getFacebook() {
		return this.facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	@Column(name = "twitter")
	public String getTwitter() {
		return this.twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	@Column(name = "direccion", nullable = false)
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

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_nacimiento", length = 13)
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Column(name = "sexo", nullable = false, length = 1)
	public char getSexo() {
		return this.sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "persona")
	public PersonaJuridica getPersonaJuridica() {
		return this.personaJuridica;
	}

	public void setPersonaJuridica(PersonaJuridica personaJuridica) {
		this.personaJuridica = personaJuridica;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "persona")
	public Jugador getJugador() {
		return this.jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	public Set<EquipoCompetencia> getEquipoCompetencias() {
		return this.equipoCompetencias;
	}

	public void setEquipoCompetencias(Set<EquipoCompetencia> equipoCompetencias) {
		this.equipoCompetencias = equipoCompetencias;
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
	public Familiar getFamiliar() {
		return this.familiar;
	}

	public void setFamiliar(Familiar familiar) {
		this.familiar = familiar;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "persona")
	public PersonaNatural getPersonaNatural() {
		return this.personaNatural;
	}

	public void setPersonaNatural(PersonaNatural personaNatural) {
		this.personaNatural = personaNatural;
	}

}
