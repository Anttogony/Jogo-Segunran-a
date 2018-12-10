package jogo;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JOptionPane;

import jplay.GameImage;
import jplay.GameObject;
import jplay.Keyboard;
import jplay.Scene;
import jplay.TileInfo;
import jplay.URL;
import jplay.Window;

public abstract class CenarioP {

	protected boolean tileColisao(int valor, Jogador player, Scene cena) {

		Point min = new Point((int) player.x, (int) player.y);
		Point max = new Point((int) (player.x + player.width), (int) (player.y + player.height));
		Vector<?> tiles = cena.getTilesFromPosition(min, max);

		for (int i = 0; i < tiles.size(); i++) {

			TileInfo tile = (TileInfo) tiles.elementAt(i);
			if (tileColisao(player, tile, valor))
				return true;

		}

		return false;
	}

	private boolean tileColisao(GameObject object, TileInfo tile, int valor) {

		if ((tile.id == valor) && object.collided(tile))
			return true;
		return false;

	}

	public static int ler(String caminho) throws IOException {

		BufferedReader buffRead = new BufferedReader(new FileReader(caminho));

		String x;
		x = buffRead.readLine();
		// JOptionPane.showMessageDialog(null, x);
		buffRead.close();
		int y = Integer.parseInt(x);

		return y;

	}

	public static void escrever(String caminho, int n) throws IOException {

		BufferedWriter escrever = new BufferedWriter(new FileWriter(caminho));

		escrever.append(Integer.toString(n));
		escrever.close();

	}

}
