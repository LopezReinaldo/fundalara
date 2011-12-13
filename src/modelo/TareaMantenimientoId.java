package modelo;

// Generated 12/12/2011 09:17:13 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TareaMantenimientoId generated by hbm2java
 */
@Embeddable
public class TareaMantenimientoId implements java.io.Serializable {

	private String codigoMantenimiento;
	private String codigoTarea;

	public TareaMantenimientoId() {
	}

	public TareaMantenimientoId(String codigoMantenimiento, String codigoTarea) {
		this.codigoMantenimiento = codigoMantenimiento;
		this.codigoTarea = codigoTarea;
	}

	@Column(name = "codigo_mantenimiento", nullable = false)
	public String getCodigoMantenimiento() {
		return this.codigoMantenimiento;
	}

	public void setCodigoMantenimiento(String codigoMantenimiento) {
		this.codigoMantenimiento = codigoMantenimiento;
	}

	@Column(name = "codigo_tarea", nullable = false)
	public String getCodigoTarea() {
		return this.codigoTarea;
	}

	public void setCodigoTarea(String codigoTarea) {
		this.codigoTarea = codigoTarea;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TareaMantenimientoId))
			return false;
		TareaMantenimientoId castOther = (TareaMantenimientoId) other;

		return ((this.getCodigoMantenimiento() == castOther
				.getCodigoMantenimiento()) || (this.getCodigoMantenimiento() != null
				&& castOther.getCodigoMantenimiento() != null && this
				.getCodigoMantenimiento().equals(
						castOther.getCodigoMantenimiento())))
				&& ((this.getCodigoTarea() == castOther.getCodigoTarea()) || (this
						.getCodigoTarea() != null
						&& castOther.getCodigoTarea() != null && this
						.getCodigoTarea().equals(castOther.getCodigoTarea())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCodigoMantenimiento() == null ? 0 : this
						.getCodigoMantenimiento().hashCode());
		result = 37
				* result
				+ (getCodigoTarea() == null ? 0 : this.getCodigoTarea()
						.hashCode());
		return result;
	}

}
