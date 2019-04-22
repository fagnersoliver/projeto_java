package br.com.poney.ws.service;

import br.com.poney.ws.bean.BeanLogin;

public interface InterfaceLogin {
	/*
	 * Faz a interface entre a classe bean onde estão as informações de acesso ao objeto. 	
	 */
	BeanLogin validaLogin(BeanLogin obj);

}
