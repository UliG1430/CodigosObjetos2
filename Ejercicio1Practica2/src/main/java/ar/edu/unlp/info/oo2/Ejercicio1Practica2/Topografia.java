package ar.edu.unlp.info.oo2.Ejercicio1Practica2;

public interface Topografia {

	public double getProporcionAgua();
	
	public double getProporcionTierra();

	public boolean compararTopografiaMixta(TopografiaMixta t);
	
	public boolean compararTopografiaAtomica(Atomic t);


}
