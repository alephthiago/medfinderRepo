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
	
	private int id_operadora;

	OperadoraDAOImpl dao = new OperadoraDAOImpl();
	
	
	

	public int getId_operadora() {
		return id_operadora;
	}

	public void setId_operadora(int id_operadora) {
		this.id_operadora = id_operadora;
	}

	public void buscarTodasOperadoras() {
		operadoras = dao.buscarTodasOperadoras();
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

		operadora = new Operadora();

		operadoras = dao.buscarTodasOperadoras();
	}

	public void incluirOperadora(){
		if(operadora.getDs_operadora() != null){
			dao.insert(operadora);			
		}
	}
	
	public void excluirOperadora(){
		dao.remove(operadora);
		}

}
