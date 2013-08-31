package com.medfinder.entity;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;



@Table(name="AM_CONSULTORIO")
public class Consultorio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1768343578722643153L;

	@Id
	private int id_consultorio;

	@JoinColumn(name = "ID_ENDERECO")
	@OneToOne(targetEntity = Endereco.class)
	private Endereco endereco;

	private String nome;
	
	@Transient
	private Telefone_Consultorio[] telefones;
	
	@Transient
	private Foto_Consultorio[] fotos;
	
	
	
	
	public Telefone_Consultorio[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone_Consultorio[] telefones) {
		this.telefones = telefones;
	}

	

	public int getId_consultorio() {
		return id_consultorio;
	}

	public void setId_consultorio(int id_consultorio) {
		this.id_consultorio = id_consultorio;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
