package com.curso.negocio;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.curso.modelo.Disco;

@Stateless
@LocalBean
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class GestorDiscos  {

    public GestorDiscos() {
    }

    @PersistenceContext(unitName="Ej12_Aplicacion_JPA")
    private EntityManager em;
    
    public void insertarDisco(Disco disco){
    	System.out.println("========================================");
    	System.out.println("INSERTANDO EL DISCO:"+disco);
    	em.persist(disco);
    }
    
	@SuppressWarnings("unchecked")
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)    
    public List<Disco> listarTodos(){
		System.out.println("==============================");
		System.out.println("HOLA");
    	return em.createNamedQuery("disco.listarTodos").getResultList();
    }

	@TransactionAttribute(TransactionAttributeType.SUPPORTS)    
	public Disco buscarDisco(int idDisco) {
		return em.find(Disco.class, idDisco);
	}

	public void modificarDisco(Disco disco) {
		
		System.out.println("==========================");
		System.out.println("MODIFICAR DISCO:"+disco);
		
		em.merge(disco);
		
	}

	public void borrarDisco(Disco disco) {
		disco = em.merge(disco);
		em.remove(disco);	
	}
}
