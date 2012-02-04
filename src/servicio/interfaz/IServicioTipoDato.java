package servicio.interfaz;

import java.util.List;
import modelo.TipoDato;

public interface IServicioTipoDato {
	
	public abstract void eliminar(TipoDato td);

	public abstract void agregar(TipoDato td);

	public abstract void actualizar(TipoDato td);

	public abstract List<TipoDato> listar();

	public abstract TipoDato buscarTipo(String td);
<<<<<<< HEAD

	public List<TipoDato> listarTipoDatos();
=======
	
	public abstract TipoDato buscarPorTipo(String td); 
	
	public abstract List<TipoDato> buscarTrue(Boolean bool);
>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
}
