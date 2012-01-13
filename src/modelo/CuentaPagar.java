package modelo;

// Generated 13/01/2012 12:53:26 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CuentaPagar generated by hbm2java
 */
@Entity
@Table(name = "cuenta_pagar", schema = "public")
public class CuentaPagar implements java.io.Serializable {

	private String origen;
	private DatoBasico datoBasicoByCodigoTipoEgreso;
	private Persona persona;
	private DatoBasico datoBasicoByCodigoTipoDocumento;
	private Date fechaEmision;
	private double montoTotal;
	private Date fechaVencimiento;
	private String concepto;
	private char estado;
	private char estatus;
	private Double subtotal;
	private Set<EgresoCuentaPagar> egresoCuentaPagars = new HashSet<EgresoCuentaPagar>(
			0);
	private Set<NotaEntrega> notaEntregas = new HashSet<NotaEntrega>(0);
	private Set<CuentaPagarMaterial> cuentaPagarMaterials = new HashSet<CuentaPagarMaterial>(
			0);

	public CuentaPagar() {
	}

	public CuentaPagar(String origen, DatoBasico datoBasicoByCodigoTipoEgreso,
			Persona persona, DatoBasico datoBasicoByCodigoTipoDocumento,
			Date fechaEmision, double montoTotal, Date fechaVencimiento,
			String concepto, char estado, char estatus) {
		this.origen = origen;
		this.datoBasicoByCodigoTipoEgreso = datoBasicoByCodigoTipoEgreso;
		this.persona = persona;
		this.datoBasicoByCodigoTipoDocumento = datoBasicoByCodigoTipoDocumento;
		this.fechaEmision = fechaEmision;
		this.montoTotal = montoTotal;
		this.fechaVencimiento = fechaVencimiento;
		this.concepto = concepto;
		this.estado = estado;
		this.estatus = estatus;
	}

	public CuentaPagar(String origen, DatoBasico datoBasicoByCodigoTipoEgreso,
			Persona persona, DatoBasico datoBasicoByCodigoTipoDocumento,
			Date fechaEmision, double montoTotal, Date fechaVencimiento,
			String concepto, char estado, char estatus, Double subtotal,
			Set<EgresoCuentaPagar> egresoCuentaPagars,
			Set<NotaEntrega> notaEntregas,
			Set<CuentaPagarMaterial> cuentaPagarMaterials) {
		this.origen = origen;
		this.datoBasicoByCodigoTipoEgreso = datoBasicoByCodigoTipoEgreso;
		this.persona = persona;
		this.datoBasicoByCodigoTipoDocumento = datoBasicoByCodigoTipoDocumento;
		this.fechaEmision = fechaEmision;
		this.montoTotal = montoTotal;
		this.fechaVencimiento = fechaVencimiento;
		this.concepto = concepto;
		this.estado = estado;
		this.estatus = estatus;
		this.subtotal = subtotal;
		this.egresoCuentaPagars = egresoCuentaPagars;
		this.notaEntregas = notaEntregas;
		this.cuentaPagarMaterials = cuentaPagarMaterials;
	}

	@Id
	@Column(name = "origen", unique = true, nullable = false)
	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tipo_egreso", nullable = false)
	public DatoBasico getDatoBasicoByCodigoTipoEgreso() {
		return this.datoBasicoByCodigoTipoEgreso;
	}

	public void setDatoBasicoByCodigoTipoEgreso(
			DatoBasico datoBasicoByCodigoTipoEgreso) {
		this.datoBasicoByCodigoTipoEgreso = datoBasicoByCodigoTipoEgreso;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula_rif", nullable = false)
	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tipo_documento", nullable = false)
	public DatoBasico getDatoBasicoByCodigoTipoDocumento() {
		return this.datoBasicoByCodigoTipoDocumento;
	}

	public void setDatoBasicoByCodigoTipoDocumento(
			DatoBasico datoBasicoByCodigoTipoDocumento) {
		this.datoBasicoByCodigoTipoDocumento = datoBasicoByCodigoTipoDocumento;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_emision", nullable = false, length = 13)
	public Date getFechaEmision() {
		return this.fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	@Column(name = "monto_total", nullable = false, precision = 17, scale = 17)
	public double getMontoTotal() {
		return this.montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_vencimiento", nullable = false, length = 13)
	public Date getFechaVencimiento() {
		return this.fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	@Column(name = "concepto", nullable = false)
	public String getConcepto() {
		return this.concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	@Column(name = "estado", nullable = false, length = 1)
	public char getEstado() {
		return this.estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@Column(name = "subtotal", precision = 17, scale = 17)
	public Double getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cuentaPagar")
	public Set<EgresoCuentaPagar> getEgresoCuentaPagars() {
		return this.egresoCuentaPagars;
	}

	public void setEgresoCuentaPagars(Set<EgresoCuentaPagar> egresoCuentaPagars) {
		this.egresoCuentaPagars = egresoCuentaPagars;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cuentaPagar")
	public Set<NotaEntrega> getNotaEntregas() {
		return this.notaEntregas;
	}

	public void setNotaEntregas(Set<NotaEntrega> notaEntregas) {
		this.notaEntregas = notaEntregas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cuentaPagar")
	public Set<CuentaPagarMaterial> getCuentaPagarMaterials() {
		return this.cuentaPagarMaterials;
	}

	public void setCuentaPagarMaterials(
			Set<CuentaPagarMaterial> cuentaPagarMaterials) {
		this.cuentaPagarMaterials = cuentaPagarMaterials;
	}

}
