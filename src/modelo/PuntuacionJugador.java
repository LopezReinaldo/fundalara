<<<<<<< HEAD
package modelo;

// Generated 25/01/2012 10:43:43 AM by Hibernate Tools 3.4.0.CR1

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
 * PuntuacionJugador generated by hbm2java
 */
@Entity
@Table(name = "puntuacion_jugador", schema = "public")
public class PuntuacionJugador implements java.io.Serializable {

	private PuntuacionJugadorId id;
	private DesempennoJugador desempennoJugador;
	private IndicadorActividadEscala indicadorActividadEscala;
	private String puntuacion;
	private char estatus;

	public PuntuacionJugador() {
	}

	public PuntuacionJugador(PuntuacionJugadorId id,
			DesempennoJugador desempennoJugador,
			IndicadorActividadEscala indicadorActividadEscala,
			String puntuacion, char estatus) {
		this.id = id;
		this.desempennoJugador = desempennoJugador;
		this.indicadorActividadEscala = indicadorActividadEscala;
		this.puntuacion = puntuacion;
		this.estatus = estatus;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoDesempennoJugador", column = @Column(name = "codigo_desempenno_jugador", nullable = false)),
			@AttributeOverride(name = "codigoIndicadorActividadEscala", column = @Column(name = "codigo_indicador_actividad_escala", nullable = false)) })
	public PuntuacionJugadorId getId() {
		return this.id;
	}

	public void setId(PuntuacionJugadorId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_desempenno_jugador", nullable = false, insertable = false, updatable = false)
	public DesempennoJugador getDesempennoJugador() {
		return this.desempennoJugador;
	}

	public void setDesempennoJugador(DesempennoJugador desempennoJugador) {
		this.desempennoJugador = desempennoJugador;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_indicador_actividad_escala", nullable = false, insertable = false, updatable = false)
	public IndicadorActividadEscala getIndicadorActividadEscala() {
		return this.indicadorActividadEscala;
	}

	public void setIndicadorActividadEscala(
			IndicadorActividadEscala indicadorActividadEscala) {
		this.indicadorActividadEscala = indicadorActividadEscala;
	}

	@Column(name = "puntuacion", nullable = false)
	public String getPuntuacion() {
		return this.puntuacion;
	}

	public void setPuntuacion(String puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
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
 * PuntuacionJugador generated by hbm2java
 */
@Entity
@Table(name = "puntuacion_jugador", schema = "public")
public class PuntuacionJugador implements java.io.Serializable {

	private PuntuacionJugadorId id;
	private DesempennoJugador desempennoJugador;
	private IndicadorActividadEscala indicadorActividadEscala;
	private String puntuacion;
	private char estatus;

	public PuntuacionJugador() {
	}

	public PuntuacionJugador(PuntuacionJugadorId id,
			DesempennoJugador desempennoJugador,
			IndicadorActividadEscala indicadorActividadEscala,
			String puntuacion, char estatus) {
		this.id = id;
		this.desempennoJugador = desempennoJugador;
		this.indicadorActividadEscala = indicadorActividadEscala;
		this.puntuacion = puntuacion;
		this.estatus = estatus;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoDesempennoJugador", column = @Column(name = "codigo_desempenno_jugador", nullable = false)),
			@AttributeOverride(name = "codigoIndicadorActividadEscala", column = @Column(name = "codigo_indicador_actividad_escala", nullable = false)) })
	public PuntuacionJugadorId getId() {
		return this.id;
	}

	public void setId(PuntuacionJugadorId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_desempenno_jugador", nullable = false, insertable = false, updatable = false)
	public DesempennoJugador getDesempennoJugador() {
		return this.desempennoJugador;
	}

	public void setDesempennoJugador(DesempennoJugador desempennoJugador) {
		this.desempennoJugador = desempennoJugador;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_indicador_actividad_escala", nullable = false, insertable = false, updatable = false)
	public IndicadorActividadEscala getIndicadorActividadEscala() {
		return this.indicadorActividadEscala;
	}

	public void setIndicadorActividadEscala(
			IndicadorActividadEscala indicadorActividadEscala) {
		this.indicadorActividadEscala = indicadorActividadEscala;
	}

	@Column(name = "puntuacion", nullable = false)
	public String getPuntuacion() {
		return this.puntuacion;
	}

	public void setPuntuacion(String puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
