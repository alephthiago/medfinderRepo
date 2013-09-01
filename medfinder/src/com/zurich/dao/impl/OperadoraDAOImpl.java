package com.zurich.dao.impl;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import com.medfinder.entity.Operadora;




public class OperadoraDAOImpl extends HibernateDAO<Operadora,String> {

	public List<Operadora> buscarTodasOperadoras(){
		List<Operadora> operadoras = new ArrayList<Operadora>();
		
		TypedQuery<Operadora> query = em.createQuery("from Operadora", Operadora.class);
				
		operadoras = query.getResultList();		
		
		return operadoras;
	}
	

}
