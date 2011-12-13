package modelo;

// Generated 12/12/2011 09:17:13 PM by Hibernate Tools 3.4.0.CR1

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
 * TipoMantenimiento generated by hbm2java
 */
@Entity
@Table(name = "tipo_mantenimiento")
public class TipoMantenimiento implements java.io.Serializable {

	private String codigoTipoMantenimiento;
	private ClaseMantenimiento claseMantenimiento;
	private String descripcion;
	private char estatus;
	private Set<PlanificacionMantenimiento> planificacionMantenimientos = new HashSet<PlanificacionMantenimiento>(
			0);

	public TipoMantenimiento() {
	}

	public TipoMantenimiento(String codigoTipoMantenimiento,
			ClaseMantenimiento claseMantenimiento, String descripcion,
			char estatus) {
		this.codigoTipoMantenimiento = codigoTipoMantenimiento;
		this.claseMantenimiento = claseMantenimiento;
		this.descripcion = descripcion;
		this.estatus = estatus;
	}

	public TipoMantenimiento(String codigoTipoMantenimiento,
			ClaseMantenimiento claseMantenimiento, String descripcion,
			char estatus,
			Set<PlanificacionMantenimiento> planificacionMantenimientos) {
		this.codigoTipoMantenimiento = codigoTipoMantenimiento;
		this.claseMantenimiento = claseMantenimiento;
		this.descripcion = descripcion;
		this.estatus = estatus;
		this.planificacionMantenimientos = planificacionMantenimientos;
	}

	@Id
	@Column(name = "codigo_tipo_mantenimiento", unique = true, nullable = false)
	public String getCodigoTipoMantenimiento() {
		return this.codigoTipoMantenimiento;
	}

	public void setCodigoTipoMantenimiento(String codigoTipoMantenimiento) {
		this.codigoTipoMantenimiento = codigoTipoMantenimiento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_clase_mantenimiento", nullable = false)
	public ClaseMantenimiento getClaseMantenimiento() {
		return this.claseMantenimiento;
	}

	public void setClaseMantenimiento(ClaseMantenimiento claseMantenimiento) {
		this.claseMantenimiento = claseMantenimiento;
	}

	@Column(name = "descripcion", nullable = false)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoMantenimiento")
	public Set<PlanificacionMantenimiento> getPlanificacionMantenimientos() {
		return this.planificacionMantenimientos;
	}

	public void setPlanificacionMantenimientos(
			Set<PlanificacionMantenimiento> planificacionMantenimientos) {
		this.planificacionMantenimientos = planificacionMantenimientos;
	}

}
