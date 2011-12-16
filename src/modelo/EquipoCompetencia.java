package modelo;

// Generated 16/12/2011 10:21:41 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * EquipoCompetencia generated by hbm2java
 */
@Entity
@Table(name = "equipo_competencia")
public class EquipoCompetencia implements java.io.Serializable {

	private String codigoEquipoCompetencia;
	private Competencia competencia;
	private Equipo equipo;
	private Set<JugadorForaneo> jugadorForaneos = new HashSet<JugadorForaneo>(0);
	private Set<EquipoJuego> equipoJuegos = new HashSet<EquipoJuego>(0);

	public EquipoCompetencia() {
	}

	public EquipoCompetencia(String codigoEquipoCompetencia,
			Competencia competencia, Equipo equipo) {
		this.codigoEquipoCompetencia = codigoEquipoCompetencia;
		this.competencia = competencia;
		this.equipo = equipo;
	}

	public EquipoCompetencia(String codigoEquipoCompetencia,
			Competencia competencia, Equipo equipo,
			Set<JugadorForaneo> jugadorForaneos, Set<EquipoJuego> equipoJuegos) {
		this.codigoEquipoCompetencia = codigoEquipoCompetencia;
		this.competencia = competencia;
		this.equipo = equipo;
		this.jugadorForaneos = jugadorForaneos;
		this.equipoJuegos = equipoJuegos;
	}

	@Id
	@Column(name = "codigo_equipo_competencia", unique = true, nullable = false)
	public String getCodigoEquipoCompetencia() {
		return this.codigoEquipoCompetencia;
	}

	public void setCodigoEquipoCompetencia(String codigoEquipoCompetencia) {
		this.codigoEquipoCompetencia = codigoEquipoCompetencia;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equipoCompetencia")
	public Set<JugadorForaneo> getJugadorForaneos() {
		return this.jugadorForaneos;
	}

	public void setJugadorForaneos(Set<JugadorForaneo> jugadorForaneos) {
		this.jugadorForaneos = jugadorForaneos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equipoCompetencia")
	public Set<EquipoJuego> getEquipoJuegos() {
		return this.equipoJuegos;
	}

	public void setEquipoJuegos(Set<EquipoJuego> equipoJuegos) {
		this.equipoJuegos = equipoJuegos;
	}

}
