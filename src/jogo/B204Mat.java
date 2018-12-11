package jogo;

import java.awt.HeadlessException;
import java.io.IOException;

import javax.swing.JOptionPane;

import jplay.Keyboard;
import jplay.Scene;
import jplay.Window;
import jplay.URL;

public class B204Mat extends CenarioP {

	private Window janela;
	private Scene cena;
	private Jogador player;
	private Keyboard teclado;

	public B204Mat(Window w, char c) {

		janela = w;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("B204Mat.scn"));
		player = new Jogador(500, 490);
		if (c == '1') {
			player.y = 350;
			
			try {
				if (ler("src/recursos/arquivos/stage.txt") == 3) {
					//player.setAndar(false);
					//janela.setVisible(false);

					Quiz questao = new Quiz();
					int resul = questao.perguntar(ler("src/recursos/arquivos/stage.txt"));
					JOptionPane.showMessageDialog(null,
							"SUA NOTA HOJE FOI: " + resul + "\nVocê acertou " + resul / 2 + " questões\n\n\nGO HOME!");
					escrever("src/recursos/arquivos/RPMTInota1.txt", resul);
					try {
						escrever("src/recursos/arquivos/stage.txt", 4);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				} 
				} catch (HeadlessException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		if (c == '2') {
			player.y = 350;
			
			try {
				if (ler("src/recursos/arquivos/stage.txt") == 8) {
					//player.setAndar(false);
					//janela.setVisible(false);

					Quiz questao = new Quiz();
					int resul = questao.perguntar(ler("src/recursos/arquivos/stage.txt"));
					JOptionPane.showMessageDialog(null,
							"SUA NOTA HOJE FOI: " + resul + "\nVocê acertou " + resul / 2 + " questões");
					escrever("src/recursos/arquivos/RPMTInota2.txt", resul);
					try {
						escrever("src/recursos/arquivos/stage.txt", 9);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				} 
				} catch (HeadlessException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		if (c == '3') {
			player.y = 350;
			
			try {
				if (ler("src/recursos/arquivos/stage.txt") == 13) {
					//player.setAndar(false);
					//janela.setVisible(false);

					Quiz questao = new Quiz();
					int resul = questao.perguntar(ler("src/recursos/arquivos/stage.txt"));
					JOptionPane.showMessageDialog(null,
							"SUA NOTA HOJE FOI: " + resul + "\nVocê acertou " + resul / 2 + " questões");
					escrever("src/recursos/arquivos/RPMTInota3.txt", resul);
					try {
						escrever("src/recursos/arquivos/stage.txt", 14);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				} 
				} catch (HeadlessException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		teclado = janela.getKeyboard();
		// Audio.play("Ebano.mid");

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

					if (ler("src/recursos/arquivos/stage.txt") == 1)
						new Mensagem("wagner.png");
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		}

		if (tileColisao(03, player, cena) == true) {
			if (teclado.keyDown(Keyboard.D_KEY)) {

				try {
					if (ler("src/recursos/arquivos/stage.txt") == 3) {
						janela.setVisible(false);
						new Imagens("july1.png", 15);
					}
					if (ler("src/recursos/arquivos/stage.txt") == 8) {
						janela.setVisible(false);
						new Imagens("july2.png", 16);
					}
					if (ler("src/recursos/arquivos/stage.txt") == 13) {
						janela.setVisible(false);
						new Imagens("july3.png", 17);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private void mudarCenario() {
		if (tileColisao(06, player, cena) == true) {

			new B2(janela, 'F');
		}
	}

}