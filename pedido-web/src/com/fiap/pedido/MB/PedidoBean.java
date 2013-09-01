package com.fiap.pedido.MB;

import java.io.Serializable;
import java.rmi.RemoteException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import com.fiap.pessoal.bo.ClienteBOProxy;
import com.fiap.pessoal.to.ClienteTO;

@ManagedBean
@ViewScoped
public class PedidoBean implements Serializable {
	
	private ClienteTO clienteTO;
	private String obsEspeciais;
	private char pontoVenda;
	private String estadoVenda;
	private boolean cobrarDespTransporte;
	
	@PostConstruct
	public void inicializarObjetos() {
		
		clienteTO = new ClienteTO();
		
	}
	
	public void pesquisarCliente() {
		ClienteBOProxy clienteBO = new ClienteBOProxy();
		
		try {
			clienteTO = clienteBO.consultarCliente(clienteTO.getCodCliente());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public void emitirPedido(ActionEvent ae) {
		
		//Imprimir todo o resultado
		
		System.out.println("Dados do Cliente:\n");
		System.out.println("Código: " + clienteTO.getCodCliente());
		System.out.println("Nome: " + clienteTO.getNmCliente());
		System.out.println("Endereço: " + clienteTO.getEndereco());
		System.out.println("Cidade: " + clienteTO.getCidade());
		System.out.println("Foto: " + clienteTO.getFoto());
		
		System.out.println();
		
		System.out.println("Dados do Pedido:\n");
		System.out.println("Observações Especiais: " + obsEspeciais);
		System.out.println("Ponto de Venda: " + (pontoVenda == 'V' ? "Loja Virtual" : "Loja Física"));
		System.out.println("Estado da Venda: " + estadoVenda);
		System.out.println("Cobrar Despesas de Transporte? " + (cobrarDespTransporte ? "Sim" : "Não"));
		
	}
	
	public ClienteTO getClienteTO() {
		return clienteTO;
	}
	public void setClienteTO(ClienteTO clienteTO) {
		this.clienteTO = clienteTO;
	}
	public String getObsEspeciais() {
		return obsEspeciais;
	}
	public void setObsEspeciais(String obsEspeciais) {
		this.obsEspeciais = obsEspeciais;
	}
	public char getPontoVenda() {
		return pontoVenda;
	}
	public void setPontoVenda(char pontoVenda) {
		this.pontoVenda = pontoVenda;
	}
	public String getEstadoVenda() {
		return estadoVenda;
	}
	public void setEstadoVenda(String estadoVenda) {
		this.estadoVenda = estadoVenda;
	}
	public boolean isCobrarDespTransporte() {
		return cobrarDespTransporte;
	}
	public void setCobrarDespTransporte(boolean cobrarDespTransporte) {
		this.cobrarDespTransporte = cobrarDespTransporte;
	}
	
	

}
