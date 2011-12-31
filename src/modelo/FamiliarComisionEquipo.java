package modelo;

// Generated 31/12/2011 11:02:01 AM by Hibernate Tools 3.4.0.CR1

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
	private char estatus1;

	public FamiliarComisionEquipo() {
	}

	public FamiliarComisionEquipo(FamiliarComisionEquipoId id,
			FamiliarJugador familiarJugador, ComisionEquipo comisionEquipo,
			char estatus1) {
		this.id = id;
		this.familiarJugador = familiarJugador;
		this.comisionEquipo = comisionEquipo;
		this.estatus1 = estatus1;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoFamiliarJugador", column = @Column(name = "codigo_familiar_jugador", nullable = false)),
			@AttributeOverride(name = "estatus", column = @Column(name = "estatus", nullable = false)) })
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
	@JoinColumn(name = "estatus", nullable = false, insertable = false, updatable = false)
	public ComisionEquipo getComisionEquipo() {
		return this.comisionEquipo;
	}

	public void setComisionEquipo(ComisionEquipo comisionEquipo) {
		this.comisionEquipo = comisionEquipo;
	}

	@Column(name = "estatus_1", nullable = false, length = 1)
	public char getEstatus1() {
		return this.estatus1;
	}

	public void setEstatus1(char estatus1) {
		this.estatus1 = estatus1;
	}

}
