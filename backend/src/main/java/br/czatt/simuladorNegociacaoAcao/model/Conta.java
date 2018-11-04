package br.czatt.simuladorNegociacaoAcao.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="contas")

public class Conta {
	// PrimaryKey
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @OneToOne()
	private Cliente cliente;
    private BigDecimal saldo;
    @OneToMany
	private List<Custodia> carteira;

    protected Conta() {}


    
    public Conta(long id, Cliente cliente, BigDecimal saldo, List<Custodia> carteira) {
		this.id = id;
		this.cliente = cliente;
		this.saldo = saldo;
		this.carteira = carteira;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public BigDecimal getSaldo() {
		return saldo;
	}



	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}



	public List<Custodia> getCarteira() {
		return carteira;
	}



	public void setCarteira(List<Custodia> carteira) {
		this.carteira = carteira;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

    


}
