package servicio.interfaz;

import java.util.List;

import modelo.RecepcionMaterial;

public interface IServicioRecepcionMaterial {


 	public abstract void eliminar(RecepcionMaterial m);
	
	public abstract void agregar(RecepcionMaterial m);
		
	public abstract void actualizar(RecepcionMaterial m);
	
	public String generarCodigo();
	
	public List<RecepcionMaterial> listarMateriales();

	

}
