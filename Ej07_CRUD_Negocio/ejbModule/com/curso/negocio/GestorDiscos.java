package com.curso.negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.curso.modelo.Disco;

@Stateless
public class GestorDiscos implements GestorDiscosLocal {

    public GestorDiscos() {
    }

    @PersistenceContext(unitName="Ej07_CRUD_JPA")
    private EntityManager em;
    
    public void insertarDisco(Disco disco){
    	System.out.println("========================================");
    	System.out.println("INSERTANDO EL DISCO:"+disco);
    	em.persist(disco);
    }
    
    public List<Disco> listarTodos(){
    	return em.createNamedQuery("disco.listarTodos").getResultList();
    }

	public Disco buscarDisco(int idDisco) {
		return em.find(Disco.class, idDisco);
	}

	@Override
	public void modificarDisco(Disco disco) {
		em.merge(disco);
		
	}

	@Override
	public void borrarDisco(Disco disco) {
		disco = em.merge(disco);
		em.remove(disco);	
	}
}
