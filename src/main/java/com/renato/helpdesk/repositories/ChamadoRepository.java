package com.renato.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renato.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
