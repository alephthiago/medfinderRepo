package br.com.fiap.pacote.dao;

import java.util.Calendar;
import java.util.List;

import javax.ejb.Remote;

import br.com.fiap.dao.DAO;
import br.com.fiap.pacote.entity.Pacote;

@Remote
public interface PacoteDAO extends DAO<Pacote,Integer>{

	List<Pacote> buscarTodos();
	
	List<Pacote> buscarPorDescricao(String descricao);
	
	List<Pacote> buscarPorPeriodo(Calendar inicio, Calendar fim);
}
