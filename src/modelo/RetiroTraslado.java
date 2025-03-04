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

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
// Generated 24/01/2012 04:28:30 AM by Hibernate Tools 3.4.0.CR1


>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
<<<<<<< HEAD

/**
 * RetiroTraslado generated by hbm2java
 */
@Entity
@Table(name = "retiro_traslado", schema = "public")
public class RetiroTraslado implements java.io.Serializable {

	private int codigoRetiroTraslado;
	private DatoBasico datoBasicoByCodigoTipoOperacion;
	private DatoBasico datoBasicoByCodigoMotivoRetiro;
	private Jugador jugador;
	private Date fechaRetiro;
	private char estatus;

	public RetiroTraslado() {
	}

	public RetiroTraslado(int codigoRetiroTraslado,
			DatoBasico datoBasicoByCodigoTipoOperacion,
			DatoBasico datoBasicoByCodigoMotivoRetiro, Jugador jugador,
			Date fechaRetiro, char estatus) {
		this.codigoRetiroTraslado = codigoRetiroTraslado;
		this.datoBasicoByCodigoTipoOperacion = datoBasicoByCodigoTipoOperacion;
		this.datoBasicoByCodigoMotivoRetiro = datoBasicoByCodigoMotivoRetiro;
		this.jugador = jugador;
		this.fechaRetiro = fechaRetiro;
		this.estatus = estatus;
	}

	@Id
	@Column(name = "codigo_retiro_traslado", unique = true, nullable = false)
	public int getCodigoRetiroTraslado() {
		return this.codigoRetiroTraslado;
	}

