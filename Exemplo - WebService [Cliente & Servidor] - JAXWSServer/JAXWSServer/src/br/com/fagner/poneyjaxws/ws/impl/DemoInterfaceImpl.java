package br.com.fagner.poneyjaxws.ws.impl;

import javax.jws.WebService;

import br.com.fagner.poneyjaxws.ws.intface.DemoInterface;

@WebService(endpointInterface = "br.com.fagner.poneyjaxws.ws.intface.DemoInterface")
public class DemoInterfaceImpl implements DemoInterface {

	@Override
	public String helloWorld() {

		return "Olá animal";
	}

	@Override
	public String hi(String fullName) {
		return "Hello.:" + fullName;
	}

}
