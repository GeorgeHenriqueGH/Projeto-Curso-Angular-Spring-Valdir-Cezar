package com.henrique.helpdesk.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.henrique.helpdesk.domain.enums.Perfil;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Entity
@SuppressWarnings("serial")
public class Tecnico extends Pessoa {

	@OneToMany(mappedBy = "tecnico")
	private List<Chamado> chamados = new ArrayList<>();
	
	public Tecnico() {
		super();
		addPerfil(Perfil.CLIENTE);
	}

	public Tecnico(Integer id, String nome, String cpf, String email, String senha) {
		super(id, nome, cpf, email, senha);
		addPerfil(Perfil.CLIENTE);
	}
	
}
