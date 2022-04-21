package ar.edu.unlp.info.oo2.Ejercicio1Practica3;

public class InProgress implements State {

	public void start(ToDoItem item) {}

	public void togglePause(ToDoItem item) {
		item.setStatePaused();
	}
	
	public void finish(ToDoItem item) {
		item.setStateFinished();
	}
	
	public Duration workedTime(ToDoItem item, Duration duration) {
		duration.stop();
		return duration;
	}
	
	public void addComment(ToDoItem item, String comment) {
		item.getComments().add(comment);
	}
	
	
}
