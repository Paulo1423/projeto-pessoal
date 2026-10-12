package com.backaofront;
// import do painel que vou usar mais pra frente.
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JOptionPane;

public class Main {
	static void main(String[] args) {
		FlatDarkLaf.setup();
		JOptionPane.showMessageDialog(null, Status.humano);

	}
}
// Aqui vai ser onde o menu ira rodar...