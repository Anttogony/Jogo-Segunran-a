package jogo;

import jplay.Sound;
import jplay.URL;

public class Audio {
	
	private static Sound musica;
	
	public static void play(String audio) {
		
			parar();
			musica = new Sound(URL.audio(audio));
			Audio.musica.play();
			Audio.musica.setRepeat(true);
		
	}
	
	public static void parar() {
		if (Audio.musica != null) musica.stop();
	}
}
