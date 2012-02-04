package dao.general;

import java.util.List;

<<<<<<< HEAD
import modelo.PersonaNatural;
=======
import modelo.DatoBasico;
import modelo.PersonaNatural;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
import dao.generico.GenericDao;

public class DaoPersonaNatural extends GenericDao {

<<<<<<< HEAD
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

=======
	public PersonaNatural buscarPersonaNatural(String d ) {
		System.out.println("llego");
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Criteria c = session.createCriteria(PersonaNatural.class);
		c.add(Restrictions.eq("cedulaRif", d));
		PersonaNatural objectPersona = (PersonaNatural) c.list().get(0);
		return objectPersona;
	}
>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
}
