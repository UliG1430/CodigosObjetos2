package ar.edu.unlp.info.oo2.Ejercicio1Practica2;

public class Pantano extends Atomic {

	public Pantano() {
		this.setProporcion(0.7);
	}
	
	@Override
	public int hashCode () {
		return 3333;
	}

	@Override
	public String toString() {
		return "Soy pantano";
	}
	
	
}
