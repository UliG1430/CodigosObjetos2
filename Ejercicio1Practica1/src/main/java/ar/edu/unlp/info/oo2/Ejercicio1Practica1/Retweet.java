package ar.edu.unlp.info.oo2.Ejercicio1Practica1;

public class Retweet extends Tweet {
	private Tweet origen;
	
	
	
	public Retweet(Tweet origen) {
		super(origen.getContent());
		this.origen = origen;
	}



	public void asignarOrigen(Tweet origen) {
		this.origen=origen;
	}

}
