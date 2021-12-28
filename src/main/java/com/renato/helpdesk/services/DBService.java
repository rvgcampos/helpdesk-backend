package com.renato.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renato.helpdesk.domain.Chamado;
import com.renato.helpdesk.domain.Cliente;
import com.renato.helpdesk.domain.Tecnico;
import com.renato.helpdesk.domain.enums.Perfil;
import com.renato.helpdesk.domain.enums.Prioridade;
import com.renato.helpdesk.domain.enums.Status;
import com.renato.helpdesk.repositories.ChamadoRepository;
import com.renato.helpdesk.repositories.ClienteRepository;
import com.renato.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Valdi Cezar", "56864266605", "valdir@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Linus Torvalds", "62976395748", "torvalds@mail.com", "123");

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1,
				cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
