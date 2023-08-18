package com.lukanka.app.services;

import com.lukanka.app.models.Cliente;

public interface ClienteService {

	public Cliente guardarCliente(Cliente cliente);

	public Cliente buscarClienteID(String identidad);

	public Cliente eliminarCliente(Cliente cliente);
}
