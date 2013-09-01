package com.fiap.pessoal.teste;

import com.fiap.pessoal.bo.ClienteBO;

public class ClienteTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ClienteBO clienteBO = new ClienteBO();
		
		System.out.println(clienteBO.consultarCliente(001).getNmCliente());

	}

}
