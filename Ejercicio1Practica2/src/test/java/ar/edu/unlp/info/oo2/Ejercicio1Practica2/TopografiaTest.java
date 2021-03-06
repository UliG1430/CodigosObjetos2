package ar.edu.unlp.info.oo2.Ejercicio1Practica2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	Topografia tm1;
	Topografia tm2;
	Topografia ts1;
	Topografia ts2;
	@BeforeEach
	void setUp() {
		ArrayList <Topografia> componentes1=new ArrayList<Topografia> ();
		componentes1.add(new Tierra());
		componentes1.add(new Agua());
		componentes1.add(new Agua());
		componentes1.add(new Pantano());
		tm1=new TopografiaMixta(componentes1);
		ArrayList <Topografia> componentes2=new ArrayList<Topografia> ();
		componentes2.add(new Agua());
		componentes2.add(new Tierra());
		componentes2.add(new Agua());
		componentes2.add(new Tierra());
		tm2=new TopografiaMixta(componentes2);
		ts1=new Agua();
		ts2=new Pantano();
	}
	
	@Test
	public void getProporcionAguaTest(){
		assertEquals(tm1.getProporcionAgua(),0.675);
	
		}
	
}