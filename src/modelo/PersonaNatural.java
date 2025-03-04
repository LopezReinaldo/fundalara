<<<<<<< HEAD
package modelo;

// Generated 25/01/2012 10:43:43 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * PersonaNatural generated by hbm2java
 */
@Entity
@Table(name = "persona_natural", schema = "public")
public class PersonaNatural implements java.io.Serializable {

	private String cedulaRif;
	private DatoBasico datoBasico;
	private Persona persona;
	private String celular;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private Date fechaNacimiento;
	private byte[] foto;
	private char estatus;
	private Familiar familiar;
	private Personal personal;
	private Set<EquipoCompetencia> equipoCompetencias = new HashSet<EquipoCompetencia>(
			0);
	private Jugador jugador;

	public PersonaNatural() {
	}

	public PersonaNatural(Persona persona, String primerNombre,
			String primerApellido, char estatus) {
		this.persona = persona;
		this.primerNombre = primerNombre;
		this.primerApellido = primerApellido;
		this.estatus = estatus;
	}

	public PersonaNatural(DatoBasico datoBasico, Persona persona,
			String celular, String primerNombre, String segundoNombre,
			String primerApellido, String segundoApellido,
			Date fechaNacimiento, byte[] foto, char estatus, Familiar familiar,
			Personal personal, Set<EquipoCompetencia> equipoCompetencias,
			Jugador jugador) {
		this.datoBasico = datoBasico;
		this.persona = persona;
		this.celular = celular;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.fechaNacimiento = fechaNacimiento;
		this.foto = foto;
		this.estatus = estatus;
		this.familiar = familiar;
		this.personal = personal;
		this.equipoCompetencias = equipoCompetencias;
		this.jugador = jugador;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "persona"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "cedula_rif", unique = true, nullable = false)
	public String getCedulaRif() {
		return this.cedulaRif;
	}

	public void setCedulaRif(String cedulaRif) {
		this.cedulaRif = cedulaRif;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_genero")
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Column(name = "celular")
	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Column(name = "primer_nombre", nullable = false)
	public String getPrimerNombre() {
		return this.primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	@Column(name = "segundo_nombre")
	public String getSegundoNombre() {
		return this.segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	@Column(name = "primer_apellido", nullable = false)
	public String getPrimerApellido() {
		return this.primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	@Column(name = "segundo_apellido")
	public String getSegundoApellido() {
		return this.segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_nacimiento", length = 13)
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Column(name = "foto")
	public byte[] getFoto() {
		return this.foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "personaNatural")
	public Familiar getFamiliar() {
		return this.familiar;
	}

	public void setFamiliar(Familiar familiar) {
		this.familiar = familiar;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "personaNatural")
	public Personal getPersonal() {
		return this.personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personaNatural")
	public Set<EquipoCompetencia> getEquipoCompetencias() {
		return this.equipoCompetencias;
	}

	public void setEquipoCompetencias(Set<EquipoCompetencia> equipoCompetencias) {
		this.equipoCompetencias = equipoCompetencias;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "personaNatural")
	public Jugador getJugador() {
		return this.jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
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
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * PersonaNatural generated by hbm2java
 */
@Entity
@Table(name = "persona_natural", schema = "public")
public class PersonaNatural implements java.io.Serializable {

	private String cedulaRif;
	private DatoBasico datoBasico;
	private Persona persona;
	private String celular;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private Date fechaNacimiento;
	private byte[] foto;
	private char estatus;
	private Familiar familiar;
	private Personal personal;
	private Set<EquipoCompetencia> equipoCompetencias = new HashSet<EquipoCompetencia>(
			0);
	private Jugador jugador;

	public PersonaNatural() {
	}

	public PersonaNatural(Persona persona, String primerNombre,
			String primerApellido, char estatus) {
		this.persona = persona;
		this.primerNombre = primerNombre;
		this.primerApellido = primerApellido;
		this.estatus = estatus;
	}

	public PersonaNatural(DatoBasico datoBasico, Persona persona,
			String celular, String primerNombre, String segundoNombre,
			String primerApellido, String segundoApellido,
			Date fechaNacimiento, byte[] foto, char estatus, Familiar familiar,
			Personal personal, Set<EquipoCompetencia> equipoCompetencias,
			Jugador jugador) {
		this.datoBasico = datoBasico;
		this.persona = persona;
		this.celular = celular;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.fechaNacimiento = fechaNacimiento;
		this.foto = foto;
		this.estatus = estatus;
		this.familiar = familiar;
		this.personal = personal;
		this.equipoCompetencias = equipoCompetencias;
		this.jugador = jugador;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "persona"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "cedula_rif", unique = true, nullable = false)
	public String getCedulaRif() {
		return this.cedulaRif;
	}

	public void setCedulaRif(String cedulaRif) {
		this.cedulaRif = cedulaRif;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_genero")
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Column(name = "celular")
	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Column(name = "primer_nombre", nullable = false)
	public String getPrimerNombre() {
		return this.primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	@Column(name = "segundo_nombre")
	public String getSegundoNombre() {
		return this.segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	@Column(name = "primer_apellido", nullable = false)
	public String getPrimerApellido() {
		return this.primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	@Column(name = "segundo_apellido")
	public String getSegundoApellido() {
		return this.segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_nacimiento", length = 13)
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Column(name = "foto")
	public byte[] getFoto() {
		return this.foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "personaNatural")
	public Familiar getFamiliar() {
		return this.familiar;
	}

	public void setFamiliar(Familiar familiar) {
		this.familiar = familiar;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "personaNatural")
	public Personal getPersonal() {
		return this.personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personaNatural")
	public Set<EquipoCompetencia> getEquipoCompetencias() {
		return this.equipoCompetencias;
	}

	public void setEquipoCompetencias(Set<EquipoCompetencia> equipoCompetencias) {
		this.equipoCompetencias = equipoCompetencias;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "personaNatural")
	public Jugador getJugador() {
		return this.jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

}
>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
