package ar.edu.unlp.info.oo2.Ejercicio1Practica1;

public class Tweet {
	private int chars;
	private String content;
	
	public Tweet(String tuit) {
		content=tuit;
		chars=tuit.length();
	}

	public int getChars() {
		return chars;
	}

	public void setChars(int chars) {
		this.chars = chars;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
