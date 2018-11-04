package br.czatt.simuladorNegociacaoAcao.domain;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="acoes")

public class Acao {
	// PrimaryKey
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private BigDecimal valor;
    private String nome;
    private String sigla;
  
    public Acao() {}
    
	public Acao(long id, BigDecimal valor, String nome, String sigla) {
		super();
		this.id = id;
		this.valor = valor;
		this.nome = nome;
		this.sigla = sigla;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
    
}
