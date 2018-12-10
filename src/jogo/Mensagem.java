package jogo;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mensagem extends JFrame{

	public Mensagem(String caminho) {
		
		ImageIcon imagem = new ImageIcon(getClass().getResource(caminho));
		JLabel label = new JLabel(imagem);
		
		add(label);
		
		setSize(650,480);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	
	}
	
}