package ar.edu.unlp.info.oo2.Ejercicio1Practica3;

public class Finished implements State {


	public void start(ToDoItem item) {

		
	}

	public void togglePause(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en paused o in-progress.");
		
	}


	public void finish(ToDoItem item) {
		
		
	}

	public Duration workedTime(ToDoItem item, Duration duration) {
		return duration;
	}


	public void addComment(ToDoItem item, String comment) {
		
		
	}

}
