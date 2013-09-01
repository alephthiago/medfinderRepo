package br.com.fiap.pacote.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.fiap.cliente.entity.Cliente;

@Entity
@SequenceGenerator(name="seqReserva", sequenceName="SEQ_RESERVA", allocationSize=1)
public class Reserva implements Serializable{

	
	private static final long serialVersionUID = 5484471027191897243L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqReserva")
	private int id;
	
	@Column(name="NUMERO_DIAS")
	private int numeroDias;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_RESERVA")
	private Calendar dataReserva = Calendar.getInstance();
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Pacote pacote;
	
	@ManyToOne
	private Cliente cliente;
	
	public Reserva(int numeroDias, Calendar dataReserva, Pacote pacote, Cliente cliente) {
		super();
		this.numeroDias = numeroDias;
		this.dataReserva = dataReserva;
		this.pacote = pacote;
		this.cliente = cliente;
	}

	public Reserva() {
	}

	public int getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(int numeroDias) {
		this.numeroDias = numeroDias;
	}

	public Calendar getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(Calendar dataReserva) {
		this.dataReserva = dataReserva;
	}

	public int getId() {
		return id;
	}

	public Pacote getPacote() {
		return pacote;
	}

	public void setPacote(Pacote pacote) {
		this.pacote = pacote;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
