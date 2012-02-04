package dao.general;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import modelo.DatoBasico;
import modelo.Instalacion;
import dao.generico.GenericDao;

public class DaoInstalacion extends GenericDao {
	
	// METODO PARA BUSCAR (Solo para busqueda de Campos Claves)
	public Object buscar(Class clase, String id) {
		// CREAMOS UN OBJETO
		Object obj = new Object();
		obj = getSession().get(clase, id);
		getSession().flush();
		return obj;
	}
	
	public int contarCodigos(String tabla) {
	int cantidad = 0;
	cantidad = ((Long) getSession().createQuery(
			"SELECT COUNT(*) FROM " + tabla).uniqueResult()).intValue();
	return cantidad;
}
	public List<Instalacion> listarInstalacionPorTipo(DatoBasico tipo){
		Session session = getSession(); 
		if(!session.isOpen())
			session = session.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Criteria c = session.createCriteria(Instalacion.class);
		c.add(Restrictions.eq("estatus", "A"));
		c.add(Restrictions.eq("datoBasico.codigoDatoBasico",tipo.getCodigoDatoBasico()));
		List<Instalacion> lista = c.list();
		return lista;
	}
}
