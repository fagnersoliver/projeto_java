package br.com.poney.ws.Impl;

import br.com.poney.ws.bean.BeanLogin;
import br.com.poney.ws.service.InterfaceLogin;

public class ImplementLogin implements InterfaceLogin {

	/*
	 * Estamos sobrescrevendo o metodo do Interace login para ser usado.
	 * 
	 * @see
	 * br.com.poney.ws.service.InterfaceLogin#validaLogin(br.com.poney.ws.bean.
	 * BeanLogin)
	 *
	 */

	@Override
	public BeanLogin validaLogin(BeanLogin obj) {

		BeanLogin bean = new BeanLogin();

		if (obj.getUsuario().equals("admin") && obj.getPassword().equals("admin")) {
			bean.setMensaje("Encontrado");
			bean.setStatus(true);
		} else {
			bean.setMensaje("Não Encontrado");
			bean.setStatus(false);
		}

		return bean;
	}

}
