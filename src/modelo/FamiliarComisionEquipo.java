package modelo;

// Generated 13/01/2012 03:34:55 AM by Hibernate Tools 3.4.0.CR1

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
 * FamiliarComisionEquipo generated by hbm2java
 */
@Entity
@Table(name = "familiar_comision_equipo", schema = "public")
public class FamiliarComisionEquipo implements java.io.Serializable {

	private FamiliarComisionEquipoId id;
	private FamiliarJugador familiarJugador;
	private ComisionEquipo comisionEquipo;
	private char estatus;

	public FamiliarComisionEquipo() {
	}

	public FamiliarComisionEquipo(FamiliarComisionEquipoId id,
			FamiliarJugador familiarJugador, ComisionEquipo comisionEquipo,
			char estatus) {
		this.id = id;
		this.familiarJugador = familiarJugador;
		this.comisionEquipo = comisionEquipo;
		this.estatus = estatus;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoComisionEquipo", column = @Column(name = "codigo_comision_equipo", nullable = false)),
			@AttributeOverride(name = "codigoFamiliarJugador", column = @Column(name = "codigo_familiar_jugador", nullable = false)) })
	public FamiliarComisionEquipoId getId() {
		return this.id;
	}

	public void setId(FamiliarComisionEquipoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_familiar_jugador", nullable = false, insertable = false, updatable = false)
	public FamiliarJugador getFamiliarJugador() {
		return this.familiarJugador;
	}

	public void setFamiliarJugador(FamiliarJugador familiarJugador) {
		this.familiarJugador = familiarJugador;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_comision_equipo", nullable = false, insertable = false, updatable = false)
	public ComisionEquipo getComisionEquipo() {
		return this.comisionEquipo;
	}

	public void setComisionEquipo(ComisionEquipo comisionEquipo) {
		this.comisionEquipo = comisionEquipo;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
