package ar.edu.unlp.info.oo2.Ejercicio4Practica2a;

public class Pasante extends  Empleado {
	private int cantexamenes;

	public Pasante(int cantexamenes) {

		this.cantexamenes = cantexamenes;
	}
	

	public double basico() {
		return 20000;
	}
	
	public double adicional() {
		return 2000*cantexamenes;
	}
	
	public double sueldo() {
		double basico=this.descuentoBasico(basico());
		double adicional=this.descuentoAdicional(adicional());
		return basico+adicional;
	}
	
	
}
