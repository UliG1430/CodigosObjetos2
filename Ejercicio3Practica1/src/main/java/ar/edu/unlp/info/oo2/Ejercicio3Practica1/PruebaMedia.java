package ar.edu.unlp.info.oo2.Ejercicio3Practica1;

public class PruebaMedia {

	public static void main(String[] args) {
		MediaPlayer audio1=new Audio();
		MediaPlayer video1=new VideoFile();
		VideoStream streaming=new VideoStream();
		MediaPlayer stream1=new VideoStreamAdapter(streaming);
		Media media1=new Media();
		media1.setMedia(video1);
		media1.getMedia().play();

	}

}
