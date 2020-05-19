package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(schema= "public", name="estudiante")
public class Estudiante {
	
	@Id
	@Column(name="c_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer c_usuario;
	
	@Size(min=1,max=50, message= "El campo no debe estar vacio y/o no debe exceder los 50 caracteres")
	@Column(name="nombre")
	@NotEmpty(message = "No puede quedar vacio")
	private String nombre;
	
	@Size(min=1,max=50, message= "El campo no debe estar vacio y/o no debe exceder los 50 caracteres")
	@Column(name="apellido")
	@NotEmpty(message = "No puede quedar vacio")
	private String apellido;
	
	@Size(min=10,max=10, message= "El campo no debe ser de 10 caracteres")
	@NotEmpty(message = "No puede quedar vacio")
	@Column(name="carne")
	private String carne;
	
	@Size(min=1,max=50, message= "El campo no debe estar vacio y/o no debe exceder los 100 caracteres")
	@Column(name="carrera")
	@NotEmpty(message = "No puede quedar vacio")
	private String carrera;
	
	public Estudiante() {};
	
	public Integer getC_usuario() {
		return c_usuario;
	}
	public void setC_usuario(Integer c_usuario) {
		this.c_usuario = c_usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCarne() {
		return carne;
	}
	public void setCarne(String carne) {
		this.carne = carne;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
		
}