	public void setCodigoRetiroTraslado(int codigoRetiroTraslado) {
		this.codigoRetiroTraslado = codigoRetiroTraslado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tipo_operacion", nullable = false)
	public DatoBasico getDatoBasicoByCodigoTipoOperacion() {
		return this.datoBasicoByCodigoTipoOperacion;
	}

	public void setDatoBasicoByCodigoTipoOperacion(
			DatoBasico datoBasicoByCodigoTipoOperacion) {
		this.datoBasicoByCodigoTipoOperacion = datoBasicoByCodigoTipoOperacion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_motivo_retiro", nullable = false)
	public DatoBasico getDatoBasicoByCodigoMotivoRetiro() {
		return this.datoBasicoByCodigoMotivoRetiro;
	}

	public void setDatoBasicoByCodigoMotivoRetiro(
			DatoBasico datoBasicoByCodigoMotivoRetiro) {
		this.datoBasicoByCodigoMotivoRetiro = datoBasicoByCodigoMotivoRetiro;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula_rif", nullable = false)
	public Jugador getJugador() {
		return this.jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_retiro", nullable = false, length = 13)
	public Date getFechaRetiro() {
		return this.fechaRetiro;
	}

	public void setFechaRetiro(Date fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
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
 * RetiroTraslado generated by hbm2java
 */
@Entity
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 9d67536bdd2e3b33aa6400eb3bb09741a4535bb0
>>>>>>> 873ccb018e72b00b831aa9284cc0745bd1c2d514
@Table(name = "retiro_traslado", schema = "public")
public class RetiroTraslado implements java.io.Serializable {

	private int codigoRetiroTraslado;
	private DatoBasico datoBasicoByCodigoTipoOperacion;
	private DatoBasico datoBasicoByCodigoMotivoRetiro;
	private Jugador jugador;
	private Date fechaRetiro;
	private char estatus;

	public RetiroTraslado() {
	}

	public RetiroTraslado(int codigoRetiroTraslado,
			DatoBasico datoBasicoByCodigoTipoOperacion,
			DatoBasico datoBasicoByCodigoMotivoRetiro, Jugador jugador,
			Date fechaRetiro, char estatus) {
		this.codigoRetiroTraslado = codigoRetiroTraslado;
		this.datoBasicoByCodigoTipoOperacion = datoBasicoByCodigoTipoOperacion;
		this.datoBasicoByCodigoMotivoRetiro = datoBasicoByCodigoMotivoRetiro;
		this.jugador = jugador;
		this.fechaRetiro = fechaRetiro;
		this.estatus = estatus;
	}

	@Id
	@Column(name = "codigo_retiro_traslado", unique = true, nullable = false)
	public int getCodigoRetiroTraslado() {
		return this.codigoRetiroTraslado;
	}

	public void setCodigoRetiroTraslado(int codigoRetiroTraslado) {
		this.codigoRetiroTraslado = codigoRetiroTraslado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tipo_operacion", nullable = false)
	public DatoBasico getDatoBasicoByCodigoTipoOperacion() {
		return this.datoBasicoByCodigoTipoOperacion;
	}

	public void setDatoBasicoByCodigoTipoOperacion(
			DatoBasico datoBasicoByCodigoTipoOperacion) {
		this.datoBasicoByCodigoTipoOperacion = datoBasicoByCodigoTipoOperacion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_motivo_retiro", nullable = false)
	public DatoBasico getDatoBasicoByCodigoMotivoRetiro() {
		return this.datoBasicoByCodigoMotivoRetiro;
	}

	public void setDatoBasicoByCodigoMotivoRetiro(
			DatoBasico datoBasicoByCodigoMotivoRetiro) {
		this.datoBasicoByCodigoMotivoRetiro = datoBasicoByCodigoMotivoRetiro;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula_rif", nullable = false)
	public Jugador getJugador() {
		return this.jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_retiro", nullable = false, length = 13)
	public Date getFechaRetiro() {
		return this.fechaRetiro;
	}

	public void setFechaRetiro(Date fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
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
@Table(name="retiro_traslado"
    ,schema="public"
)
public class RetiroTraslado  implements java.io.Serializable {


     private int codigoRetiroTraslado;
     private DatoBasico datoBasicoByCodigoTipoOperacion;
     private DatoBasico datoBasicoByCodigoMotivoRetiro;
     private Jugador jugador;
     private Date fechaRetiro;
     private char estatus;

    public RetiroTraslado() {
    }

    public RetiroTraslado(int codigoRetiroTraslado, DatoBasico datoBasicoByCodigoTipoOperacion, DatoBasico datoBasicoByCodigoMotivoRetiro, Jugador jugador, Date fechaRetiro, char estatus) {
       this.codigoRetiroTraslado = codigoRetiroTraslado;
       this.datoBasicoByCodigoTipoOperacion = datoBasicoByCodigoTipoOperacion;
       this.datoBasicoByCodigoMotivoRetiro = datoBasicoByCodigoMotivoRetiro;
       this.jugador = jugador;
       this.fechaRetiro = fechaRetiro;
       this.estatus = estatus;
    }
   
     @Id 

    
    @Column(name="codigo_retiro_traslado", unique=true, nullable=false)
    public int getCodigoRetiroTraslado() {
        return this.codigoRetiroTraslado;
    }
    
    public void setCodigoRetiroTraslado(int codigoRetiroTraslado) {
        this.codigoRetiroTraslado = codigoRetiroTraslado;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="codigo_tipo_operacion", nullable=false)
    public DatoBasico getDatoBasicoByCodigoTipoOperacion() {
        return this.datoBasicoByCodigoTipoOperacion;
    }
    
    public void setDatoBasicoByCodigoTipoOperacion(DatoBasico datoBasicoByCodigoTipoOperacion) {
        this.datoBasicoByCodigoTipoOperacion = datoBasicoByCodigoTipoOperacion;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="codigo_motivo_retiro", nullable=false)
    public DatoBasico getDatoBasicoByCodigoMotivoRetiro() {
        return this.datoBasicoByCodigoMotivoRetiro;
    }
    
    public void setDatoBasicoByCodigoMotivoRetiro(DatoBasico datoBasicoByCodigoMotivoRetiro) {
        this.datoBasicoByCodigoMotivoRetiro = datoBasicoByCodigoMotivoRetiro;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cedula_rif", nullable=false)
    public Jugador getJugador() {
        return this.jugador;
    }
    
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fecha_retiro", nullable=false, length=13)
    public Date getFechaRetiro() {
        return this.fechaRetiro;
    }
    
    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
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
