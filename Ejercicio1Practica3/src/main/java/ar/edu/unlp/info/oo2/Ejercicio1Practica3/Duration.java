package ar.edu.unlp.info.oo2.Ejercicio1Practica3;

import java.time.LocalDateTime;

public class Duration {
	private LocalDateTime start ;
	private LocalDateTime stop;
	
	public Duration() {
		this.start = LocalDateTime.now();
	}
	

	public void stop() {
		this.stop = LocalDateTime.now();
	}
	
	public double getDuracionEnSegundos() {
		return (double) java.time.Duration.
				between(start, stop).getSeconds();
	}
	
	
}
