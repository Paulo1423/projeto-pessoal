package com.backaofront;
import javax.swing.JFrame;
// Criando a interface do menu de seleção...
public class InterfaceMain extends JFrame {
	String titulo;
	int altura, largura;

	InterfaceMain(int largura, int altura){
		this.largura = largura;
		this.altura = altura;

		setSize(largura, altura);
		setTitle("Mundo Medieval");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
}