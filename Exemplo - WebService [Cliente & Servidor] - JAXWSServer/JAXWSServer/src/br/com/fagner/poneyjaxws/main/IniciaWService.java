package br.com.fagner.poneyjaxws.main;

import javax.xml.ws.Endpoint;

import br.com.fagner.poneyjaxws.ws.impl.DemoInterfaceImpl;
import br.com.fagner.poneyjaxws.ws.impl.ProductWSImpl;

public class IniciaWService {

	public static void main(String[] args) {

		try {
			Endpoint.publish("http://localhost:8087/br/com/fagner/poneyjaxws/ws/intface/DemoInterface",
					new DemoInterfaceImpl());

			Endpoint.publish("http://localhost:8088/br/com/fagner/poneyjaxws/ws/intface/ProductWS",
					new ProductWSImpl());

			System.out.println("Funcionando ");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
