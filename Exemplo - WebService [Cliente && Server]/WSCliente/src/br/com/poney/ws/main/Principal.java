package br.com.poney.ws.main;

import java.rmi.RemoteException;

import br.com.poney.ws.Impl.ImplementLogin;
import br.com.poney.ws.Impl.ImplementLoginProxy;
import br.com.poney.ws.bean.BeanLogin;

public class Principal {

	public static void main(String[] args) {
		
		/*
		 * Implementar a interface que vamos consumir. 
		 * 
		 */
		
		ImplementLogin interfaceWS = new ImplementLoginProxy("http://localhost:7010/WSValidaLogin/services/ImplementLogin");	
		/*
		 * Estanciando o Bean para pegar os campos
		 *  
		 */
		BeanLogin beanLoginCampos = new BeanLogin();
		
		beanLoginCampos.setUsuario("admin");
		beanLoginCampos.setPassword("Jose");
		
		//Vamos guardar os valor do retorno do WS abaixos		
		try {
			beanLoginCampos = interfaceWS.validaLogin(beanLoginCampos);
			if(beanLoginCampos.getStatus()){
				System.out.println("Bem vindo....");
			}else {
				System.out.println("Erro ao acessar usuário não encontrado...");
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}

}
