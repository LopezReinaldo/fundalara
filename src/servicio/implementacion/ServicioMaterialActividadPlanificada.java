package servicio.implementacion;

import java.util.ArrayList;
import java.util.List;

import dao.general.DaoMaterialActividadPlanificada;
import modelo.ActividadPlanificada;
import modelo.MaterialActividad;
import modelo.MaterialActividadPlanificada;
import modelo.PlanificacionActividad;
import servicio.interfaz.IServicioMaterialActividadPlanificada;

public class ServicioMaterialActividadPlanificada implements
		IServicioMaterialActividadPlanificada {

	DaoMaterialActividadPlanificada daoMaterialActividadPlanificada;

	@Override
	public void eliminar(MaterialActividadPlanificada map) {
		// TODO Auto-generated method stub
		daoMaterialActividadPlanificada.eliminar(map);
	}

	@Override
	public void agregar(MaterialActividadPlanificada map) {
		// TODO Auto-generated method stub
		daoMaterialActividadPlanificada.guardar(map);
	}

	@Override
	public void actualizar(MaterialActividadPlanificada map) {
		// TODO Auto-generated method stub
		daoMaterialActividadPlanificada.actualizar(map);
	}

	public DaoMaterialActividadPlanificada getDaoMaterialActividadPlanificada() {
		return daoMaterialActividadPlanificada;
	}

	public void setDaoMaterialActividadPlanificada(
			DaoMaterialActividadPlanificada daoMaterialActividadPlanificada) {
		this.daoMaterialActividadPlanificada = daoMaterialActividadPlanificada;
	}

	public List<MaterialActividadPlanificada> listar() {
		return daoMaterialActividadPlanificada
				.listarActivos(MaterialActividadPlanificada.class);
	}

	public MaterialActividadPlanificada buscarParaCantidadNecesaria(
			MaterialActividadPlanificada m) {
		return daoMaterialActividadPlanificada.buscarPorCantidad(m);
	}

	// ----------------------------------------------------------------------------------------------------------------------
	public List<MaterialActividadPlanificada> listarPorPrestar(
			PlanificacionActividad a) {
		return daoMaterialActividadPlanificada.listarMateriales(a);
	}

	public List<MaterialActividadPlanificada> listarPorPrestarCompetencia(
			PlanificacionActividad a) {
		List<MaterialActividadPlanificada> lista = daoMaterialActividadPlanificada
				.listarMateriales(a);
		List<MaterialActividadPlanificada> lista2 = new ArrayList<MaterialActividadPlanificada>();

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getPlanificacionActividad().getDatoBasico()
					.getCodigoDatoBasico() == 503) {
				lista2.add(lista.get(i));
			}
		}
		return lista2;
	}

	public List<MaterialActividadPlanificada> listarPorPrestarEntrenamiento(
			PlanificacionActividad a) {
		List<MaterialActividadPlanificada> lista = daoMaterialActividadPlanificada
				.listarMateriales(a);
		List<MaterialActividadPlanificada> lista2 = new ArrayList<MaterialActividadPlanificada>();

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getPlanificacionActividad().getDatoBasico()
					.getCodigoDatoBasico() == 502) {
				lista2.add(lista.get(i));
			}
		}
		return lista2;
	}

	public List<MaterialActividadPlanificada> listarPorPrestarEvento(
			PlanificacionActividad a) {
		List<MaterialActividadPlanificada> lista = daoMaterialActividadPlanificada
				.listarMateriales(a);
		List<MaterialActividadPlanificada> lista2 = new ArrayList<MaterialActividadPlanificada>();

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getPlanificacionActividad().getDatoBasico()
					.getCodigoDatoBasico() == 501) {
				lista2.add(lista.get(i));
			}
		}
		return lista2;

	}

	public List<MaterialActividadPlanificada> listarPorPrestarMantenimiento(
			PlanificacionActividad a) {
		List<MaterialActividadPlanificada> lista = daoMaterialActividadPlanificada
				.listarMateriales(a);
		List<MaterialActividadPlanificada> lista2 = new ArrayList<MaterialActividadPlanificada>();

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getPlanificacionActividad().getDatoBasico()
					.getCodigoDatoBasico() == 500) {
				lista2.add(lista.get(i));
			}
		}
		return lista2;
	}

	@Override
	public List<MaterialActividadPlanificada> listarMateriales(
			PlanificacionActividad planActividad) {
		// TODO Auto-generated method stub
		return daoMaterialActividadPlanificada.listarMateriales(planActividad);
	}

}
