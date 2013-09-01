package fiap.estoque.dao;


import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.criteria.CriteriaQuery;





public class DAO<T> {
	private final Class<T> classe;

	public DAO(Class<T> classe) {
		this.classe = classe;
	}
	
	EntityManager em = JPA.getEntityManager();

	public T buscarPorId(int id) {
		
		return em.find(this.classe, id);
	}

	
	public void adicionarProduto(T produto){
		
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();		

		
	}
	
	public List<T> listarProdutos(){
		
		CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(classe);
		query.select(query.from(classe));
		List<T> todosProdutos = em.createQuery(query).getResultList();	
		
		return todosProdutos; 
	} 
	public void atualizarProduto(T produto){
		
		em.getTransaction().begin();
		em.merge(produto);
		em.getTransaction().commit();		
	
		
	}
	
	public void removerProduto(T produto){
		
		em.getTransaction().begin();				
		em.remove(em.merge(produto));
		em.getTransaction().commit();

	}
	
	public List<String> buscarTodasAsDescricoesProdutos(){
		
		List<String> lista  = em.createQuery("select p.descricao from ProdutoTO p",String.class).getResultList();
		 
		 return lista;		 
	}
	
	
	
	
	
	
}
