package jogo;

import java.awt.HeadlessException;
import java.io.IOException;

import javax.swing.JOptionPane;

import jplay.Keyboard;
import jplay.Scene;
import jplay.Window;
import jplay.URL;

public class B203Soc extends CenarioP {

	private Window janela;
	private Scene cena;
	private Jogador player;
	private Keyboard teclado;

	public B203Soc(Window w, char c) {

		janela = w;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("B203Soc.scn"));
		player = new Jogador(500, 490);
		if (c == '1') {
			player.y = 350;
			
			try {
				if (ler("src/recursos/arquivos/stage.txt") == 2) {
					//player.setAndar(false);
					//janela.setVisible(false);

					Quiz questao = new Quiz();
					int resul = questao.perguntar(ler("src/recursos/arquivos/stage.txt"));
					JOptionPane.showMessageDialog(null,
							"SUA NOTA HOJE FOI: " + resul + "\nVocê acertou " + resul / 2 + " questões");
					escrever("src/recursos/arquivos/TISnota1.txt", resul);
					try {
						escrever("src/recursos/arquivos/stage.txt", 3);
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
				if (ler("src/recursos/arquivos/stage.txt") == 7) {
					//player.setAndar(false);
					//janela.setVisible(false);

					Quiz questao = new Quiz();
					int resul = questao.perguntar(ler("src/recursos/arquivos/stage.txt"));
					JOptionPane.showMessageDialog(null,
							"SUA NOTA HOJE FOI: " + resul + "\nVocê acertou " + resul / 2 + " questões");
					escrever("src/recursos/arquivos/TISnota2.txt", resul);
					try {
						escrever("src/recursos/arquivos/stage.txt", 8);
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
				if (ler("src/recursos/arquivos/stage.txt") == 12) {
					//player.setAndar(false);
					//janela.setVisible(false);

					Quiz questao = new Quiz();
					int resul = questao.perguntar(ler("src/recursos/arquivos/stage.txt"));
					JOptionPane.showMessageDialog(null,
							"SUA NOTA HOJE FOI: " + resul + "\nVocê acertou " + resul / 2 + " questões");
					escrever("src/recursos/arquivos/TISnota3.txt", resul);
					try {
						escrever("src/recursos/arquivos/stage.txt", 13);
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

					if (ler("src/recursos/arquivos/stage.txt") == 0) {
						
						new Mensagem("lucelio.png");
					}
						
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		}

		if (tileColisao(03, player, cena) == true) {
			if (teclado.keyDown(Keyboard.D_KEY)) {
				
				try {
					if (ler("src/recursos/arquivos/stage.txt") == 2) {
						janela.setVisible(false);
						new Imagens("adja1.png", 12);
					}
					if (ler("src/recursos/arquivos/stage.txt") == 7) {
						janela.setVisible(false);
						new Imagens("adja2.png", 13);
					}
					if (ler("src/recursos/arquivos/stage.txt") == 12) {
						janela.setVisible(false);
						new Imagens("adja3.png", 14);
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

			new B2(janela, 'E');
		}
	}

}