package fiap.estoque.bo;

import java.util.List;



import fiap.estoque.dao.DAO;

import fiap.estoque.to.ProdutoTO;

public class EstoqueBO {
	
	/**
	 * Consultar produto.
	 *
	 * @param codProduto the cod produto
	 * @return the produto to
	 */
	public ProdutoTO consultarProduto(int codProduto){

		DAO<ProdutoTO> produtoDAO = new DAO<ProdutoTO>(ProdutoTO.class);
		
		ProdutoTO produtoTO = produtoDAO.buscarPorId(codProduto);
		
		return produtoTO;
	}
	
	public void adicionarProduto(ProdutoTO produto){
		DAO<ProdutoTO> produtoDAO = new DAO<ProdutoTO>(ProdutoTO.class);		
		produtoDAO.adicionarProduto(produto);		
		
	}
	
	public ProdutoTO[] listarProdutos(){
		DAO<ProdutoTO> produtoDAO = new DAO<ProdutoTO>(ProdutoTO.class);
		
		List<ProdutoTO> lista = produtoDAO.listarProdutos();
		
		ProdutoTO[] listaProdutos = new ProdutoTO[lista.size()];
		
		lista.toArray(listaProdutos);
		
		return listaProdutos;
	}
	
	public void atualizarProduto(ProdutoTO produto){
		DAO<ProdutoTO> produtoDAO = new DAO<ProdutoTO>(ProdutoTO.class);
		
		produtoDAO.atualizarProduto(produto);
		
	}
	public void removerProduto(ProdutoTO produto){
		DAO<ProdutoTO> produtoDAO = new DAO<ProdutoTO>(ProdutoTO.class);
		
		produtoDAO.removerProduto(produto);		
	}
	public String[] buscarTodasAsDescricoesProdutos(){
		DAO<ProdutoTO> produtoDAO = new DAO<ProdutoTO>(ProdutoTO.class);
		List<String> lista = produtoDAO.buscarTodasAsDescricoesProdutos();
		
		
		String[] listaProdutos = new String[lista.size()];
		
		lista.toArray(listaProdutos);
		
		return listaProdutos;
		
	}
	
	
	
}
