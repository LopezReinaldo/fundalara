package modelo;

// Generated 13/01/2012 02:49:46 AM by Hibernate Tools 3.4.0.CR1

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
 * DatoDeportivo generated by hbm2java
 */
@Entity
@Table(name = "dato_deportivo", schema = "public")
public class DatoDeportivo implements java.io.Serializable {

	private int codigoDatoDeportivo;
	private Competencia competencia;
	private Jugador jugador;
	private char estatus;
	private Set<LogroPorJugador> logroPorJugadors = new HashSet<LogroPorJugador>(
			0);

	public DatoDeportivo() {
	}

	public DatoDeportivo(int codigoDatoDeportivo, Competencia competencia,
			Jugador jugador, char estatus) {
		this.codigoDatoDeportivo = codigoDatoDeportivo;
		this.competencia = competencia;
		this.jugador = jugador;
		this.estatus = estatus;
	}

	public DatoDeportivo(int codigoDatoDeportivo, Competencia competencia,
			Jugador jugador, char estatus, Set<LogroPorJugador> logroPorJugadors) {
		this.codigoDatoDeportivo = codigoDatoDeportivo;
		this.competencia = competencia;
		this.jugador = jugador;
		this.estatus = estatus;
		this.logroPorJugadors = logroPorJugadors;
	}

	@Id
	@Column(name = "codigo_dato_deportivo", unique = true, nullable = false)
	public int getCodigoDatoDeportivo() {
		return this.codigoDatoDeportivo;
	}

	public void setCodigoDatoDeportivo(int codigoDatoDeportivo) {
		this.codigoDatoDeportivo = codigoDatoDeportivo;
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
	@JoinColumn(name = "cedula_rif", nullable = false)
	public Jugador getJugador() {
		return this.jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "datoDeportivo")
	public Set<LogroPorJugador> getLogroPorJugadors() {
		return this.logroPorJugadors;
	}

	public void setLogroPorJugadors(Set<LogroPorJugador> logroPorJugadors) {
		this.logroPorJugadors = logroPorJugadors;
	}

}
