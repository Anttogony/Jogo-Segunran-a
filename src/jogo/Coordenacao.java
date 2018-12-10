package jogo;

import java.awt.HeadlessException;
import java.io.IOException;

import javax.swing.JOptionPane;

import jplay.Keyboard;
import jplay.Scene;
import jplay.Window;
import jplay.URL;

public class Coordenacao extends CenarioP{
	
	private Window janela;
	private Scene cena;
	private Jogador player;
	private Keyboard teclado;
	
	public Coordenacao (Window w) {
		
		janela = w;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("coordenacao.scn"));
		player = new Jogador(550, 500);
		teclado = janela.getKeyboard();
		//Audio.play("Ebano.mid");
		
		run();
		
	}

	private void run() {
		
		while (true) {
			player.mover(janela, teclado);
			player.caminho(cena, janela);
			
			cena.moveScene(player);
			player.draw();
			janela.update();
			
			interacao();
			mudarCenario();
		
		}
	}
	
	private void interacao() {
		if (tileColisao(02, player, cena) == true) {
			if (teclado.keyDown(Keyboard.D_KEY)) {
				try {
					if(ler("src/recursos/arquivos/stage.txt") == 0) {
	
						new Mensagem("diretor.png");
						
					}
				} catch (HeadlessException | IOException e) {
					
					e.printStackTrace();
				}
			}
		}
		
	}

	private void mudarCenario() {
		if (tileColisao(06, player, cena) == true) {
	
			new Sala(janela, 'C');
		}
	}

}