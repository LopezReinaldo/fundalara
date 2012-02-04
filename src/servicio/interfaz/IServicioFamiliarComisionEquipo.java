package servicio.interfaz;

import java.util.List;

import modelo.ComisionActividadPlanificada;
import modelo.DatoBasico;
import modelo.FamiliarComisionEquipo;

public interface IServicioFamiliarComisionEquipo {
	public abstract void eliminar(FamiliarComisionEquipo c);
	
	public abstract void agregar(FamiliarComisionEquipo c);
		
	public abstract void actualizar(FamiliarComisionEquipo c);	
	
	public abstract List<FamiliarComisionEquipo> listar();
	public abstract List<FamiliarComisionEquipo> listarPorComision(DatoBasico tipoComision);

	public abstract List<FamiliarComisionEquipo> ListarPorComision(
			ComisionActividadPlanificada comisionActividadPlanificada);
}
