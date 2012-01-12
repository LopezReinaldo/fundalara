package modelo;

// Generated 11/01/2012 03:50:04 PM by Hibernate Tools 3.4.0.CR1

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
 * TestEvaluativo generated by hbm2java
 */
@Entity
@Table(name = "test_evaluativo", schema = "public")
public class TestEvaluativo implements java.io.Serializable {

	private int codigoTest;
	private Equipo equipo;
	private Date fecha;
	private Set<IndicadorTest> indicadorTests = new HashSet<IndicadorTest>(0);

	public TestEvaluativo() {
	}

	public TestEvaluativo(int codigoTest, Equipo equipo, Date fecha) {
		this.codigoTest = codigoTest;
		this.equipo = equipo;
		this.fecha = fecha;
	}

	public TestEvaluativo(int codigoTest, Equipo equipo, Date fecha,
			Set<IndicadorTest> indicadorTests) {
		this.codigoTest = codigoTest;
		this.equipo = equipo;
		this.fecha = fecha;
		this.indicadorTests = indicadorTests;
	}

	@Id
	@Column(name = "codigo_test", unique = true, nullable = false)
	public int getCodigoTest() {
		return this.codigoTest;
	}

	public void setCodigoTest(int codigoTest) {
		this.codigoTest = codigoTest;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_equipo", nullable = false)
	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha", nullable = false, length = 13)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "testEvaluativo")
	public Set<IndicadorTest> getIndicadorTests() {
		return this.indicadorTests;
	}

	public void setIndicadorTests(Set<IndicadorTest> indicadorTests) {
		this.indicadorTests = indicadorTests;
	}

}
