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
 * DesempennoColectivo generated by hbm2java
 */
@Entity
@Table(name = "desempenno_colectivo", schema = "public")
public class DesempennoColectivo implements java.io.Serializable {

	private DesempennoColectivoId id;
	private IndicadorCategoriaCompetencia indicadorCategoriaCompetencia;
	private EquipoJuego equipoJuego;
	private float valor;
	private int inning;

	public DesempennoColectivo() {
	}

	public DesempennoColectivo(DesempennoColectivoId id,
			IndicadorCategoriaCompetencia indicadorCategoriaCompetencia,
			EquipoJuego equipoJuego, float valor, int inning) {
		this.id = id;
		this.indicadorCategoriaCompetencia = indicadorCategoriaCompetencia;
		this.equipoJuego = equipoJuego;
		this.valor = valor;
		this.inning = inning;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoEquipoJuego", column = @Column(name = "codigo_equipo_juego", nullable = false)),
			@AttributeOverride(name = "codigoIndicadorCategoriaCompetencia", column = @Column(name = "codigo_indicador_categoria_competencia", nullable = false)) })
	public DesempennoColectivoId getId() {
		return this.id;
	}

	public void setId(DesempennoColectivoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_indicador_categoria_competencia", nullable = false, insertable = false, updatable = false)
	public IndicadorCategoriaCompetencia getIndicadorCategoriaCompetencia() {
		return this.indicadorCategoriaCompetencia;
	}

	public void setIndicadorCategoriaCompetencia(
			IndicadorCategoriaCompetencia indicadorCategoriaCompetencia) {
		this.indicadorCategoriaCompetencia = indicadorCategoriaCompetencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_equipo_juego", nullable = false, insertable = false, updatable = false)
	public EquipoJuego getEquipoJuego() {
		return this.equipoJuego;
	}

	public void setEquipoJuego(EquipoJuego equipoJuego) {
		this.equipoJuego = equipoJuego;
	}

	@Column(name = "valor", nullable = false, precision = 8, scale = 8)
	public float getValor() {
		return this.valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	@Column(name = "inning", nullable = false)
	public int getInning() {
		return this.inning;
	}

	public void setInning(int inning) {
		this.inning = inning;
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
 * DesempennoColectivo generated by hbm2java
 */
@Entity
@Table(name = "desempenno_colectivo", schema = "public")
public class DesempennoColectivo implements java.io.Serializable {

	private DesempennoColectivoId id;
	private IndicadorCategoriaCompetencia indicadorCategoriaCompetencia;
	private EquipoJuego equipoJuego;
	private float valor;
	private int inning;

	public DesempennoColectivo() {
	}

	public DesempennoColectivo(DesempennoColectivoId id,
			IndicadorCategoriaCompetencia indicadorCategoriaCompetencia,
			EquipoJuego equipoJuego, float valor, int inning) {
		this.id = id;
		this.indicadorCategoriaCompetencia = indicadorCategoriaCompetencia;
		this.equipoJuego = equipoJuego;
		this.valor = valor;
		this.inning = inning;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoEquipoJuego", column = @Column(name = "codigo_equipo_juego", nullable = false)),
			@AttributeOverride(name = "codigoIndicadorCategoriaCompetencia", column = @Column(name = "codigo_indicador_categoria_competencia", nullable = false)) })
	public DesempennoColectivoId getId() {
		return this.id;
	}

	public void setId(DesempennoColectivoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_indicador_categoria_competencia", nullable = false, insertable = false, updatable = false)
	public IndicadorCategoriaCompetencia getIndicadorCategoriaCompetencia() {
		return this.indicadorCategoriaCompetencia;
	}

	public void setIndicadorCategoriaCompetencia(
			IndicadorCategoriaCompetencia indicadorCategoriaCompetencia) {
		this.indicadorCategoriaCompetencia = indicadorCategoriaCompetencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_equipo_juego", nullable = false, insertable = false, updatable = false)
	public EquipoJuego getEquipoJuego() {
		return this.equipoJuego;
	}

	public void setEquipoJuego(EquipoJuego equipoJuego) {
		this.equipoJuego = equipoJuego;
	}

	@Column(name = "valor", nullable = false, precision = 8, scale = 8)
	public float getValor() {
		return this.valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	@Column(name = "inning", nullable = false)
	public int getInning() {
		return this.inning;
	}

	public void setInning(int inning) {
		this.inning = inning;
	}

}
>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
