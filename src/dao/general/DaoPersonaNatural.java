package dao.general;

import java.util.List;

import modelo.PersonaNatural;
import dao.generico.GenericDao;

public class DaoPersonaNatural extends GenericDao {

	public PersonaNatural buscar(String cedula) {
		
		PersonaNatural d = new PersonaNatural();
		List<PersonaNatural> a = this.listar(PersonaNatural.class);
		for(int i = 0; i< a.size(); i++){
			if(a.get(i).getCedulaRif().equals(cedula)){
				d = a.get(i);
			}
		}
		
		return d;
	}

}
