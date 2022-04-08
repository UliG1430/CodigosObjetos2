package ar.edu.unlp.info.oo2.Ejercicio1Practica1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	private List <Usuario> usuarios;


	public Twitter() {
		usuarios=new ArrayList<Usuario>();
	}
	
 public void agregarUsuario(Usuario usuario) {
    if (this.usuarios.stream().allMatch(u -> !u.getScreenName().equals(usuario.getScreenName()))) {
    	  this.usuarios.add(usuario);
    	  System.out.println("El usuario se registró exitosamente");
    	}
    	else 
    		System.out.println("El nombre ya está registrado");
    }

public Usuario buscarUsuario(String screenName) {
	return usuarios.stream().filter(u -> u.getScreenName().equals(screenName)).findAny().orElse(null);
}

public void eliminarUsuario(Usuario usuario) {
	this.usuarios.stream().forEach(u -> u.eliminarTweets());
	this.usuarios.remove(usuario);
}

/*public void eliminarTweets (Usuario usuario) {
	 Usuario u;
	if (usuarios.contains(usuario)) {
		  u = buscarUsuario(usuario.getScreenName());
		  u.eliminarTweets();
}
}*/
	
/*public void eliminarUsuario(Usuario usuario) {
		if (usuarios.contains(usuario))
			this.eliminarTweets(usuario);
			usuarios.remove(usuario);
	}*/



}

