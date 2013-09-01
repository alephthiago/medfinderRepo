package br.com.fiap.cliente.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seqEndereco", sequenceName="SEQ_ENDERECO", allocationSize=1)
public class Endereco implements Serializable{

	
	private static final long serialVersionUID = -515464430350323628L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqEndereco")
	private int id;
	
	@Column(nullable=false)
	private String logradouro;
	
	@Column(nullable=false)
	private Integer cep;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Cidade cidade;
	
	public Endereco(String logradouro, Integer cep, Cidade cidade) {
		super();
		this.logradouro = logradouro;
		this.cep = cep;
		this.cidade = cidade;
	}
	
	public Endereco() {
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public int getId() {
		return id;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
}
