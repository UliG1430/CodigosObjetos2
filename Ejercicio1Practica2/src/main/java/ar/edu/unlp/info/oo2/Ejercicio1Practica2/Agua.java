package ar.edu.unlp.info.oo2.Ejercicio1Practica2;

public class Agua extends Atomic {
	
	
	public Agua () {
		setProporcion(1);
	}

	@Override
	public int hashCode () {
		return 1111;
	}

	@Override
	public String toString() {
		return "Soy agua";
	}
	
	
	
	
}
