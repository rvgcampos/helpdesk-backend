package com.renato.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renato.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
