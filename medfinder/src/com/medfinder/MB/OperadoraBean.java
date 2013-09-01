package com.medfinder.MB;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.medfinder.entity.Operadora;
import com.zurich.dao.impl.OperadoraDAOImpl;

@ManagedBean
@RequestScoped
public class OperadoraBean {
	
	

	private Operadora operadora;
	
	private List<Operadora> operadoras;
	
	private String nomeBusca;
	
	
	OperadoraDAOImpl dao = new OperadoraDAOImpl();	
	
	
	
	
	
	
	
	
	public void buscarTodasOperadoras(){			
		operadoras = dao.buscarTodasOperadoras();			
	}
	
	public void cadastrarNovo(){
		operadora = new Operadora();
	}

	
	
	public String getNomeBusca() {
		return nomeBusca;
	}

	public void setNomeBusca(String nomeBusca) {
		this.nomeBusca = nomeBusca;
	}

	public Operadora getOperadora() {
		return operadora;
	}

	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}

	public List<Operadora> getOperadoras() {
		return operadoras;
	}

	public void setOperadoras(List<Operadora> operadoras) {
		this.operadoras = operadoras;
	}
	
	
	@PostConstruct
	public void inicializarLista() {
		
		operadoras = dao.buscarTodasOperadoras();		
	}
	
	
	
	
	
	

	
	
	
	
	

}
