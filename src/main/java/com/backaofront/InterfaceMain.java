package com.backaofront;
import javax.swing.JFrame;
import javax.swing.JPanel;
// Criando a interface do menu de seleção...
public class InterfaceMain extends JFrame {
	String titulo;
	int altura, largura;

	InterfaceMain(int largura, int altura){
		this.largura = largura;
		this.altura = altura;

		setSize(largura, altura);
		setLocationRelativeTo(null);
		setTitle("Mundo Medieval");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		JPanel painel = new JPanel();
		add(painel);
		setVisible(true);

	}
}