package com.renato.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renato.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
