package com.lukanka.app.controller;

import java.text.ParseException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lukanka.app.models.Cliente;
import com.lukanka.app.services.impl.ClienteImpl;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

	@Autowired
	private ClienteImpl clienteImpl;

	@GetMapping("/crear-cliente")
	public Cliente crearCliente(@RequestBody Cliente cliente) throws ParseException {
		clienteImpl.guardarCliente(cliente);
		return cliente;
	}
	@GetMapping("/{id}")
	public Optional<Cliente> buscarID(@PathVariable String id) {
		Optional<Cliente> cliente = clienteImpl.buscarClienteID(id);
		return cliente;
	}

}
