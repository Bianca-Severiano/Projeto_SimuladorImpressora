package view;

import javax.swing.JOptionPane;

import controller.ImpressoraController;
import model.Fila;

public class Principal {

	public static void main(String[] args) {

		int r = 0;
		Fila<String> f = new Fila<>();

		ImpressoraController ic = new ImpressoraController();

		do {
			r = Integer.parseInt(JOptionPane.showInputDialog("1- Insere Documento \n 2- Imprimir \n 9- Sair"));

			switch (r) {
			case 1: {
				int id = Integer.parseInt(JOptionPane.showInputDialog("ID do Computador: "));
				String nome = JOptionPane.showInputDialog("Nome do Arquivo: ");
				nome = id + ";" + nome;
				ic.InsereDocumento(f, nome);
				break;
			}
			case 2: {
				ic.ImprimeDocumento(f);
				break;
			} case 9:{
				System.exit(0);
				break;
			} default: 
				System.err.println("Valor inválido");
				break;
			}

		} while (r != 9);

	}

}
