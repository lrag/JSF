package com.curso.negocio;
import java.util.List;

import javax.ejb.Local;

import com.curso.modelo.Disco;

@Local
public interface GestorDiscosLocal {
	public void insertarDisco(Disco disco);

	public List<Disco> listarTodos();

	public Disco buscarDisco(int idDisco);

	public void modificarDisco(Disco disco);

	public void borrarDisco(Disco disco);
}
