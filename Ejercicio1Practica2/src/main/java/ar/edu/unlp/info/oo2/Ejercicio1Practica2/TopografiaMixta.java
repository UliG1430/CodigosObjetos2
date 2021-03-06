package ar.edu.unlp.info.oo2.Ejercicio1Practica2;

import java.util.ArrayList;

public class TopografiaMixta implements Topografia{
	private ArrayList<Topografia> components=new ArrayList<Topografia>();
	
	public TopografiaMixta(ArrayList<Topografia> components) {
		this.components=components;
	}
	
	
	
	public ArrayList<Topografia> getComponents() {
		return components;
	}

	public double getProporcionAgua() {
		return components.stream().mapToDouble(p-> p.getProporcionAgua()).sum() /components.size();
		}
	
	public double getProporcionTierra() {
		return 1-this.getProporcionAgua();
	}
	
	public boolean compararTopografiaMixta(TopografiaMixta t1) {
		return components.equals(t1.getComponents());
	}
	
	@Override
	public int hashCode () {
		return 9999;
	}
	
 @Override
	public boolean equals (Object t1) {
	if (t1!=null) {
		Topografia t2=(Topografia) t1;
		return t2.compararTopografiaMixta(this);
	}
	else
		return false;

 }
 
 public boolean compararTopografiaAtomica(Atomic t) {
		return false;
	}



@Override
public String toString() {
	return "TopografiaMixta [components=" + components + "]";
}
	
 
	
}
