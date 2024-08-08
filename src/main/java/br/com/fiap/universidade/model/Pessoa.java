package br.com.fiap.universidade.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoas")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cpf;
	@Enumerated(EnumType.STRING)
	private OpcoesPaises pais_origem;
	private Integer idade;
	
	public Pessoa() {

    }

    public Pessoa(Long id, String nome, String cpf, OpcoesPaises pais_origem, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.pais_origem = pais_origem;
        this.idade = idade;
    }
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public OpcoesPaises getPais_origem() {
		return pais_origem;
	}
	public void setPais_origem(OpcoesPaises pais_origem) {
		this.pais_origem = pais_origem;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
	
	
	
}
