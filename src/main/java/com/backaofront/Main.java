package com.backaofront;
// import do painel que vou usar mais pra frente.
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		InterfaceMain janela = new InterfaceMain(800, 600);
		FlatDarkLaf.setup();
			// Criando o menu de escolha de raças.
			int menu = JOptionPane.showOptionDialog(null, "Escolha sua raça",
							"Mundo medieval",
							JOptionPane.DEFAULT_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null,
							Status.racas,
							Status.racas[7]
							);
			// Com base na escolha do usuario eu mostro para ele os status da raça.
			switch (menu) {
				case 0:
					JOptionPane.showMessageDialog(null,"Status da raça Humano" +
									"\n------------------------"
									+ "\nForça - " + Status.humano.forc
									+ "\nVida - " + Status.humano.vid
									+ "\nVelocidade - " + Status.humano.vel
									+ "\nDominio - " + Status.humano.dom
									+ "\nNem - " + Status.humano.nen
									+ "\n------------------------");
					break;
				case 1:
					JOptionPane.showMessageDialog(null, "Status da raça Vampiro" +
									"\n------------------------"
									+ "\nForça - " + Status.vampiro.forc
									+ "\nVida - " + Status.vampiro.vid
									+ "\nVelocidade - " + Status.vampiro.vel
									+ "\nDominio - " + Status.vampiro.dom
									+ "\nNem - " + Status.vampiro.nen
									+ "\n------------------------");
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Status da raça Elfo" +
									"\n------------------------"
									+ "\nForça - " + Status.elfo.forc
									+ "\nVida - " + Status.elfo.vid
									+ "\nVelocidade - " + Status.elfo.vel
									+ "\nDominio - " + Status.elfo.dom
									+ "\nNem - " + Status.elfo.nen
									+ "\n------------------------");
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Status da raça Orc" +
									"\n------------------------"
									+ "\nForça - " + Status.orc.forc
									+ "\nVida - " + Status.orc.vid
									+ "\nVelocidade - " + Status.orc.vel
									+ "\nDominio - " + Status.orc.dom
									+ "\nNem - " + Status.orc.nen
									+ "\n------------------------");
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Status da raça Draconiano" +
									"\n------------------------"
									+ "\nForça - " + Status.draconiano.forc
									+ "\nVida - " + Status.draconiano.vid
									+ "\nVelocidade - " + Status.draconiano.vel
									+ "\nDominio - " + Status.draconiano.dom
									+ "\nNem - " + Status.draconiano.nen
									+ "\n------------------------");
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "Status da raça Bruxa" +
									"\n------------------------"
									+ "\nForça - " + Status.bruxa.forc
									+ "\nVida - " + Status.bruxa.vid
									+ "\nVelocidade - " + Status.bruxa.vel
									+ "\nDominio - " + Status.bruxa.dom
									+ "\nNem - " + Status.bruxa.nen
									+ "\n------------------------");
					break;
				case 6:
					JOptionPane.showMessageDialog(null, "Status da raça Lobisomem" +
									"\n------------------------"
									+ "\nForça - " + Status.lobisomem.forc
									+ "\nVida - " + Status.lobisomem.vid
									+ "\nVelocidade - " + Status.lobisomem.vel
									+ "\nDominio - " + Status.lobisomem.dom
									+ "\nNem - " + Status.lobisomem.nen
									+ "\n------------------------");
					break;
				case 7: // Fecha o programa assim como o default.
					System.exit(0);
				default:
					System.exit(0);
			}
	}
}
// Aqui vai ser onde o menu ira rodar...
