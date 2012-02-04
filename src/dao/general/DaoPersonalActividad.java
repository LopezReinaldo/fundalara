package dao.general;

import java.util.List;

import modelo.PersonalActividad;
import dao.generico.GenericDao;

public class DaoPersonalActividad extends GenericDao {

	public PersonalActividad buscar(String cedula) {
		
		PersonalActividad b = null;
		
		List<PersonalActividad> a = this.listar(PersonalActividad.class);
		for(int i = 0; i < a.size(); i++){
			if(a.get(i).getId().getCedulaRif().equals(cedula)){
				b = a.get(i);
			}
		}
		
		return b;
	}

}
