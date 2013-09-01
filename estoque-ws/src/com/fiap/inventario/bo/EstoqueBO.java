package com.fiap.inventario.bo;

import com.fiap.inventario.dao.DAO;
import com.fiap.inventario.to.ProdutoTO;

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
}
