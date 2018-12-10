package jogo;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;

public class Imagens {
	
	public Imagens (String caminho, int n) {
		
		Window janela = new Window(800, 600);
		GameImage plano = new GameImage (URL.sprite(caminho));
		Keyboard teclado = janela.getKeyboard();
		
		while (true) {
			plano.draw();
			janela.update();
			
			if (teclado.keyDown(Keyboard.ENTER_KEY)) {
				
				if (n == 1) new CenarioInicial(janela, 'M'); //Mapa
				if (n == 2) {
					janela.setVisible(false);
					new Imagens("dia1.png", 6); //dia 1
				}
				if (n == 3) new B203(janela, '1'); //mensagem dia 1 Lucelio
				if (n == 4) new B203(janela, '2'); //mensagem dia 2 Lucelio
				if (n == 5) new B203(janela, '3'); //mensagem dia 3 Lucelio
				if (n == 6) new CenarioInicial(janela, 'W'); //Reinciar
				if (n == 7) new CenarioInicial(janela, '2'); //dia 2
				if (n == 8) new B204(janela, '1'); //mensagem dia 1 Wagner
				if (n == 9) new B204(janela, '2'); //mensagem dia 2 Wagner
				if (n == 10) new B204(janela, '3'); //mensagem dia 3 Wagner
				if (n == 11) new CenarioInicial(janela, '3'); //dia 3
				if (n == 12) new B203Soc(janela, '1'); //mensagem dia 1 Adja
				if (n == 13) new B203Soc(janela, '2'); //mensagem dia 2 Adja
				if (n == 14) new B203Soc(janela, '3'); //mensagem dia 3 Adja
				if (n == 15) new B204Mat(janela, '1'); //mensagem dia 1 July
				if (n == 16) new B204Mat(janela, '2'); //mensagem dia 2 July
				if (n == 17) new B204Mat(janela, '3'); //mensagem dia 3 July
				
				
			}
		}
	}
}
