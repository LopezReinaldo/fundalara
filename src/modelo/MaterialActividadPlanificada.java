<<<<<<< HEAD
package modelo;

// Generated 25/01/2012 10:43:43 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * MaterialActividadPlanificada generated by hbm2java
 */
@Entity
@Table(name = "material_actividad_planificada", schema = "public")
public class MaterialActividadPlanificada implements java.io.Serializable {

	private int codigoMaterialActividadPlanificada;
	private PlanificacionActividad planificacionActividad;
	private Material material;
	private Juego juego;
	private Sesion sesion;
	private char estatus;
	private int cantidadRequerida;

	public MaterialActividadPlanificada() {
	}

	public MaterialActividadPlanificada(int codigoMaterialActividadPlanificada,
			Material material, char estatus, int cantidadRequerida) {
		this.codigoMaterialActividadPlanificada = codigoMaterialActividadPlanificada;
		this.material = material;
		this.estatus = estatus;
		this.cantidadRequerida = cantidadRequerida;
	}

	public MaterialActividadPlanificada(int codigoMaterialActividadPlanificada,
			PlanificacionActividad planificacionActividad, Material material,
			Juego juego, Sesion sesion, char estatus, int cantidadRequerida) {
		this.codigoMaterialActividadPlanificada = codigoMaterialActividadPlanificada;
		this.planificacionActividad = planificacionActividad;
		this.material = material;
		this.juego = juego;
		this.sesion = sesion;
		this.estatus = estatus;
		this.cantidadRequerida = cantidadRequerida;
	}

	@Id
	@Column(name = "codigo_material_actividad_planificada", unique = true, nullable = false)
	public int getCodigoMaterialActividadPlanificada() {
		return this.codigoMaterialActividadPlanificada;
	}

	public void setCodigoMaterialActividadPlanificada(
			int codigoMaterialActividadPlanificada) {
		this.codigoMaterialActividadPlanificada = codigoMaterialActividadPlanificada;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_planificacion_actividad")
	public PlanificacionActividad getPlanificacionActividad() {
		return this.planificacionActividad;
	}

	public void setPlanificacionActividad(
			PlanificacionActividad planificacionActividad) {
		this.planificacionActividad = planificacionActividad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_material", nullable = false)
	public Material getMaterial() {
		return this.material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_juego")
	public Juego getJuego() {
		return this.juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_sesion")
	public Sesion getSesion() {
		return this.sesion;
	}

	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@Column(name = "cantidad_requerida", nullable = false)
	public int getCantidadRequerida() {
		return this.cantidadRequerida;
	}

	public void setCantidadRequerida(int cantidadRequerida) {
		this.cantidadRequerida = cantidadRequerida;
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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * MaterialActividadPlanificada generated by hbm2java
 */
@Entity
@Table(name = "material_actividad_planificada", schema = "public")
public class MaterialActividadPlanificada implements java.io.Serializable {

	private int codigoMaterialActividadPlanificada;
	private PlanificacionActividad planificacionActividad;
	private Material material;
	private Juego juego;
	private Sesion sesion;
	private char estatus;
	private int cantidadRequerida;

	public MaterialActividadPlanificada() {
	}

	public MaterialActividadPlanificada(int codigoMaterialActividadPlanificada,
			Material material, char estatus, int cantidadRequerida) {
		this.codigoMaterialActividadPlanificada = codigoMaterialActividadPlanificada;
		this.material = material;
		this.estatus = estatus;
		this.cantidadRequerida = cantidadRequerida;
	}

	public MaterialActividadPlanificada(int codigoMaterialActividadPlanificada,
			PlanificacionActividad planificacionActividad, Material material,
			Juego juego, Sesion sesion, char estatus, int cantidadRequerida) {
		this.codigoMaterialActividadPlanificada = codigoMaterialActividadPlanificada;
		this.planificacionActividad = planificacionActividad;
		this.material = material;
		this.juego = juego;
		this.sesion = sesion;
		this.estatus = estatus;
		this.cantidadRequerida = cantidadRequerida;
	}

	@Id
	@Column(name = "codigo_material_actividad_planificada", unique = true, nullable = false)
	public int getCodigoMaterialActividadPlanificada() {
		return this.codigoMaterialActividadPlanificada;
	}

	public void setCodigoMaterialActividadPlanificada(
			int codigoMaterialActividadPlanificada) {
		this.codigoMaterialActividadPlanificada = codigoMaterialActividadPlanificada;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_planificacion_actividad")
	public PlanificacionActividad getPlanificacionActividad() {
		return this.planificacionActividad;
	}

	public void setPlanificacionActividad(
			PlanificacionActividad planificacionActividad) {
		this.planificacionActividad = planificacionActividad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_material", nullable = false)
	public Material getMaterial() {
		return this.material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_juego")
	public Juego getJuego() {
		return this.juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_sesion")
	public Sesion getSesion() {
		return this.sesion;
	}

	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@Column(name = "cantidad_requerida", nullable = false)
	public int getCantidadRequerida() {
		return this.cantidadRequerida;
	}

	public void setCantidadRequerida(int cantidadRequerida) {
		this.cantidadRequerida = cantidadRequerida;
	}

}
>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
