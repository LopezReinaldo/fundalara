<<<<<<< HEAD
package modelo;

// Generated 25/01/2012 10:43:43 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * RosterCompetencia generated by hbm2java
 */
@Entity
@Table(name = "roster_competencia", schema = "public")
public class RosterCompetencia implements java.io.Serializable {

	private int codigoRosterCompetencia;
	private Roster roster;
	private Competencia competencia;
	private Equipo equipo;
	private char estatus;
	private Set<LineUp> lineUps = new HashSet<LineUp>(0);
	private Set<JugadorForaneo> jugadorForaneos = new HashSet<JugadorForaneo>(0);

	public RosterCompetencia() {
	}

	public RosterCompetencia(int codigoRosterCompetencia, Roster roster,
			Competencia competencia, Equipo equipo, char estatus) {
		this.codigoRosterCompetencia = codigoRosterCompetencia;
		this.roster = roster;
		this.competencia = competencia;
		this.equipo = equipo;
		this.estatus = estatus;
	}

	public RosterCompetencia(int codigoRosterCompetencia, Roster roster,
			Competencia competencia, Equipo equipo, char estatus,
			Set<LineUp> lineUps, Set<JugadorForaneo> jugadorForaneos) {
		this.codigoRosterCompetencia = codigoRosterCompetencia;
		this.roster = roster;
		this.competencia = competencia;
		this.equipo = equipo;
		this.estatus = estatus;
		this.lineUps = lineUps;
		this.jugadorForaneos = jugadorForaneos;
	}

	@Id
	@Column(name = "codigo_roster_competencia", unique = true, nullable = false)
	public int getCodigoRosterCompetencia() {
		return this.codigoRosterCompetencia;
	}

	public void setCodigoRosterCompetencia(int codigoRosterCompetencia) {
		this.codigoRosterCompetencia = codigoRosterCompetencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_roster", nullable = false)
	public Roster getRoster() {
		return this.roster;
	}

	public void setRoster(Roster roster) {
		this.roster = roster;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_competencia", nullable = false)
	public Competencia getCompetencia() {
		return this.competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_equipo", nullable = false)
	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rosterCompetencia")
	public Set<LineUp> getLineUps() {
		return this.lineUps;
	}

	public void setLineUps(Set<LineUp> lineUps) {
		this.lineUps = lineUps;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "rosterCompetencias")
	public Set<JugadorForaneo> getJugadorForaneos() {
		return this.jugadorForaneos;
	}

	public void setJugadorForaneos(Set<JugadorForaneo> jugadorForaneos) {
		this.jugadorForaneos = jugadorForaneos;
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

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * RosterCompetencia generated by hbm2java
 */
@Entity
@Table(name = "roster_competencia", schema = "public")
public class RosterCompetencia implements java.io.Serializable {

	private int codigoRosterCompetencia;
	private Roster roster;
	private Competencia competencia;
	private Equipo equipo;
	private char estatus;
	private Set<LineUp> lineUps = new HashSet<LineUp>(0);
	private Set<JugadorForaneo> jugadorForaneos = new HashSet<JugadorForaneo>(0);

	public RosterCompetencia() {
	}

	public RosterCompetencia(int codigoRosterCompetencia, Roster roster,
			Competencia competencia, Equipo equipo, char estatus) {
		this.codigoRosterCompetencia = codigoRosterCompetencia;
		this.roster = roster;
		this.competencia = competencia;
		this.equipo = equipo;
		this.estatus = estatus;
	}

	public RosterCompetencia(int codigoRosterCompetencia, Roster roster,
			Competencia competencia, Equipo equipo, char estatus,
			Set<LineUp> lineUps, Set<JugadorForaneo> jugadorForaneos) {
		this.codigoRosterCompetencia = codigoRosterCompetencia;
		this.roster = roster;
		this.competencia = competencia;
		this.equipo = equipo;
		this.estatus = estatus;
		this.lineUps = lineUps;
		this.jugadorForaneos = jugadorForaneos;
	}

	@Id
	@Column(name = "codigo_roster_competencia", unique = true, nullable = false)
	public int getCodigoRosterCompetencia() {
		return this.codigoRosterCompetencia;
	}

	public void setCodigoRosterCompetencia(int codigoRosterCompetencia) {
		this.codigoRosterCompetencia = codigoRosterCompetencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_roster", nullable = false)
	public Roster getRoster() {
		return this.roster;
	}

	public void setRoster(Roster roster) {
		this.roster = roster;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_competencia", nullable = false)
	public Competencia getCompetencia() {
		return this.competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_equipo", nullable = false)
	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rosterCompetencia")
	public Set<LineUp> getLineUps() {
		return this.lineUps;
	}

	public void setLineUps(Set<LineUp> lineUps) {
		this.lineUps = lineUps;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "rosterCompetencias")
	public Set<JugadorForaneo> getJugadorForaneos() {
		return this.jugadorForaneos;
	}

	public void setJugadorForaneos(Set<JugadorForaneo> jugadorForaneos) {
		this.jugadorForaneos = jugadorForaneos;
	}

}
>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
