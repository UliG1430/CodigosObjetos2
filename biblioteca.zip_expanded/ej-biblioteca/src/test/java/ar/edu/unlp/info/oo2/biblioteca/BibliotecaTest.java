package ar.edu.unlp.info.oo2.biblioteca;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	Biblioteca b1;
	Biblioteca b2;
	
	@BeforeEach
	void setUp() {
		b1=new Biblioteca();
		b2=new Biblioteca();
	}
	
	@Test
	public void exportarSocios() {
		List <Socio> socios1=new ArrayList<>();
		List <Socio> socios2=new ArrayList<>();
		b1.agregarSocio(null);
	}
*/
}

