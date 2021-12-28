package com.renato.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renato.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
