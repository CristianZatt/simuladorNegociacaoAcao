package br.czatt.simuladorNegociacaoAcao.model;

import javax.persistence.*;
import javax.persistence.OneToOne;

@Entity
@Table(name="Clientes")
public class Cliente {

    // PrimaryKey
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @OneToOne(mappedBy = "cliente")
	private Conta conta;
    private String login;
    private String nome;

    protected Cliente() {}

    public Cliente(String login, String nome, Conta conta) {
        this.login = login;
        this.nome = nome;
        this.conta = conta;
    }

    public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	@Override
    public String toString() {
        return String.format(
                "User[id=%d, nome='%s', nome='%s']",
                id, login, nome);
    }

    public String getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}