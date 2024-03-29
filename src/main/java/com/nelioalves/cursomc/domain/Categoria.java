package com.nelioalves.cursomc.domain;

import java.io.Serializable;

public class Categoria implements Serializable {

	/**
	 * Pesquisar sobre a classe serializable;
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	
	public Categoria() {  // construtor vazio como nomo C#
		
	}

	public Categoria(Integer id, String nome) { // construtor subescrito
		super();
		this.id = id;
		this.nome = nome;
	}
	
	// Criando os métodos de acesso aos atributos do objeto

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	// criando o hashCode e equals para fazer comparações por valor contido em cada objeto e não pela posição na memória.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
