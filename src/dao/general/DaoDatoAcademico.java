package dao.general;

import org.hibernate.Query;
import org.hibernate.Session;

import dao.generico.GenericDao;

/**
 * Clase de acceso y manejo de los datos relacionados a los datos medicos del
 * jugador
 * 
 * @author Robert A
 * @author German L
 * @version 0.1 02/01/2012
 * 
 */
public class DaoDatoAcademico extends GenericDao {
	public static String SECUENCIA ="dato_academico_codigo_academico_seq_1";

	/**
	 * Busca el ultimo valor de la clave primaria de la tabla DatoAcademico
	 * 
	 * @return int ultimo id
	 */
	public int obtenerUltimoId() {

		Session session = getSession();
		org.hibernate.Transaction tx = session.beginTransaction();
		Query query = session
				.createSQLQuery("SELECT last_value FROM "+SECUENCIA);
		int id = Integer.valueOf(query.uniqueResult().toString());
		tx.commit();

		return id;
	}
	

}
