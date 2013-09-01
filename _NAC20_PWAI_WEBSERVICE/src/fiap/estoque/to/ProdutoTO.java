package fiap.estoque.to;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;

import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="NAC_PRODUTO")
public class ProdutoTO implements Serializable {
	
	private static final long serialVersionUID = 3175874514509009931L;
	
	@GenericGenerator(name="seq_produto", strategy="increment")
	@GeneratedValue(generator="seq_produto")
	@Id 
	private int cd_produto;
	
	private String descricao;
	
	private int quantidade;
	
	private double preco;
	
	private String campanha_promocional;
	
	
	

	public int getCd_produto() {
		return cd_produto;
	}

	public void setCd_produto(int cd_produto) {
		this.cd_produto = cd_produto;
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCampanha_promocional() {
		return campanha_promocional;
	}

	public void setCampanha_promocional(String campanha_promocional) {
		this.campanha_promocional = campanha_promocional;
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
