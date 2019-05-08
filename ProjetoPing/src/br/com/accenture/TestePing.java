package br.com.accenture;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import br.com.accenture.ip.ComandoIP;
import br.com.accenture.lerDelimitador.LerDelimitador;

public class TestePing {

	private static String linhaArquivo;
	
	private static String enderecoIp;
	private static String nomeSistemaTestado;
	private static String resultado;
	private static String testeComunicacao;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		System.out.println("Processo iniciado. ");
				
		try {

			FileInputStream abrirArquivo = new FileInputStream("C:/Temp/ips.txt");
			InputStreamReader lerArquivo = new InputStreamReader(abrirArquivo);
			
			BufferedReader carregarArquivoNaMemoria = new BufferedReader(lerArquivo);

			FileWriter arquivoResultado = new FileWriter("C:/Temp/ips-resultado.csv");
			PrintWriter gravaResultado  = new PrintWriter(arquivoResultado);			
			
			ComandoIP testandoIP  = new ComandoIP();
			
			LerDelimitador lerDelimitador = new LerDelimitador();
			
			linhaArquivo = carregarArquivoNaMemoria.readLine();
			
			gravaResultado.println("Destination IP ;Application Name;Equipe;Comunicação");
			
			while (linhaArquivo != null){
				
				enderecoIp = lerDelimitador.lerDemilitadorArquivo(";",0, linhaArquivo);
				nomeSistemaTestado = lerDelimitador.lerDemilitadorArquivo(";",1, linhaArquivo);
				resultado = lerDelimitador.lerDemilitadorArquivo(";",2, linhaArquivo);
				testeComunicacao = testandoIP.TestandoIP(enderecoIp);
				
				System.out.println("Pingando IP :"  + enderecoIp + " " +  testeComunicacao );
				
				gravaResultado.println(enderecoIp + ";" + nomeSistemaTestado + ";" + resultado + ";" + testeComunicacao);
				
				linhaArquivo = carregarArquivoNaMemoria.readLine();
			}
			
			arquivoResultado.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Não foi possível abrir o arquivo de Ips" + e );
		}
		
		System.out.println("Finalizado. ");
	
	}

}
