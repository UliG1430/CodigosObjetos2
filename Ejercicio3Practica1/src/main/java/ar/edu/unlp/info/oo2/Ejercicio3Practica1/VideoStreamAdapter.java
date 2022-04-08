package ar.edu.unlp.info.oo2.Ejercicio3Practica1;

public class VideoStreamAdapter extends MediaPlayer{
	private VideoStream stream;
	
	public VideoStreamAdapter(VideoStream stream) {
	this.stream=stream;
	}
	public void play() {
		stream.reproduce();
	}

}
