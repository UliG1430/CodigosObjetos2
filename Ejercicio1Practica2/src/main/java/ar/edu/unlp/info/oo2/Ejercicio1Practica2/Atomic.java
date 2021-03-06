package ar.edu.unlp.info.oo2.Ejercicio1Practica2;

public abstract class Atomic implements Topografia {

	private double proporcion;
	
	public  void setProporcion(double n) {
		proporcion=n;
	}
	
	public double getProporcionAgua() {
		return proporcion;
	}
	
	public double getProporcionTierra() {
		return 1-this.getProporcionAgua();
	}
	
	
	
 @Override
	public boolean equals (Object t1) {
	if (t1!=null) {
		Topografia t2=(Topografia) t1;
		return t2.compararTopografiaAtomica(this);
	}
	else
		return false;

 }

	public boolean compararTopografiaAtomica (Atomic t1) {
		return this.getProporcionAgua() == t1.getProporcionAgua();
	
	}
	
	public boolean compararTopografiaMixta(TopografiaMixta t) {
		return false;
	}
	
	
}
