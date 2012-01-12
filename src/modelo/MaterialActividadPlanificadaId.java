package modelo;

// Generated 31/12/2011 11:02:01 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MaterialActividadPlanificadaId generated by hbm2java
 */
@Embeddable
public class MaterialActividadPlanificadaId implements java.io.Serializable {

	private int codigoPlanificacionActividad;
	private int codigoMaterial;

	public MaterialActividadPlanificadaId() {
	}

	public MaterialActividadPlanificadaId(int codigoPlanificacionActividad,
			int codigoMaterial) {
		this.codigoPlanificacionActividad = codigoPlanificacionActividad;
		this.codigoMaterial = codigoMaterial;
	}

	@Column(name = "codigo_planificacion_actividad", nullable = false)
	public int getCodigoPlanificacionActividad() {
		return this.codigoPlanificacionActividad;
	}

	public void setCodigoPlanificacionActividad(int codigoPlanificacionActividad) {
		this.codigoPlanificacionActividad = codigoPlanificacionActividad;
	}

	@Column(name = "codigo_material", nullable = false)
	public int getCodigoMaterial() {
		return this.codigoMaterial;
	}

	public void setCodigoMaterial(int codigoMaterial) {
		this.codigoMaterial = codigoMaterial;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MaterialActividadPlanificadaId))
			return false;
		MaterialActividadPlanificadaId castOther = (MaterialActividadPlanificadaId) other;

		return (this.getCodigoPlanificacionActividad() == castOther
				.getCodigoPlanificacionActividad())
				&& (this.getCodigoMaterial() == castOther.getCodigoMaterial());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoPlanificacionActividad();
		result = 37 * result + this.getCodigoMaterial();
		return result;
	}

}
