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
 * CondicionCompetencia generated by hbm2java
 */
@Entity
@Table(name = "condicion_competencia", schema = "public")
public class CondicionCompetencia implements java.io.Serializable {

	private int codigoCondicionCompetencia;
	private DatoBasico datoBasico;
	private ClasificacionCompetencia clasificacionCompetencia;

	public CondicionCompetencia() {
	}

	public CondicionCompetencia(int codigoCondicionCompetencia,
			DatoBasico datoBasico,
			ClasificacionCompetencia clasificacionCompetencia) {
		this.codigoCondicionCompetencia = codigoCondicionCompetencia;
		this.datoBasico = datoBasico;
		this.clasificacionCompetencia = clasificacionCompetencia;
	}

	@Id
	@Column(name = "codigo_condicion_competencia", unique = true, nullable = false)
	public int getCodigoCondicionCompetencia() {
		return this.codigoCondicionCompetencia;
	}

	public void setCodigoCondicionCompetencia(int codigoCondicionCompetencia) {
		this.codigoCondicionCompetencia = codigoCondicionCompetencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_condicion", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_clasificacion_competencia", nullable = false)
	public ClasificacionCompetencia getClasificacionCompetencia() {
		return this.clasificacionCompetencia;
	}

	public void setClasificacionCompetencia(
			ClasificacionCompetencia clasificacionCompetencia) {
		this.clasificacionCompetencia = clasificacionCompetencia;
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
 * CondicionCompetencia generated by hbm2java
 */
@Entity
@Table(name = "condicion_competencia", schema = "public")
public class CondicionCompetencia implements java.io.Serializable {

	private int codigoCondicionCompetencia;
	private DatoBasico datoBasico;
	private ClasificacionCompetencia clasificacionCompetencia;

	public CondicionCompetencia() {
	}

	public CondicionCompetencia(int codigoCondicionCompetencia,
			DatoBasico datoBasico,
			ClasificacionCompetencia clasificacionCompetencia) {
		this.codigoCondicionCompetencia = codigoCondicionCompetencia;
		this.datoBasico = datoBasico;
		this.clasificacionCompetencia = clasificacionCompetencia;
	}

	@Id
	@Column(name = "codigo_condicion_competencia", unique = true, nullable = false)
	public int getCodigoCondicionCompetencia() {
		return this.codigoCondicionCompetencia;
	}

	public void setCodigoCondicionCompetencia(int codigoCondicionCompetencia) {
		this.codigoCondicionCompetencia = codigoCondicionCompetencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_condicion", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_clasificacion_competencia", nullable = false)
	public ClasificacionCompetencia getClasificacionCompetencia() {
		return this.clasificacionCompetencia;
	}

	public void setClasificacionCompetencia(
			ClasificacionCompetencia clasificacionCompetencia) {
		this.clasificacionCompetencia = clasificacionCompetencia;
	}

}
>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
