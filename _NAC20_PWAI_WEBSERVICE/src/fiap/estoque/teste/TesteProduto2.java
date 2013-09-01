package fiap.estoque.teste;



import fiap.estoque.bo.EstoqueBO;
import fiap.estoque.to.ProdutoTO;

public class TesteProduto2 {
	
	public static void main(String[] args) {
		EstoqueBO p = new EstoqueBO();
		
		
		String[] descricoes = p.buscarTodasAsDescricoesProdutos();
		
		for (String string : descricoes) {
			System.out.println(string);
		}
		
		ProdutoTO pr = new ProdutoTO();
		pr.setCd_produto(2);
		
		pr.setPreco(10);
		
		
		p.atualizarProduto(pr);
		
		
	}


	
	
}
