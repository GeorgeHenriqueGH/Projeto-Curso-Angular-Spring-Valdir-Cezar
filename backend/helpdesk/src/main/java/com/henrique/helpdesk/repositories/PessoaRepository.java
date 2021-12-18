package com.henrique.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henrique.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
