package com.lukanka.app.services;

import java.util.Optional;

import com.lukanka.app.models.Cliente;

public interface ClienteService {

	public Cliente guardarCliente(Cliente cliente);

	public Optional<Cliente> buscarClienteID(String identidad);

	public Cliente eliminarCliente(Cliente cliente);
}
