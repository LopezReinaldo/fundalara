package modelo;

// Generated 25/01/2012 12:32:42 AM by Hibernate Tools 3.4.0.CR1

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
 * NotaEntrega generated by hbm2java
 */
@Entity
@Table(name = "nota_entrega", schema = "public")
public class NotaEntrega implements java.io.Serializable {

	private int codigoNotaEntrega;
	private DocumentoAcreedor documentoAcreedor;
	private CuentaPagar cuentaPagar;
	private Date fechaRecepcion;
	private char estatus;
	private Set<RecepcionMaterial> recepcionMaterials = new HashSet<RecepcionMaterial>(
			0);

	public NotaEntrega() {
	}

	public NotaEntrega(int codigoNotaEntrega, Date fechaRecepcion, char estatus) {
		this.codigoNotaEntrega = codigoNotaEntrega;
		this.fechaRecepcion = fechaRecepcion;
		this.estatus = estatus;
	}

	public NotaEntrega(int codigoNotaEntrega,
			DocumentoAcreedor documentoAcreedor, CuentaPagar cuentaPagar,
			Date fechaRecepcion, char estatus,
			Set<RecepcionMaterial> recepcionMaterials) {
		this.codigoNotaEntrega = codigoNotaEntrega;
		this.documentoAcreedor = documentoAcreedor;
		this.cuentaPagar = cuentaPagar;
		this.fechaRecepcion = fechaRecepcion;
		this.estatus = estatus;
		this.recepcionMaterials = recepcionMaterials;
	}

	@Id
	@Column(name = "codigo_nota_entrega", unique = true, nullable = false)
	public int getCodigoNotaEntrega() {
		return this.codigoNotaEntrega;
	}

	public void setCodigoNotaEntrega(int codigoNotaEntrega) {
		this.codigoNotaEntrega = codigoNotaEntrega;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_documento_acreedor")
	public DocumentoAcreedor getDocumentoAcreedor() {
		return this.documentoAcreedor;
	}

	public void setDocumentoAcreedor(DocumentoAcreedor documentoAcreedor) {
		this.documentoAcreedor = documentoAcreedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "origen")
	public CuentaPagar getCuentaPagar() {
		return this.cuentaPagar;
	}

	public void setCuentaPagar(CuentaPagar cuentaPagar) {
		this.cuentaPagar = cuentaPagar;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_recepcion", nullable = false, length = 13)
	public Date getFechaRecepcion() {
		return this.fechaRecepcion;
	}

	public void setFechaRecepcion(Date fechaRecepcion) {
		this.fechaRecepcion = fechaRecepcion;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "notaEntrega")
	public Set<RecepcionMaterial> getRecepcionMaterials() {
		return this.recepcionMaterials;
	}

	public void setRecepcionMaterials(Set<RecepcionMaterial> recepcionMaterials) {
		this.recepcionMaterials = recepcionMaterials;
	}

}
