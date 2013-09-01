package com.fiap.pessoal.dao;

import javax.persistence.EntityManager;

public class DAO<T> {
	private final Class<T> classe;

	public DAO(Class<T> classe) {
		this.classe = classe;
	}

	public T buscarPorId(int id) {
		EntityManager em = JPAUtil.getEntityManager();
		return em.find(this.classe, id);
	}
}