package fiap.estoque;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import fiap.estoque.bo.EstoqueBOProxy;
import fiap.estoque.to.ProdutoTO;
import fiap.login.LoginBean;

@ManagedBean
@ViewScoped
public class EstoqueBean implements Serializable{
	
	
	private static final long serialVersionUID = 7634234514610258498L;

	private List<ProdutoTO> todosProdutos;
	
	private int codProduto;
	
	ProdutoTO produto = new ProdutoTO();
	
	
	
	
	

	public List<ProdutoTO> getTodosProdutos() {
		return todosProdutos;
	}

	public void setTodosProdutos(List<ProdutoTO> todosProdutos) {
		this.todosProdutos = todosProdutos;
	}

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
			todosProdutos = Arrays.asList(estoqueBO.listarProdutos());			
			produto = estoqueBO.consultarProduto(codProduto);
			
			if(produto == null){
				produto = new ProdutoTO();
				produto.setCd_produto(0);
				produto.setDescricao("Produto inexistente");
				produto.setPreco(0);
				produto.setQuantidade(0);
				produto.setCampanha_promocional("Campanha inexistente para o produto cadastrado");
			}
			
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}		
	}
	
	
	public void adicionarProduto(){
		EstoqueBOProxy estoqueBO = new EstoqueBOProxy();
		FacesContext fc = FacesContext.getCurrentInstance();
		FacesMessage mensagem = new FacesMessage("O produto foi incluido com sucesso");
		fc.addMessage("",mensagem);
		try {
			estoqueBO.adicionarProduto(produto);
		} catch (RemoteException e){			
			e.printStackTrace();
		}
		produto = new ProdutoTO();
	}
	
	
	public void removerProduto(){
		FacesContext fc = FacesContext.getCurrentInstance();
		
		EstoqueBOProxy estoqueBO = new EstoqueBOProxy();
		
		try {			
			estoqueBO.removerProduto(produto);
			FacesMessage mensagem = new FacesMessage("O produto foi excluido com sucesso");
			fc.addMessage("",mensagem);
		} catch (RemoteException e) {			
			e.printStackTrace();
		}
		produto = new ProdutoTO();
	}
	
	public String atualizarProduto(){
		FacesContext fc = FacesContext.getCurrentInstance();
		
		
		EstoqueBOProxy estoqueBO = new EstoqueBOProxy();		
		try {
						
			estoqueBO.atualizarProduto(produto);
			FacesMessage mensagem = new FacesMessage("O produto foi atualizado com sucesso");
			fc.addMessage("",mensagem);
		} catch (RemoteException e){
			e.printStackTrace();
		}
		produto = new ProdutoTO();
		return "";
	}
	
	public void completaCliente(javax.faces.event.AjaxBehaviorEvent event)throws javax.faces.event.AbortProcessingException{
		try {	
			EstoqueBOProxy estoqueBO = new EstoqueBOProxy();
						
			produto = estoqueBO.consultarProduto(codProduto);
			
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}	
	}
	
	
		
		
		
	
}
