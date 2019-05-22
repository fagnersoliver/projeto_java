package br.com.fagner.poneyjaxws.ws.intface;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface DemoInterface {
	
	@WebMethod
	public String helloWorld();
	
	@WebMethod
	public String hi(String fullName);
}
