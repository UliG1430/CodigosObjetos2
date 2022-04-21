package ar.edu.unlp.info.oo2.Ejercicio1Practica3;

public  interface State {
	
	public void start(ToDoItem item) ;
	
	public void togglePause(ToDoItem item);
	
	public void finish(ToDoItem item);
	
	public Duration workedTime(ToDoItem item, Duration duration);
	
	public void addComment(ToDoItem item, String comment);
	

}
