package ar.edu.unlp.info.oo2.Ejercicio4Practica2a;

public class Temporario extends Empleado {
	private int canthoras;
	private boolean casado;
	private int hijo;
	
	public Temporario(int canthoras, boolean casado, int hijo) {
		this.canthoras = canthoras;
		this.casado = casado;
		this.hijo = hijo;
	}
	
	public double basico() {
		return 20000+(canthoras*300);
	}
	
	public double adicional() {
		double aux=0;
		if (casado)
			aux+=5000;
		return aux+(2000*hijo);
	}
	
	public double sueldo() {
		double basico=this.descuentoBasico(basico());
		double adicional=this.descuentoAdicional(adicional());
		return basico+adicional;
	}
	
	
	
	
	
	
}
