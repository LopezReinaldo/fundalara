package dao.general;

import org.hibernate.Session;

import dao.generico.GenericDao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import modelo.RecepcionMaterial;


public class DaoRecepcionMaterial extends GenericDao {

	public List<RecepcionMaterial> listarmateriales() {
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		// TODO Auto-generated method stub
		List<RecepcionMaterial> l = getSession().createCriteria(
				RecepcionMaterial.class).list();
		getSession().flush();
		return l;
	}

}
