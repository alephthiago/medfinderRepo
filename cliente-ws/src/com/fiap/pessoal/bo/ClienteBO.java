package com.fiap.pessoal.bo;

import com.fiap.pessoal.dao.DAO;
import com.fiap.pessoal.to.ClienteTO;

public class ClienteBO {
	
	/**
	 * Consultar cliente.
	 *
	 * @param codCliente the cod cliente
	 * @return the cliente to
	 */
	public ClienteTO consultarCliente(int codCliente){

		DAO<ClienteTO> clienteDAO = new DAO<ClienteTO>(ClienteTO.class);
		
		ClienteTO clienteTO = clienteDAO.buscarPorId(codCliente);
		
		return clienteTO;
	}
}
