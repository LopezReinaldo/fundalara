package modelo;

// Generated 16/12/2011 10:21:41 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Material generated by hbm2java
 */
@Entity
@Table(name = "material")
public class Material implements java.io.Serializable {

	private String codigoMaterial;
	private String descripcion;
	private int cantidadExistencia;
	private Integer cantidadPresentacion;
	private int cantidadDisponible;
	private boolean reutilizable;
	private Integer stockMinimo;
	private Integer stockMaximo;
	private char estatus;

	public Material() {
	}

	public Material(String codigoMaterial, String descripcion,
			int cantidadExistencia, int cantidadDisponible,
			boolean reutilizable, char estatus) {
		this.codigoMaterial = codigoMaterial;
		this.descripcion = descripcion;
		this.cantidadExistencia = cantidadExistencia;
		this.cantidadDisponible = cantidadDisponible;
		this.reutilizable = reutilizable;
		this.estatus = estatus;
	}

	public Material(String codigoMaterial, String descripcion,
			int cantidadExistencia, Integer cantidadPresentacion,
			int cantidadDisponible, boolean reutilizable, Integer stockMinimo,
			Integer stockMaximo, char estatus) {
		this.codigoMaterial = codigoMaterial;
		this.descripcion = descripcion;
		this.cantidadExistencia = cantidadExistencia;
		this.cantidadPresentacion = cantidadPresentacion;
		this.cantidadDisponible = cantidadDisponible;
		this.reutilizable = reutilizable;
		this.stockMinimo = stockMinimo;
		this.stockMaximo = stockMaximo;
		this.estatus = estatus;
	}

	@Id
	@Column(name = "codigo_material", unique = true, nullable = false)
	public String getCodigoMaterial() {
		return this.codigoMaterial;
	}

	public void setCodigoMaterial(String codigoMaterial) {
		this.codigoMaterial = codigoMaterial;
	}

	@Column(name = "descripcion", nullable = false)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "cantidad_existencia", nullable = false)
	public int getCantidadExistencia() {
		return this.cantidadExistencia;
	}

	public void setCantidadExistencia(int cantidadExistencia) {
		this.cantidadExistencia = cantidadExistencia;
	}

	@Column(name = "cantidad_presentacion")
	public Integer getCantidadPresentacion() {
		return this.cantidadPresentacion;
	}

	public void setCantidadPresentacion(Integer cantidadPresentacion) {
		this.cantidadPresentacion = cantidadPresentacion;
	}

	@Column(name = "cantidad_disponible", nullable = false)
	public int getCantidadDisponible() {
		return this.cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

	@Column(name = "reutilizable", nullable = false)
	public boolean isReutilizable() {
		return this.reutilizable;
	}

	public void setReutilizable(boolean reutilizable) {
		this.reutilizable = reutilizable;
	}

	@Column(name = "stock_minimo")
	public Integer getStockMinimo() {
		return this.stockMinimo;
	}

	public void setStockMinimo(Integer stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	@Column(name = "stock_maximo")
	public Integer getStockMaximo() {
		return this.stockMaximo;
	}

	public void setStockMaximo(Integer stockMaximo) {
		this.stockMaximo = stockMaximo;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
