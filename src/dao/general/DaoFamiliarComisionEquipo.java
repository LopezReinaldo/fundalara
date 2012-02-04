package dao.general;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import modelo.ComisionActividadPlanificada;
import modelo.DatoBasico;
import modelo.FamiliarComisionEquipo;
import dao.generico.GenericDao;

public class DaoFamiliarComisionEquipo extends GenericDao {

	public List<FamiliarComisionEquipo> listarPorComision(DatoBasico tipoComision) {
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Criteria c = getSession().createCriteria(FamiliarComisionEquipo.class);
		c.add(Restrictions.eq("comisionEquipo.codigoDatoBasico", tipoComision.getCodigoDatoBasico()));
		return  c.list();
	}

public List<FamiliarComisionEquipo> ListarPorComision(
			ComisionActividadPlanificada comisionActividadPlanificada) {
	
		List<FamiliarComisionEquipo> a = this.listar(FamiliarComisionEquipo.class);
		List<FamiliarComisionEquipo> b = new ArrayList<FamiliarComisionEquipo>();
		
		for(int i = 0; i < a.size(); i++){
			if(a.get(i).getComisionEquipo().getCodigoComisionEquipo() == comisionActividadPlanificada.getPlanificacionActividad().getCodigoPlanificacionActividad()){
				b.add(a.get(i));
			}
		}		
		return b;
	}

}
