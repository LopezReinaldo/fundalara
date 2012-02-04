<<<<<<< HEAD
package modelo;

// Generated 25/01/2012 10:43:43 AM by Hibernate Tools 3.4.0.CR1

=======
package modelo;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514

// Generated 25/01/2012 12:32:42 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
// Generated 24/01/2012 04:28:30 AM by Hibernate Tools 3.4.0.CR1


>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
<<<<<<< HEAD

/**
 * DocumentoAscenso generated by hbm2java
 */
@Entity
@Table(name = "documento_ascenso", schema = "public")
public class DocumentoAscenso implements java.io.Serializable {

	private DocumentoAscensoId id;
	private DocumentoEntregado documentoEntregado;
	private Ascenso ascenso;
	private char estatus;

	public DocumentoAscenso() {
	}

	public DocumentoAscenso(DocumentoAscensoId id,
			DocumentoEntregado documentoEntregado, Ascenso ascenso, char estatus) {
		this.id = id;
		this.documentoEntregado = documentoEntregado;
		this.ascenso = ascenso;
		this.estatus = estatus;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoDocumentoEntregado", column = @Column(name = "codigo_documento_entregado", nullable = false)),
			@AttributeOverride(name = "codigoAscenso", column = @Column(name = "codigo_ascenso", nullable = false)) })
	public DocumentoAscensoId getId() {
		return this.id;
	}

	public void setId(DocumentoAscensoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_documento_entregado", nullable = false, insertable = false, updatable = false)
	public DocumentoEntregado getDocumentoEntregado() {
		return this.documentoEntregado;
	}

	public void setDocumentoEntregado(DocumentoEntregado documentoEntregado) {
		this.documentoEntregado = documentoEntregado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_ascenso", nullable = false, insertable = false, updatable = false)
	public Ascenso getAscenso() {
		return this.ascenso;
	}

	public void setAscenso(Ascenso ascenso) {
		this.ascenso = ascenso;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
=======
>>>>>>> 7d4823278d0a354855f5032a99e2b48c65b33e7f
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514

/**
 * DocumentoAscenso generated by hbm2java
 */
@Entity
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514
@Table(name = "documento_ascenso", schema = "public")
public class DocumentoAscenso implements java.io.Serializable {

	private DocumentoAscensoId id;
	private DocumentoEntregado documentoEntregado;
	private Ascenso ascenso;
	private char estatus;

	public DocumentoAscenso() {
	}

	public DocumentoAscenso(DocumentoAscensoId id,
			DocumentoEntregado documentoEntregado, Ascenso ascenso, char estatus) {
		this.id = id;
		this.documentoEntregado = documentoEntregado;
		this.ascenso = ascenso;
		this.estatus = estatus;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoDocumentoEntregado", column = @Column(name = "codigo_documento_entregado", nullable = false)),
			@AttributeOverride(name = "codigoAscenso", column = @Column(name = "codigo_ascenso", nullable = false)) })
	public DocumentoAscensoId getId() {
		return this.id;
	}

	public void setId(DocumentoAscensoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_documento_entregado", nullable = false, insertable = false, updatable = false)
	public DocumentoEntregado getDocumentoEntregado() {
		return this.documentoEntregado;
	}

	public void setDocumentoEntregado(DocumentoEntregado documentoEntregado) {
		this.documentoEntregado = documentoEntregado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_ascenso", nullable = false, insertable = false, updatable = false)
	public Ascenso getAscenso() {
		return this.ascenso;
	}

	public void setAscenso(Ascenso ascenso) {
		this.ascenso = ascenso;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
@Table(name="documento_ascenso"
    ,schema="public"
)
public class DocumentoAscenso  implements java.io.Serializable {


     private DocumentoAscensoId id;
     private DocumentoEntregado documentoEntregado;
     private Ascenso ascenso;
     private char estatus;

    public DocumentoAscenso() {
    }

    public DocumentoAscenso(DocumentoAscensoId id, DocumentoEntregado documentoEntregado, Ascenso ascenso, char estatus) {
       this.id = id;
       this.documentoEntregado = documentoEntregado;
       this.ascenso = ascenso;
       this.estatus = estatus;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="codigoDocumentoEntregado", column=@Column(name="codigo_documento_entregado", nullable=false) ), 
        @AttributeOverride(name="codigoAscenso", column=@Column(name="codigo_ascenso", nullable=false) ) } )
    public DocumentoAscensoId getId() {
        return this.id;
    }
    
    public void setId(DocumentoAscensoId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="codigo_documento_entregado", nullable=false, insertable=false, updatable=false)
    public DocumentoEntregado getDocumentoEntregado() {
        return this.documentoEntregado;
    }
    
    public void setDocumentoEntregado(DocumentoEntregado documentoEntregado) {
        this.documentoEntregado = documentoEntregado;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="codigo_ascenso", nullable=false, insertable=false, updatable=false)
    public Ascenso getAscenso() {
        return this.ascenso;
    }
    
    public void setAscenso(Ascenso ascenso) {
        this.ascenso = ascenso;
    }

    
    @Column(name="estatus", nullable=false, length=1)
    public char getEstatus() {
        return this.estatus;
    }
    
    public void setEstatus(char estatus) {
        this.estatus = estatus;
    }




}


>>>>>>> 7d4823278d0a354855f5032a99e2b48c65b33e7f
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514
>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
