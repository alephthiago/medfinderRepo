package com.fiap.emprestimo.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CalculoEmprestimoBean {

	private double valorEmprestimo;
	private double juros;
	private double valorTotalEmprestimo;

	public void btnInvalidaCalculo() {
		System.out.println("Passei pelo Invalidador");
		setValorEmprestimo(0.0);
		setJuros(0.0);
		setValorTotalEmprestimo(0.0);
	}

	public void btnCalculoTaxa() {
		System.out.println("Passei pelo Calculo de Taxa");
		setValorTotalEmprestimo(getValorEmprestimo() * getJuros());
		System.out
				.println("Valor Total do Emprestimo: " + valorTotalEmprestimo);
	}

	public double getValorEmprestimo() {
		return valorEmprestimo;
	}

	public void setValorEmprestimo(double valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public double getValorTotalEmprestimo() {
		return valorTotalEmprestimo;
	}

	public void setValorTotalEmprestimo(double valorTotalEmprestimo) {
		this.valorTotalEmprestimo = valorTotalEmprestimo;
	}

}