package com.henrique.helpdesk.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.henrique.helpdesk.domain.enums.Perfil;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
@Entity
@SuppressWarnings("serial")
public class Cliente extends Pessoa {

	@OneToMany(mappedBy = "cliente")
	private List<Chamado> chamados = new ArrayList<>();
	
	public Cliente() {
		super();
		addPerfil(Perfil.CLIENTE);
	}
	
}
