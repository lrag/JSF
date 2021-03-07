package com.curso.modelo;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

@Entity
@ManagedBean(name = "disco")
@NamedQuery(name = "disco.listarTodos", query = "select d from Disco d")
public class Disco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_disco")
	private int idDisco;
	
	@NotNull
	@Min(value=2)
	@Max(value=50)
	private String titulo;
	@Past
	private Date fecha;

	@ManyToOne
	@JoinColumn(name="fk_id_grupo", referencedColumnName="id_grupo")
	private Grupo grupo = new Grupo();

	public Disco() {
		super();
	}

	public Disco(int idDisco, String titulo, Date fecha, Grupo grupo) {
		super();
		this.idDisco = idDisco;
		this.titulo = titulo;
		this.fecha = fecha;
		this.grupo = grupo;
	}

	public int getIdDisco() {
		return idDisco;
	}

	public void setIdDisco(int idDisco) {
		this.idDisco = idDisco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

}
