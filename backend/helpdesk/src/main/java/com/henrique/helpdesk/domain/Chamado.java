package com.henrique.helpdesk.domain;

import java.time.LocalDate;

import com.henrique.helpdesk.domain.enums.Prioridade;
import com.henrique.helpdesk.domain.enums.Status;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Chamado {

	private Integer id;
	
	private LocalDate dataAbertura = LocalDate.now();
	private LocalDate dataFechamento;

	private Prioridade prioridade;
	private Status status;
	
	private String titulo;
	private String observacoes;
 	
	private Tecnico tecnico;
	private Cliente cliente;
}
