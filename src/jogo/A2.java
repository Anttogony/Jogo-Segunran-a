package jogo;

import javax.swing.JOptionPane;

import jplay.Keyboard;
import jplay.Scene;
import jplay.Window;
import jplay.URL;

public class A2 extends CenarioP{
	
	private Window janela;
	private Scene cena;
	private Jogador player;
	private Keyboard teclado;
	
	public A2 (Window w, char c) {
		
		janela = w;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("A2.scn"));
		player = new Jogador(500, 100);
		if (c == 'D') {
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
		if (tileColisao(04, player, cena) == true) {
			if (teclado.keyDown(Keyboard.D_KEY)) JOptionPane.showMessageDialog(null, "Desculpe, jovem!\nElevador interditado!!!");
		}
	}

	private void mudarCenario() {
		if (tileColisao(06, player, cena) == true) {
	
			new B2(janela, 'A');
		}
		
		if (tileColisao(13, player, cena) == true) {
			
			new Sala(janela, '2');
		}
	}

}