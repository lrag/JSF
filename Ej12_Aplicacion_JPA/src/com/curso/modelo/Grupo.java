package com.curso.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@NamedQuery(name = "grupo.listarTodos", query = "select g from Grupo g")
public class Grupo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_grupo")	
	private int idGrupo;
	
	@NotNull
	@Min(value=2)
	@Max(value=50)	
	private String nombre;
	@NotNull
	@Min(value=2)
	@Max(value=50)	
	private String pais;
	
	@OneToMany(mappedBy="grupo")
	private List<Disco> discos;

	public Grupo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Grupo(int idGrupo, String nombre, String pais) {
		super();
		this.idGrupo = idGrupo;
		this.nombre = nombre;
		this.pais = pais;
	}

	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setDiscos(List<Disco> discos) {
		this.discos = discos;
	}

	public List<Disco> getDiscos() {
		return discos;
	}

}
