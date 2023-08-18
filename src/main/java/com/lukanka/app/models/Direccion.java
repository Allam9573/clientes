package com.lukanka.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "direcciones")
public class Direccion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String departamento;
	private String cuidad;
	private String calle;

	@OneToOne
	@JoinColumn(name = "idDireccion", referencedColumnName = "idDireccion")
	//la primera es la columna de la tabla clientes que hace referencia a la columna idDireccion de la tabla direcciones
	private Direccion direccion;

}
