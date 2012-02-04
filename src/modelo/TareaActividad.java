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
 * TareaActividad generated by hbm2java
 */
@Entity
@Table(name = "tarea_actividad", schema = "public")
public class TareaActividad implements java.io.Serializable {

	private int codigoTareaActividad;
	private DatoBasico datoBasico;
	private Actividad actividad;
	private PersonalActividad personalActividad;
	private FamiliarComisionEquipo familiarComisionEquipo;
	private char estatus;
	private boolean tareaEjecutada;

	public TareaActividad() {
	}

	public TareaActividad(int codigoTareaActividad, DatoBasico datoBasico,
			Actividad actividad, char estatus, boolean tareaEjecutada) {
		this.codigoTareaActividad = codigoTareaActividad;
		this.datoBasico = datoBasico;
		this.actividad = actividad;
		this.estatus = estatus;
		this.tareaEjecutada = tareaEjecutada;
	}

	public TareaActividad(int codigoTareaActividad, DatoBasico datoBasico,
			Actividad actividad, PersonalActividad personalActividad,
			FamiliarComisionEquipo familiarComisionEquipo, char estatus,
			boolean tareaEjecutada) {
		this.codigoTareaActividad = codigoTareaActividad;
		this.datoBasico = datoBasico;
		this.actividad = actividad;
		this.personalActividad = personalActividad;
		this.familiarComisionEquipo = familiarComisionEquipo;
		this.estatus = estatus;
		this.tareaEjecutada = tareaEjecutada;
	}

	@Id
	@Column(name = "codigo_tarea_actividad", unique = true, nullable = false)
	public int getCodigoTareaActividad() {
		return this.codigoTareaActividad;
	}

	public void setCodigoTareaActividad(int codigoTareaActividad) {
		this.codigoTareaActividad = codigoTareaActividad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tarea", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_actividad", nullable = false)
	public Actividad getActividad() {
		return this.actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_personal_actividad")
	public PersonalActividad getPersonalActividad() {
		return this.personalActividad;
	}

	public void setPersonalActividad(PersonalActividad personalActividad) {
		this.personalActividad = personalActividad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_familiar_comision")
	public FamiliarComisionEquipo getFamiliarComisionEquipo() {
		return this.familiarComisionEquipo;
	}

	public void setFamiliarComisionEquipo(
			FamiliarComisionEquipo familiarComisionEquipo) {
		this.familiarComisionEquipo = familiarComisionEquipo;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@Column(name = "tarea_ejecutada", nullable = false)
	public boolean isTareaEjecutada() {
		return this.tareaEjecutada;
	}

	public void setTareaEjecutada(boolean tareaEjecutada) {
		this.tareaEjecutada = tareaEjecutada;
	}

}
