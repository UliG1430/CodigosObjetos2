package ar.edu.unlp.info.oo2.Ejercicio1Practica2;

import java.util.ArrayList;

public class Ejercicio {

	public static void main(String[] args) {
		ArrayList <Topografia> componentes1=new ArrayList<Topografia> ();
		componentes1.add(new Tierra());
		componentes1.add(new Agua());
		componentes1.add(new Agua());
		ArrayList <Topografia> componentes2=new ArrayList<Topografia> ();
		componentes2.add(new Tierra());
		componentes2.add(new Tierra());
		componentes2.add(new Tierra());
		componentes2.add(new Tierra());
		TopografiaMixta tm2=new TopografiaMixta(componentes2);
		componentes1.add(tm2);
		TopografiaMixta tm1=new TopografiaMixta(componentes1);
		System.out.println(tm1.getComponents().toString());
	
	
	}

}
