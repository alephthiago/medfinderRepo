package com.fiap.inventario.to;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PWAIPRODUTO")
public class ProdutoTO implements Serializable{

	private static final long serialVersionUID = 5241312292538514477L;
	
	@Id @GeneratedValue
	@Column(name="COD_PRODUTO")
	private int codProduto;

	@Column
	private String descricao;
	
	@Column(name="QT_ESTOQUE")
	private int quantidade;
	
	@Column
	private Double preco;

	@Column(name="CAMPANHA_PROMOCIONAL")
	private String campanhaPromocional;
	
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getCampanhaPromocional() {
		return campanhaPromocional;
	}
	public void setCampanhaPromocional(String campanhaPromocional) {
		this.campanhaPromocional = campanhaPromocional;
	}

}
