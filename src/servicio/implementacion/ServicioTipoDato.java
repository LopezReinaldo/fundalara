package servicio.implementacion;

import java.util.List;

import servicio.interfaz.IServicioTipoDato;

import dao.general.DaoTipoDato;

import modelo.TipoDato;

public class ServicioTipoDato implements IServicioTipoDato {

	DaoTipoDato daoTipoDato;

	@Override
	public void eliminar(TipoDato td) {
		// TODO Auto-generated method stub
		daoTipoDato.eliminar(td);
	}

	@Override
	public void agregar(TipoDato td) {
		// TODO Auto-generated method stub
		daoTipoDato.guardar(td);
	}

	@Override
	public void actualizar(TipoDato td) {
		// TODO Auto-generated method stub
		daoTipoDato.actualizar(td);
	}

	@Override
	public List<TipoDato> listar() {
		// TODO Auto-generated method stub
		return daoTipoDato.listar(TipoDato.class);
	}

	public DaoTipoDato getDaoTipoDato() {
		return daoTipoDato;
	}

	public void setDaoTipoDato(DaoTipoDato daoTipoDato) {
		this.daoTipoDato = daoTipoDato;
	}

	@Override
	public TipoDato buscarTipo(String td) {
		// TODO Auto-generated method stub
		return daoTipoDato.buscarPorTipo(td);
	}
<<<<<<< HEAD

	public List<TipoDato> buscarTrue(Boolean bool) {
		return daoTipoDato.buscarTrue(bool);
	}

	public List<TipoDato> listarTipoDatos() {

		return daoTipoDato.listarTipoDatos();
=======
	
	@Override
	public List<TipoDato> buscarTrue(Boolean bool) {
		return daoTipoDato.buscarTrue(bool);
	}
	
	@Override
	public TipoDato buscarPorTipo(String td) {
		// TODO Auto-generated method stub
		return daoTipoDato.buscarPorTipo(td);
>>>>>>> 8f481b99d9d0e3c8f37c34b5688d08ccc5f6c118
	}

}
