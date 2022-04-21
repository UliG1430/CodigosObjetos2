package ar.edu.unlp.info.oo2.Ejercicio3Practica2;

import java.time.LocalDate;

public class Archivo implements Elemento{
	
	private String nombre;
	private LocalDate fecha;
	private double tamano;
	
	public Archivo (String nombre, LocalDate fecha, double tamano) {
		this.nombre=nombre;
		this.fecha=fecha;
		this.tamano=tamano;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}
	
	public boolean esArchivo() {
		return true;
	}
	
	
}
