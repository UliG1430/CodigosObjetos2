package ar.edu.unlp.info.oo2.Ejercicio4Practica2a;

public abstract class Empleado {
	private boolean casado;
	private int hijo;
	
	

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getHijo() {
		return hijo;
	}

	public void setHijo(int hijo) {
		this.hijo = hijo;
	}

	public abstract double basico();
	
	public abstract double adicional ();
	
	public double descuentoBasico(double basico) {
		return basico-basico*0.13;
	}
	
	public double descuentoAdicional(double adicional) {
		return adicional-adicional*0.13;
	}
	
	public abstract double sueldo();
}