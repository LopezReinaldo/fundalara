<<<<<<< HEAD
package modelo;

// Generated 25/01/2012 10:43:43 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TallaPorJugadorId generated by hbm2java
 */
@Embeddable
public class TallaPorJugadorId implements java.io.Serializable {

	private int codigoTallaIndumentaria;
	private String cedulaRif;

	public TallaPorJugadorId() {
	}

	public TallaPorJugadorId(int codigoTallaIndumentaria, String cedulaRif) {
		this.codigoTallaIndumentaria = codigoTallaIndumentaria;
		this.cedulaRif = cedulaRif;
	}

	@Column(name = "codigo_talla_indumentaria", nullable = false)
	public int getCodigoTallaIndumentaria() {
		return this.codigoTallaIndumentaria;
	}

	public void setCodigoTallaIndumentaria(int codigoTallaIndumentaria) {
		this.codigoTallaIndumentaria = codigoTallaIndumentaria;
	}

	@Column(name = "cedula_rif", nullable = false)
	public String getCedulaRif() {
		return this.cedulaRif;
	}

	public void setCedulaRif(String cedulaRif) {
		this.cedulaRif = cedulaRif;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TallaPorJugadorId))
			return false;
		TallaPorJugadorId castOther = (TallaPorJugadorId) other;

		return (this.getCodigoTallaIndumentaria() == castOther
				.getCodigoTallaIndumentaria())
				&& ((this.getCedulaRif() == castOther.getCedulaRif()) || (this
						.getCedulaRif() != null
						&& castOther.getCedulaRif() != null && this
						.getCedulaRif().equals(castOther.getCedulaRif())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoTallaIndumentaria();
		result = 37 * result
				+ (getCedulaRif() == null ? 0 : this.getCedulaRif().hashCode());
		return result;
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

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TallaPorJugadorId generated by hbm2java
 */
@Embeddable
public class TallaPorJugadorId implements java.io.Serializable {

	private int codigoTallaIndumentaria;
	private String cedulaRif;

	public TallaPorJugadorId() {
	}

	public TallaPorJugadorId(int codigoTallaIndumentaria, String cedulaRif) {
		this.codigoTallaIndumentaria = codigoTallaIndumentaria;
		this.cedulaRif = cedulaRif;
	}

	@Column(name = "codigo_talla_indumentaria", nullable = false)
	public int getCodigoTallaIndumentaria() {
		return this.codigoTallaIndumentaria;
	}

	public void setCodigoTallaIndumentaria(int codigoTallaIndumentaria) {
		this.codigoTallaIndumentaria = codigoTallaIndumentaria;
	}

	@Column(name = "cedula_rif", nullable = false)
	public String getCedulaRif() {
		return this.cedulaRif;
	}

	public void setCedulaRif(String cedulaRif) {
		this.cedulaRif = cedulaRif;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TallaPorJugadorId))
			return false;
		TallaPorJugadorId castOther = (TallaPorJugadorId) other;

		return (this.getCodigoTallaIndumentaria() == castOther
				.getCodigoTallaIndumentaria())
				&& ((this.getCedulaRif() == castOther.getCedulaRif()) || (this
						.getCedulaRif() != null
						&& castOther.getCedulaRif() != null && this
						.getCedulaRif().equals(castOther.getCedulaRif())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoTallaIndumentaria();
		result = 37 * result
				+ (getCedulaRif() == null ? 0 : this.getCedulaRif().hashCode());
		return result;
	}

}
>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
