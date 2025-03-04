package dao.general;

import dao.generico.GenericDao;

import java.util.List;

import modelo.MaterialActividadPlanificada;
import modelo.PlanificacionActividad;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class DaoMaterialActividadPlanificada extends GenericDao {

	public List<MaterialActividadPlanificada> listarMateriales(
			PlanificacionActividad planActividad) {
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Criteria c = session.createCriteria(MaterialActividadPlanificada.class);
		c.add(Restrictions.eq(
				"planificacionActividad.codigoPlanificacionActividad",
				planActividad.getCodigoPlanificacionActividad()));
		c.add(Restrictions.eq("estatus", "A"));
		List<MaterialActividadPlanificada> lista = c.list();
		return lista;
	}

	public MaterialActividadPlanificada buscarPorCantidad(
			MaterialActividadPlanificada d) {
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Criteria c = getSession().createCriteria(
				MaterialActividadPlanificada.class);

		List<MaterialActividadPlanificada> dato = c
				.add(Restrictions.eq("planificacionActividad",
						d.getPlanificacionActividad()))
				.add(Restrictions.eq("material", d.getMaterial())).list();
		return dato.get(0);
	}

}
