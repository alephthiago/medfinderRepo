package fiap.estoque.teste;

import java.util.List;

import fiap.estoque.bo.EstoqueBO;
import fiap.estoque.to.ProdutoTO;

public class TesteProduto {

	public static void main(String[] args) {

		EstoqueBO e = new EstoqueBO();

		// System.out.println(e.consultarProduto(401).getDescricao());

		ProdutoTO produto1 = new ProdutoTO();
		ProdutoTO produto2 = new ProdutoTO();
		ProdutoTO produto3 = new ProdutoTO();

		produto1.setDescricao("Produto mais azul");
		produto1.setPreco(25.50);
		produto1.setQuantidade(12);
		produto1.setCampanha_promocional("Seja azul");

		produto2.setDescricao("Produto menos vermelho");
		produto2.setPreco(55.75);
		produto2.setQuantidade(5);
		produto2.setCampanha_promocional("Seja vermelho");

		produto3.setDescricao("Produto quase amarelo");
		produto3.setPreco(5.30);
		produto3.setQuantidade(200);
		produto3.setCampanha_promocional("Seja amarelo");

		e.adicionarProduto(produto1);
		e.adicionarProduto(produto2);
		e.adicionarProduto(produto3);

		ProdutoTO[] list = e.listarProdutos();

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].getCd_produto());
			System.out.println(list[i].getDescricao());
			System.out.println(list[i].getPreco());
			System.out.println(list[i].getQuantidade());
			System.out.println(list[i].getCampanha_promocional());
		}

		ProdutoTO produto6 = new ProdutoTO();

		produto6.setDescricao("Produto teste do update");
		produto6.setPreco(25.50);
		produto6.setQuantidade(12);
		produto6.setCampanha_promocional("prontos pro teste?");

		e.adicionarProduto(produto6);

		System.out.println("Comecando a primeira consulta");

		ProdutoTO[] lista = e.listarProdutos();

		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i].getCd_produto());
			System.out.println(lista[i].getDescricao());
			System.out.println(lista[i].getPreco());
			System.out.println(lista[i].getQuantidade());
			System.out.println(lista[i].getCampanha_promocional());
		}

		produto6.setDescricao("Se vc esta vendo isso, é pq foi atualizado");
		produto6.setPreco(50.50);
		produto6.setQuantidade(11);
		produto6.setCampanha_promocional("O teste foi bem sucedido");

		e.atualizarProduto(produto6);

		System.out.println("Comecando a segunda consulta");

		ProdutoTO[] lista1 = e.listarProdutos();

		for (int i = 0; i < lista1.length; i++) {
			System.out.println(lista1[i].getCd_produto());
			System.out.println(lista1[i].getDescricao());
			System.out.println(lista1[i].getPreco());
			System.out.println(lista1[i].getQuantidade());
			System.out.println(lista1[i].getCampanha_promocional());
		}

		e.removerProduto(produto3);
		
		
		
		System.out.println("Comecando a terceira consulta");

		ProdutoTO[] lista2 = e.listarProdutos();

		for (int i = 0; i < lista2.length; i++) {
			System.out.println(lista2[i].getCd_produto());
			System.out.println(lista2[i].getDescricao());
			System.out.println(lista2[i].getPreco());
			System.out.println(lista2[i].getQuantidade());
			System.out.println(lista2[i].getCampanha_promocional());
		}
		
		
		System.out.println("Comecando a quarta consulta");
		
		String[] ld = e.buscarTodasAsDescricoesProdutos();
		for (String string : ld) {
			System.out.println(string);
		}

	}

}
