package modelo;

// Generated 13/01/2012 02:49:46 AM by Hibernate Tools 3.4.0.CR1

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
 * DocumentoEntregado generated by hbm2java
 */
@Entity
@Table(name = "documento_entregado", schema = "public")
public class DocumentoEntregado implements java.io.Serializable {

	private int codigoDocumentoEntregado;
	private RecaudoPorProceso recaudoPorProceso;
	private byte[] documento;
	private Integer cantidad;
	private Date fecha;
	private char estatus;
	private Set<DocumentoAcademico> documentoAcademicos = new HashSet<DocumentoAcademico>(
			0);
	private Set<DocumentoPersonal> documentoPersonals = new HashSet<DocumentoPersonal>(
			0);
	private Set<DocumentoAscenso> documentoAscensos = new HashSet<DocumentoAscenso>(
			0);
	private Set<DocumentoConducta> documentoConductas = new HashSet<DocumentoConducta>(
			0);
	private Set<DocumentoMedico> documentoMedicos = new HashSet<DocumentoMedico>(
			0);

	public DocumentoEntregado() {
	}

	public DocumentoEntregado(int codigoDocumentoEntregado,
			RecaudoPorProceso recaudoPorProceso, Date fecha, char estatus) {
		this.codigoDocumentoEntregado = codigoDocumentoEntregado;
		this.recaudoPorProceso = recaudoPorProceso;
		this.fecha = fecha;
		this.estatus = estatus;
	}

	public DocumentoEntregado(int codigoDocumentoEntregado,
			RecaudoPorProceso recaudoPorProceso, byte[] documento,
			Integer cantidad, Date fecha, char estatus,
			Set<DocumentoAcademico> documentoAcademicos,
			Set<DocumentoPersonal> documentoPersonals,
			Set<DocumentoAscenso> documentoAscensos,
			Set<DocumentoConducta> documentoConductas,
			Set<DocumentoMedico> documentoMedicos) {
		this.codigoDocumentoEntregado = codigoDocumentoEntregado;
		this.recaudoPorProceso = recaudoPorProceso;
		this.documento = documento;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.estatus = estatus;
		this.documentoAcademicos = documentoAcademicos;
		this.documentoPersonals = documentoPersonals;
		this.documentoAscensos = documentoAscensos;
		this.documentoConductas = documentoConductas;
		this.documentoMedicos = documentoMedicos;
	}

	@Id
	@Column(name = "codigo_documento_entregado", unique = true, nullable = false)
	public int getCodigoDocumentoEntregado() {
		return this.codigoDocumentoEntregado;
	}

	public void setCodigoDocumentoEntregado(int codigoDocumentoEntregado) {
		this.codigoDocumentoEntregado = codigoDocumentoEntregado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_recaudo_por_proceso", nullable = false)
	public RecaudoPorProceso getRecaudoPorProceso() {
		return this.recaudoPorProceso;
	}

	public void setRecaudoPorProceso(RecaudoPorProceso recaudoPorProceso) {
		this.recaudoPorProceso = recaudoPorProceso;
	}

	@Column(name = "documento")
	public byte[] getDocumento() {
		return this.documento;
	}

	public void setDocumento(byte[] documento) {
		this.documento = documento;
	}

	@Column(name = "cantidad")
	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha", nullable = false, length = 13)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "documentoEntregado")
	public Set<DocumentoAcademico> getDocumentoAcademicos() {
		return this.documentoAcademicos;
	}

	public void setDocumentoAcademicos(
			Set<DocumentoAcademico> documentoAcademicos) {
		this.documentoAcademicos = documentoAcademicos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "documentoEntregado")
	public Set<DocumentoPersonal> getDocumentoPersonals() {
		return this.documentoPersonals;
	}

	public void setDocumentoPersonals(Set<DocumentoPersonal> documentoPersonals) {
		this.documentoPersonals = documentoPersonals;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "documentoEntregado")
	public Set<DocumentoAscenso> getDocumentoAscensos() {
		return this.documentoAscensos;
	}

	public void setDocumentoAscensos(Set<DocumentoAscenso> documentoAscensos) {
		this.documentoAscensos = documentoAscensos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "documentoEntregado")
	public Set<DocumentoConducta> getDocumentoConductas() {
		return this.documentoConductas;
	}

	public void setDocumentoConductas(Set<DocumentoConducta> documentoConductas) {
		this.documentoConductas = documentoConductas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "documentoEntregado")
	public Set<DocumentoMedico> getDocumentoMedicos() {
		return this.documentoMedicos;
	}

	public void setDocumentoMedicos(Set<DocumentoMedico> documentoMedicos) {
		this.documentoMedicos = documentoMedicos;
	}

}
