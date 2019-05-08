package br.com.accenture.ip;

import java.io.IOException;
import java.net.InetAddress;

public class ComandoIP {

	
	public String TestandoIP(String enderecoIP) {
		
		try {
			
			if (InetAddress.getByName(enderecoIP).isReachable(5000)){
				
				enderecoIP = "[SUCESSO]";
				
			}else{
				
				enderecoIP = "[FALHOU]";
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(" Classe  [TestandoIP] - Erro ao executar comando de IP : " + e + "  ");
		}
		
		return enderecoIP;
		
	}
	
}
