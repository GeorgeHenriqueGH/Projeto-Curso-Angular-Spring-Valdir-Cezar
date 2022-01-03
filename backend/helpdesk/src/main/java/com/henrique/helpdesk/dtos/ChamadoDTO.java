package com.henrique.helpdesk.dtos;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.henrique.helpdesk.domain.Chamado;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class ChamadoDTO implements Serializable {

	private Integer id;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataAbertura = LocalDate.now();

	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataFechamento;

	private Integer prioridade;
	private Integer status;
	
	private String titulo;
	private String observacoes;

	private String nomeTecnico;
	private String nomeCliente;
	
	private Integer tecnico;
	private Integer cliente;
	

	public ChamadoDTO(Chamado obj) {
		this.id = obj.getId();
		this.dataAbertura = obj.getDataAbertura();
		this.dataFechamento = obj.getDataFechamento();
		this.prioridade = obj.getPrioridade().getCodigo();
		this.status = obj.getStatus().getCodigo();
		this.titulo = obj.getTitulo();
		this.observacoes = obj.getObservacoes();
		this.tecnico = obj.getTecnico().getId();
		this.cliente = obj.getCliente().getId();
		this.nomeCliente = obj.getCliente().getNome();
		this.nomeTecnico = obj.getTecnico().getNome();
	}
	
	public ChamadoDTO() {
		super();
	}
	
}
