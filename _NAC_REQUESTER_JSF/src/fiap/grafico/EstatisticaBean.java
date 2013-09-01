package fiap.grafico;

import java.io.Serializable;
import java.rmi.RemoteException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.chart.PieChartModel;

import fiap.estoque.bo.EstoqueBOProxy;
import fiap.estoque.to.ProdutoTO;

@ManagedBean
@RequestScoped
public class EstatisticaBean implements Serializable {	
	
	private static final long serialVersionUID = 8823873944056198822L;
	private PieChartModel pizza;

	public PieChartModel getPizza() {
		return pizza;
	}	

	@PostConstruct
	public void inicializarEstatisticas() {
		pizza = new PieChartModel();
		EstoqueBOProxy bo = new EstoqueBOProxy();
		
		try {
			ProdutoTO[] lista = bo.listarProdutos();
			for (ProdutoTO p : lista) {
				pizza.set(p.getDescricao(), p.getQuantidade());				
			}			
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
