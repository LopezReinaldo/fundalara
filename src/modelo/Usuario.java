package modelo;

// Generated 25/01/2012 12:32:42 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario", schema = "public")
public class Usuario implements java.io.Serializable {

	private String cedulaRif;
	private Personal personal;
	private String nick;
	private String password;
	private char estatus;
	private Set<Perfil> perfils = new HashSet<Perfil>(0);
	private Set<DetalleSeguridadFuncional> detalleSeguridadFuncionals = new HashSet<DetalleSeguridadFuncional>(
			0);
	private Set<SeguridadFuncional> seguridadFuncionals = new HashSet<SeguridadFuncional>(
			0);

	public Usuario() {
	}

	public Usuario(Personal personal, String nick, String password, char estatus) {
		this.personal = personal;
		this.nick = nick;
		this.password = password;
		this.estatus = estatus;
	}

	public Usuario(Personal personal, String nick, String password,
			char estatus, Set<Perfil> perfils,
			Set<DetalleSeguridadFuncional> detalleSeguridadFuncionals,
			Set<SeguridadFuncional> seguridadFuncionals) {
		this.personal = personal;
		this.nick = nick;
		this.password = password;
		this.estatus = estatus;
		this.perfils = perfils;
		this.detalleSeguridadFuncionals = detalleSeguridadFuncionals;
		this.seguridadFuncionals = seguridadFuncionals;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "personal"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "cedula_rif", unique = true, nullable = false)
	public String getCedulaRif() {
		return this.cedulaRif;
	}

	public void setCedulaRif(String cedulaRif) {
		this.cedulaRif = cedulaRif;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Personal getPersonal() {
		return this.personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	@Column(name = "nick", nullable = false)
	public String getNick() {
		return this.nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<Perfil> getPerfils() {
		return this.perfils;
	}

	public void setPerfils(Set<Perfil> perfils) {
		this.perfils = perfils;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<DetalleSeguridadFuncional> getDetalleSeguridadFuncionals() {
		return this.detalleSeguridadFuncionals;
	}

	public void setDetalleSeguridadFuncionals(
			Set<DetalleSeguridadFuncional> detalleSeguridadFuncionals) {
		this.detalleSeguridadFuncionals = detalleSeguridadFuncionals;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<SeguridadFuncional> getSeguridadFuncionals() {
		return this.seguridadFuncionals;
	}

	public void setSeguridadFuncionals(
			Set<SeguridadFuncional> seguridadFuncionals) {
		this.seguridadFuncionals = seguridadFuncionals;
	}

}
