package br.com.poney.ws.service;

import br.com.poney.ws.bean.BeanLogin;

public interface InterfaceLogin {
	/*
	 * Faz a interface entre a classe bean onde est�o as informa��es de acesso ao objeto. 	
	 */
	BeanLogin validaLogin(BeanLogin obj);

}
