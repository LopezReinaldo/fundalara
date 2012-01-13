package modelo;

// Generated 13/01/2012 02:49:46 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * JugadorForaneo generated by hbm2java
 */
@Entity
@Table(name = "jugador_foraneo", schema = "public")
public class JugadorForaneo implements java.io.Serializable {

	private String cedula;
	private EquipoCompetencia equipoCompetencia;
	private String nombre;
	private char estatus;
	private Set<RosterCompetencia> rosterCompetencias = new HashSet<RosterCompetencia>(
			0);

	public JugadorForaneo() {
	}

	public JugadorForaneo(String cedula, EquipoCompetencia equipoCompetencia,
			String nombre, char estatus) {
		this.cedula = cedula;
		this.equipoCompetencia = equipoCompetencia;
		this.nombre = nombre;
		this.estatus = estatus;
	}

	public JugadorForaneo(String cedula, EquipoCompetencia equipoCompetencia,
			String nombre, char estatus,
			Set<RosterCompetencia> rosterCompetencias) {
		this.cedula = cedula;
		this.equipoCompetencia = equipoCompetencia;
		this.nombre = nombre;
		this.estatus = estatus;
		this.rosterCompetencias = rosterCompetencias;
	}

	@Id
	@Column(name = "cedula", unique = true, nullable = false)
	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_equipo_competencia", nullable = false)
	public EquipoCompetencia getEquipoCompetencia() {
		return this.equipoCompetencia;
	}

	public void setEquipoCompetencia(EquipoCompetencia equipoCompetencia) {
		this.equipoCompetencia = equipoCompetencia;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "jugador_foraneo_roster_competencia", schema = "public", joinColumns = { @JoinColumn(name = "cedula", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "codigo_roster_competencia", nullable = false, updatable = false) })
	public Set<RosterCompetencia> getRosterCompetencias() {
		return this.rosterCompetencias;
	}

	public void setRosterCompetencias(Set<RosterCompetencia> rosterCompetencias) {
		this.rosterCompetencias = rosterCompetencias;
	}

}
