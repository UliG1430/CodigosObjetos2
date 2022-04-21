package ar.edu.unlp.info.oo2.Ejercicio1Practica3;

import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private State estado;
	private String name;
	private Duration duration;
	private List<String> comments=new ArrayList<String>();
	
	// Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
	
	
		void setStateStart() {
			this.estado=new InProgress();
			duration=new Duration();
			
		}
		
		void setStateFinished() {
			this.estado=new Finished();
			duration.stop();
			
		}
		
		void setStatePending() {
			this.estado=new Pending();
		}
		
		void setStatePaused() {
			this.estado=new Paused();
		}
		
		
		
		public ToDoItem(String name) {
	        	estado=new Pending();
	        	this.name=name;
	        }
		
	        public void start() {
	        	estado.start(this);
	        }

	        public void togglePause() {
	        	estado.togglePause(this);
	        }


		/**
	* Pasa el ToDoItem a finished (siempre y cuando su estado actual sea 
	* in-progress o pausada, si se encuentra en otro estado, no hace nada)
	*/
	        public void finish() {
	        	estado.finish(this);
	        }


		/**
	* Retorna el tiempo que transcurrió desde que se inició la tarea (start)
* hasta que se finalizó. En caso de que no esté finalizada, el tiempo que
* haya transcurrido hasta el momento actual. Si la tarea no se inició,
* genera un error informando la causa específica del mismo.
*/
        public Duration workedTime() {
        	return estado.workedTime(this,duration);
        }


        public void addComment(String comment) {
        	estado.addComment(this,comment);
        }

        

        public List<String> getComments() {
        	return comments;
	}



public Duration getDuration() {
	        	return duration;
	        }
}



