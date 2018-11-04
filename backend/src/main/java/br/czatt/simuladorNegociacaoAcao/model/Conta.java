package br.czatt.simuladorNegociacaoAcao.model;

import java.math.BigDecimal;
import java.util.ArrayList;
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


    
    public Conta(Cliente cliente, BigDecimal saldo, List<Custodia> carteira) {
		this.cliente = cliente;
		this.saldo = saldo;
		this.carteira = carteira;
	}
    
    public Conta(Cliente cliente, BigDecimal saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
		this.carteira = new ArrayList<Custodia>();
	}
    
    public Conta(Cliente cliente) {
		this.cliente = cliente;
		this.saldo = new BigDecimal(0);
		this.carteira = new ArrayList<Custodia>();
	}

	public long getId() {
		return id;
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
