package modelo;

// Generated 13/01/2012 03:34:55 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ProveedorBanco generated by hbm2java
 */
@Entity
@Table(name = "proveedor_banco", schema = "public")
public class ProveedorBanco implements java.io.Serializable {

	private String codigoCuentaBanco;
	private DatoBasico datoBasicoByCodigoTipoCuenta;
	private PersonaJuridica personaJuridica;
	private DatoBasico datoBasicoByCodigoBanco;
	private String titular;
	private char estatus;

	public ProveedorBanco() {
	}

	public ProveedorBanco(String codigoCuentaBanco,
			DatoBasico datoBasicoByCodigoTipoCuenta,
			PersonaJuridica personaJuridica,
			DatoBasico datoBasicoByCodigoBanco, char estatus) {
		this.codigoCuentaBanco = codigoCuentaBanco;
		this.datoBasicoByCodigoTipoCuenta = datoBasicoByCodigoTipoCuenta;
		this.personaJuridica = personaJuridica;
		this.datoBasicoByCodigoBanco = datoBasicoByCodigoBanco;
		this.estatus = estatus;
	}

	public ProveedorBanco(String codigoCuentaBanco,
			DatoBasico datoBasicoByCodigoTipoCuenta,
			PersonaJuridica personaJuridica,
			DatoBasico datoBasicoByCodigoBanco, String titular, char estatus) {
		this.codigoCuentaBanco = codigoCuentaBanco;
		this.datoBasicoByCodigoTipoCuenta = datoBasicoByCodigoTipoCuenta;
		this.personaJuridica = personaJuridica;
		this.datoBasicoByCodigoBanco = datoBasicoByCodigoBanco;
		this.titular = titular;
		this.estatus = estatus;
	}

	@Id
	@Column(name = "codigo_cuenta_banco", unique = true, nullable = false)
	public String getCodigoCuentaBanco() {
		return this.codigoCuentaBanco;
	}

	public void setCodigoCuentaBanco(String codigoCuentaBanco) {
		this.codigoCuentaBanco = codigoCuentaBanco;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tipo_cuenta", nullable = false)
	public DatoBasico getDatoBasicoByCodigoTipoCuenta() {
		return this.datoBasicoByCodigoTipoCuenta;
	}

	public void setDatoBasicoByCodigoTipoCuenta(
			DatoBasico datoBasicoByCodigoTipoCuenta) {
		this.datoBasicoByCodigoTipoCuenta = datoBasicoByCodigoTipoCuenta;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula_rif", nullable = false)
	public PersonaJuridica getPersonaJuridica() {
		return this.personaJuridica;
	}

	public void setPersonaJuridica(PersonaJuridica personaJuridica) {
		this.personaJuridica = personaJuridica;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_banco", nullable = false)
	public DatoBasico getDatoBasicoByCodigoBanco() {
		return this.datoBasicoByCodigoBanco;
	}

	public void setDatoBasicoByCodigoBanco(DatoBasico datoBasicoByCodigoBanco) {
		this.datoBasicoByCodigoBanco = datoBasicoByCodigoBanco;
	}

	@Column(name = "titular")
	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
