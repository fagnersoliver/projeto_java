package br.com.accenture.lerDelimitador;

public class LerDelimitador {

	private static String DelimitadorARQ;

	public String lerDemilitadorArquivo(String delArq, int posDel, String linhaArquivo) {

		switch (posDel) {
		case 0:

			DelimitadorARQ = linhaArquivo.substring(0, linhaArquivo.indexOf(delArq));

			break;

		case 1:

			DelimitadorARQ = linhaArquivo.substring(linhaArquivo.indexOf(delArq) + 1, linhaArquivo.lastIndexOf(delArq));

			break;

		case 2:

			DelimitadorARQ = linhaArquivo.substring(linhaArquivo.lastIndexOf(delArq) + 1, linhaArquivo.length());

			break;

		default:
			System.out.println("Escreva os parametros corretos !!");
			break;
		}

		return DelimitadorARQ;

	}

}
