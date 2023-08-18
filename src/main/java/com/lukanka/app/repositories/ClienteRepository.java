package com.lukanka.app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.lukanka.app.models.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String>{

}
