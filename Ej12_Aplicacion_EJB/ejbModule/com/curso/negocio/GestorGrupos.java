package com.curso.negocio;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.curso.modelo.Grupo;

@Stateless
@LocalBean
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class GestorGrupos {

	@PersistenceContext(unitName="Ej12_Aplicacion_JPA")
	private EntityManager em;
	
    public GestorGrupos() {
    }
    
    public void insertarGrupo(Grupo grupo){
    	em.persist(grupo);
    }

	public void modificarGrupo(Grupo grupo) {
		em.merge(grupo);
		
	}

	public void borrarGrupo(Grupo grupo) {
		grupo = em.merge(grupo);
		em.remove(grupo);	
	}    
    
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	public Grupo buscarGrupo(int idGrupo) {
		return em.find(Grupo.class, idGrupo);
	}

	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@SuppressWarnings("unchecked")
	public List<Grupo> listarTodos(){
		return em.createNamedQuery("grupo.listarTodos").getResultList();
	}

}
