package jogo;

import javax.swing.JOptionPane;

import jplay.Keyboard;
import jplay.Scene;
import jplay.Window;
import jplay.URL;

public class Sala extends CenarioP{
	
	private Window janela;
	private Scene cena;
	private Jogador player;
	private Keyboard teclado;
	
	public Sala (Window w, char c) {
		
		janela = w;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("B1.scn"));
		player = new Jogador(550, 500);
		if (c == 'C') player.y = 100;
		if (c == '2') {
			player.y = 500;
			player.x = 250;
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
			if (teclado.keyDown(Keyboard.D_KEY)) JOptionPane.showMessageDialog(null, "Olá, Jovem aluno! Neste local você irá saber mais sobre o curso do BTI, quais as diciplinas da grade do curso e quais assuntos abordam.\nVa la na Coordenacao saber qual sua primeira aula!\nEla fica neste mesmo andar na sala B107");
		}
		
		if (tileColisao(03, player, cena) == true) {
			if (teclado.keyDown(Keyboard.D_KEY)) JOptionPane.showMessageDialog(null, "AQUI APARECER;A O MAPA DO PRIMEIRO ANDAR");
		}
		
	}

	private void mudarCenario() {
		if (tileColisao(06, player, cena) == true) {
	
			new CenarioInicial(janela, 'B');
		}
		
		if (tileColisao(07, player, cena) == true) {
			
			new Coordenacao(janela);
		}
		
		if (tileColisao(13, player, cena) == true) {
			
			new B2(janela, 'B');
		}
	}

}