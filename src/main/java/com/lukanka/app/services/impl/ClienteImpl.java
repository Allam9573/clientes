package com.lukanka.app.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lukanka.app.models.Cliente;
import com.lukanka.app.repositories.ClienteRepository;
import com.lukanka.app.services.ClienteService;

@Service
public class ClienteImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public Cliente guardarCliente(Cliente cliente) {
		clienteRepository.save(cliente);
		return null;
	}

	@Override
	public Cliente buscarClienteID(String identidad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente eliminarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
