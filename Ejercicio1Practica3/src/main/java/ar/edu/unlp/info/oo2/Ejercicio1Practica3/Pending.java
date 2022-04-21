package ar.edu.unlp.info.oo2.Ejercicio1Practica3;

public class Pending implements State {
	
	public void start(ToDoItem item) {
		item.setStateStart();
	}
	
	public void finish(ToDoItem item) {
		
	}
	
	public void togglePause(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en paused o in-progress.");
	}
	public Duration workedTime(ToDoItem item, Duration duration){
		throw new RuntimeException("La tarea aun no comenzo");
	}
	

	public void addComment(ToDoItem item, String comment) {
		item.getComments().add(comment);
	}
	
}
