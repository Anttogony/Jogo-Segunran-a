package jogo;

import java.awt.Point;
import java.util.Vector;

import javax.swing.JOptionPane;

import jplay.GameObject;
import jplay.Keyboard;
import jplay.Scene;
import jplay.Sprite;
import jplay.TileInfo;
import jplay.URL;
import jplay.Window;

public class Jogador extends Sprite {

	private double velocidade = 0.4;
	protected int direcao = 3;
	private boolean movendo = false, podeAndar = true;
	private Keyboard teclado;

	static double energia = 100;

	public Jogador(int x, int y) {
		super(URL.sprite("jogador.png"), 20);

		this.x = x;
		this.y = y;
		this.setTotalDuration(2000);
	}

	public void setAndar(boolean b) {
		this.podeAndar = b;
	}
	
	public boolean getMovendo() {
		return movendo;
	}

	public void mover(Window janela, Keyboard teclada) {

		if (podeAndar) {

			if (teclada.keyDown(Keyboard.LEFT_KEY)) {
				if (this.x > 0)
					this.x -= velocidade;
				if (direcao != 1) {
					setSequence(4, 8);
					direcao = 1;
				}
				movendo = true;
			}

			if (teclada.keyDown(Keyboard.RIGHT_KEY)) {
				if (this.x < janela.getWidth() - 60)
					this.x += velocidade;
				if (direcao != 2) {
					setSequence(8, 12);
					direcao = 2;
				}
				movendo = true;
			}

			if (teclada.keyDown(Keyboard.UP_KEY)) {
				if (this.y > 0)
					this.y -= velocidade;
				if (direcao != 4) {
					setSequence(12, 16);
					direcao = 4;
				}
				movendo = true;
			}

			if (teclada.keyDown(Keyboard.DOWN_KEY)) {
				if (this.y < janela.getHeight() - 60)
					this.y += velocidade;
				if (direcao != 5) {
					setSequence(1, 4);
					direcao = 5;
				}
				movendo = true;
			}
		}

		if (movendo) {
			update();
			movendo = false;
		}

	}

	Controle controle = new Controle();

	public void caminho(Scene cena, Window janela) {

		teclado = janela.getKeyboard();

		Point min = new Point((int) this.x, (int) this.y);
		Point max = new Point((int) this.x + this.width, (int) this.y + this.height);

		Vector<?> tiles = cena.getTilesFromPosition(min, max);

		for (int i = 0; i < tiles.size(); i++) {
			TileInfo tile = (TileInfo) tiles.elementAt(i);

			if (controle.colisao(this, tile) == true) {

				if (colisaoVertical(this, tile)) {

					if (tile.y + tile.height - 2 < this.y)
						this.y = tile.y + tile.height;
					else if (tile.y > this.y + this.height - 2)
						this.y = tile.y - this.height;
				}

				if (colisaoHorizontal(this, tile)) {

					if (tile.x + tile.width - 2 < this.x)
						this.x = tile.x + tile.width;
					else if (tile.x > this.x + this.width - 2)
						this.x = tile.x - this.width;
				}

			}

		}

	}

	private boolean colisaoVertical(GameObject obj, GameObject obj2) {

		if (obj2.x + obj2.width <= obj.x)
			return false;
		if (obj.x + obj.width <= obj2.x)
			return false;
		return true;

	}

	private boolean colisaoHorizontal(GameObject obj, GameObject obj2) {

		if (obj2.y + obj2.height <= obj.y)
			return false;
		if (obj.y + obj.height <= obj2.y)
			return false;
		return true;

	}

	public void setMovendo(double x, double y) {

		this.x = x;
		this.y = y;

	}

}
