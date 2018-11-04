package br.czatt.simuladorNegociacaoAcao.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.czatt.simuladorNegociacaoAcao.model.customExceptions.SaldoInsuficienteException;

@Entity
@Table(name="custodia")

public class Custodia {
	// PrimaryKey
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @ManyToOne
	private Acao acao;
    private BigDecimal quantidade;
    private BigDecimal stopCompra;    
    private BigDecimal stopVenda;
    
    public Custodia() {}
    
	public Custodia(long id, Acao acao, BigDecimal quantidade) {
		this.id = id;
		this.acao = acao;
		this.quantidade = quantidade;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Acao getAcao() {
		return acao;
	}
	public void setAcao(Acao acao) {
		this.acao = acao;
	}
	public BigDecimal getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getStopCompra() {
		return stopCompra;
	}

	public void setStopCompra(BigDecimal stopCompra) {
		this.stopCompra = stopCompra;
	}

	public BigDecimal getStopVenda() {
		return stopVenda;
	}

	public void setStopVenda(BigDecimal stopVenda) {
		this.stopVenda = stopVenda;
	}

}