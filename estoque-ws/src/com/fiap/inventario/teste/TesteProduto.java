package com.fiap.inventario.teste;

import com.fiap.inventario.bo.EstoqueBO;

public class TesteProduto {

	public static void main(String[] args) {

		EstoqueBO estoqueBO = new EstoqueBO();
		
		System.out.println(estoqueBO.consultarProduto(401).getDescricao());

	}
}
