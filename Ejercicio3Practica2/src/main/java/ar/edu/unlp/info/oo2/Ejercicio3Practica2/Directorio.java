package ar.edu.unlp.info.oo2.Ejercicio3Practica2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Directorio implements Elemento{

	private String nombre;
	private LocalDate fecha;
	private double tamano=32000;
	private List<Elemento> estructura;
	
	public Directorio(String nombre, LocalDate fecha) {
		this.nombre=nombre;
		this.fecha=fecha;
		estructura=new ArrayList<Elemento>();
	}
	
	public double tamanoTotalOcupado() {
		return this.getTamano()+estructura.stream().mapToDouble(e-> e.getTamano()).sum();
	}
	
	public Archivo archivoMasGrande() {
		Elemento max=null;
		for (Elemento e:this.estructura) {
			if (e.esArchivo()) {
				if (e.getTamano()>max.getTamano())
					max=e;
			}else
				max=(((Directorio) e).archivoMasGrande());
		}
		
		return (Archivo) max; 
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

	public List<Elemento> getEstructura() {
		return estructura;
	}

	public void setEstructura(List<Elemento> estructura) {
		this.estructura = estructura;
	}
	
	public boolean esArchivo() {
		return false;
	}





}
