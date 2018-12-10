package jogo;

import javax.swing.JOptionPane;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.Window;
import jplay.URL;

public class Principal {

	public static void main(String[] args) {

		Window janela = new Window(800, 600);
		GameImage plano = new GameImage(URL.sprite("telaInicial.png"));
		Keyboard teclado = janela.getKeyboard();

		while (true) {
			plano.draw();
			janela.update();

			if (teclado.keyDown(Keyboard.ENTER_KEY)) {

				int o = 0;
				while (o != 1 && o != 2) {
					String resposta = JOptionPane.showInputDialog(
							"1 - Novo jogo\n2 - Continuar\n\n**Digite o valor correspondente a sua resposta:");
					try {
						o = Integer.parseInt(resposta);
					} catch (Exception e) {
						o = 0;
					}
					if (o == 1) {
						
						janela.setVisible(false);
						new Imagens("tutorial.png", 2);
					}
				}

				new CenarioInicial(janela, 'X');

			}

		}

	}

}
