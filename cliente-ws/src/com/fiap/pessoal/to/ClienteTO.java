package com.fiap.pessoal.to;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PWAICLIENTE")
public class ClienteTO implements Serializable {
	
	@Id @GeneratedValue
	@Column(name="COD_CLIENTE")
	private int codCliente;
	
	@Column(name="NM_CLIENTE")
	private String nmCliente;
	
	@Column
	private String endereco;
	
	@Column
	private String telefone;
	
	@Column
	private String cep;
	
	@Column
	private String cidade;
	
	@Column
	private String uf;
	
	@Column
	private String latitude;
	
	@Column
	private String longitude;
	
	@Column(name="CLIENTE_ESPECIAL")
	private String clienteEspecial;
	
	@Column
	private String foto;

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public String getNmCliente() {
		return nmCliente;
	}

	public void setNmCliente(String nmCliente) {
		this.nmCliente = nmCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getClienteEspecial() {
		return clienteEspecial;
	}

	public void setClienteEspecial(String clienteEspecial) {
		this.clienteEspecial = clienteEspecial;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
}
