package com.capgemini.dtos;

import com.capgemini.services.validators.impls.IClienteValidator;

import lombok.Data;

@Data
@IClienteValidator
public class ClienteDTO {
	
	private int id;
	private String dni;
	private String nombre;
	private String apellido;
	private String email;
	private String direccion;
	private String codigoPostal;
	private String ciudad;
	private int puntosDescuento;
	private String role;
	private String passwd;
	
	//private List<ConsumoDTO> consumo;
	
}
