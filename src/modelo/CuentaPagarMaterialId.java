<<<<<<< HEAD
package modelo;

// Generated 25/01/2012 10:43:43 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CuentaPagarMaterialId generated by hbm2java
 */
@Embeddable
public class CuentaPagarMaterialId implements java.io.Serializable {

	private int codigoMaterial;
	private String origen;

	public CuentaPagarMaterialId() {
	}

	public CuentaPagarMaterialId(int codigoMaterial, String origen) {
		this.codigoMaterial = codigoMaterial;
		this.origen = origen;
	}

	@Column(name = "codigo_material", nullable = false)
	public int getCodigoMaterial() {
		return this.codigoMaterial;
	}

	public void setCodigoMaterial(int codigoMaterial) {
		this.codigoMaterial = codigoMaterial;
	}

	@Column(name = "origen", nullable = false)
	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CuentaPagarMaterialId))
			return false;
		CuentaPagarMaterialId castOther = (CuentaPagarMaterialId) other;

		return (this.getCodigoMaterial() == castOther.getCodigoMaterial())
				&& ((this.getOrigen() == castOther.getOrigen()) || (this
						.getOrigen() != null && castOther.getOrigen() != null && this
						.getOrigen().equals(castOther.getOrigen())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoMaterial();
		result = 37 * result
				+ (getOrigen() == null ? 0 : this.getOrigen().hashCode());
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
 * CuentaPagarMaterialId generated by hbm2java
 */
@Embeddable
public class CuentaPagarMaterialId implements java.io.Serializable {

	private int codigoMaterial;
	private String origen;

	public CuentaPagarMaterialId() {
	}

	public CuentaPagarMaterialId(int codigoMaterial, String origen) {
		this.codigoMaterial = codigoMaterial;
		this.origen = origen;
	}

	@Column(name = "codigo_material", nullable = false)
	public int getCodigoMaterial() {
		return this.codigoMaterial;
	}

	public void setCodigoMaterial(int codigoMaterial) {
		this.codigoMaterial = codigoMaterial;
	}

	@Column(name = "origen", nullable = false)
	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CuentaPagarMaterialId))
			return false;
		CuentaPagarMaterialId castOther = (CuentaPagarMaterialId) other;

		return (this.getCodigoMaterial() == castOther.getCodigoMaterial())
				&& ((this.getOrigen() == castOther.getOrigen()) || (this
						.getOrigen() != null && castOther.getOrigen() != null && this
						.getOrigen().equals(castOther.getOrigen())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoMaterial();
		result = 37 * result
				+ (getOrigen() == null ? 0 : this.getOrigen().hashCode());
		return result;
	}

}
>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
