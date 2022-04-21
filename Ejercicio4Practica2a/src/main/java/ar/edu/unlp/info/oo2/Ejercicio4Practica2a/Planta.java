package ar.edu.unlp.info.oo2.Ejercicio4Practica2a;

public class Planta extends Empleado {
	private boolean casado;
	private int antiguedad;
	private int hijo;
	
	
	public Planta(boolean casado, int antiguedad, int hijo) {
		super();
		this.casado = casado;
		this.antiguedad = antiguedad;
		this.hijo = hijo;
	}
	
	public double basico(){
		return 50000;
	}
	
	public double adicional() {
		double aux=0;
		if (casado)
			aux+=5000;
		return aux+(2000*hijo)+(2000*antiguedad);
	}
	
	public double sueldo() {
		double basico=this.descuentoBasico(basico());
		double adicional=this.descuentoAdicional(adicional());
		return basico+adicional;
	}
	
}
