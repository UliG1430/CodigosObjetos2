package ar.edu.unlp.info.oo2.biblioteca;

public class Ejercicio2Practica1Prueba {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		SimpleJsonAdapter json=new SimpleJsonAdapter();
		biblioteca.setExporter(json);
		System.out.println(biblioteca.exportarSocios());

	}

}
