package com.curso.modelo;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@ManagedBean(name = "disco")
@NamedQuery(name="disco.listarTodos", query="select d from Disco d")
public class Disco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_disco")
	private int idDisco;
	private String titulo;
	private Date fecha;
	private String grupo;

	public Disco() {
		super();
	}

	public Disco(int idDisco, String titulo, Date fecha, String grupo) {
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

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Disco [idDisco=" + idDisco + ", titulo=" + titulo + ", fecha="
				+ fecha + ", grupo=" + grupo + "]";
	}

}
