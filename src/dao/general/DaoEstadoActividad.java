package dao.general;

import java.util.List;

import modelo.Actividad;
import modelo.EstadoActividad;
import dao.generico.GenericDao;

public class DaoEstadoActividad extends GenericDao {

	public EstadoActividad buscar(Actividad a) {
		
		EstadoActividad c = null;
		List<EstadoActividad> b = this.listar(EstadoActividad.class);
		for(int i = 0; i<b.size(); i++){
			if((b.get(i).getId().getCodigoActividad() == a.getCodigoActividad()) && (b.get(i).getEstatus() == 'A') ){
				c = b.get(i);
			}
		}
		return c;
	}

}