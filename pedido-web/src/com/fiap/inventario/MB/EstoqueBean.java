package com.fiap.inventario.MB;

import java.rmi.RemoteException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.fiap.inventario.bo.EstoqueBOProxy;
import com.fiap.inventario.to.ProdutoTO;

@ManagedBean
@RequestScoped
public class EstoqueBean {
	
	private int codProduto;
	
	private ProdutoTO produto;

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public ProdutoTO getProduto() {
		return produto;
	}

	public void setProduto(ProdutoTO produto) {
		this.produto = produto;
	}
	
	public void consultarProduto(){
		EstoqueBOProxy estoqueBO = new EstoqueBOProxy();
		
		try {
			produto = estoqueBO.consultarProduto(codProduto);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
