package jogo;

import java.io.IOException;

import javax.swing.JOptionPane;

import jplay.Keyboard;
import jplay.Scene;
import jplay.Window;
import jplay.URL;

public class B2 extends CenarioP{
	
	private Window janela;
	private Scene cena;
	private Jogador player;
	private Keyboard teclado;
	
	public B2 (Window w, char c) {
		
		janela = w;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("B2.scn"));
		player = new Jogador(250, 400);
		//if (c == 'D') player.y = 100;
		if (c == 'A') player.x = 500;
		if (c == 'E') {
			player.x = 550;
			player.y = 100;
		}
		if (c == 'F') {
			player.x = 350;
			player.y = 100;
		}
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
		
		//Nenhuma interação no primeiro andar do bloco B, por enquanto
		
	}
		

	private void mudarCenario() {
		if (tileColisao(06, player, cena) == true) {
	
			new A2(janela, 'B');
		}
		
		if (tileColisao(13, player, cena) == true) {
			
			new Sala(janela, '2');
		}
		
		if (tileColisao(15, player, cena) == true) {
			
			try {
				if (ler("src/recursos/arquivos/stage.txt") == 2 || ler("src/recursos/arquivos/stage.txt") == 7 || ler("src/recursos/arquivos/stage.txt") == 12) new B203Soc(janela, 'X');
				new B203(janela, 'X');
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		if (tileColisao(17, player, cena) == true) {
			
			try {
				if (ler("src/recursos/arquivos/stage.txt") == 3 || ler("src/recursos/arquivos/stage.txt") == 8 || ler("src/recursos/arquivos/stage.txt") == 13) new B204Mat(janela, 'X');
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			new B204(janela, 'X');
		}
	}

}