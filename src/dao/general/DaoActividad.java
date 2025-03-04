package dao.general;

import java.util.List;

import modelo.Actividad;
import modelo.PlanificacionActividad;
import dao.generico.GenericDao;
import java.util.List;
import org.hibernate.Session;
import modelo.Actividad;
import modelo.PlanificacionActividad;

import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.python.antlr.PythonParser.return_stmt_return;

public class DaoActividad extends GenericDao {
	
	public Actividad buscarActividad(PlanificacionActividad a) {
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Criteria c = getSession().createCriteria(Actividad.class);
		List lista = c.add(Restrictions.eq("estatus", 'A'))
				.add(Restrictions.eq("planificacionActividad", a)).list();

		try {
			return (Actividad) lista.get(0);

		} catch (Exception e) {
			return null;
		}
	}
	
	public Actividad BuscarActividad(PlanificacionActividad a, Class<Actividad> class1){
		
		
		
		Actividad h = null;
		List<Actividad> c = super.listar(class1);
		
		for(int i=0; i < c.size(); i++){
			if(c.get(i).getPlanificacionActividad().getCodigoPlanificacionActividad() == a.getCodigoPlanificacionActividad()){
				
				h = c.get(i);
			}
		}
		return h;
		
		
		
	}

}
