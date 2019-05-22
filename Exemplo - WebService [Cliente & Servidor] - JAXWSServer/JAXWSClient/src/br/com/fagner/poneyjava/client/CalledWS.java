package br.com.fagner.poneyjava.client;

import br.com.fagner.poneyjaxws.ws.impl.DemoInterfaceImplService;
import br.com.fagner.poneyjaxws.ws.impl.DemoInterfaceImplServiceLocator;
import br.com.fagner.poneyjaxws.ws.impl.ProductWSImplService;
import br.com.fagner.poneyjaxws.ws.impl.ProductWSImplServiceLocator;
import br.com.fagner.poneyjaxws.ws.intface.DemoInterface;
import br.com.fagner.poneyjaxws.ws.intface.Product;
import br.com.fagner.poneyjaxws.ws.intface.ProductWS;

public class CalledWS {

	public static void main(String[] args) {
		
		try {
			
			DemoInterfaceImplService demoImplService = new DemoInterfaceImplServiceLocator();
			DemoInterface demoInterface = demoImplService.getDemoInterfaceImplPort();
			
			System.out.println("chamando a classe WS com JaxWS ..:" + demoInterface.helloWorld());
			System.out.println("chamando a classe WS com JaxWS ..:" + demoInterface.hi("Fagner"));
			
			
			ProductWSImplService productImplService = new ProductWSImplServiceLocator();
			ProductWS productWs = productImplService.getProductWSImplPort();
			Product produto = productWs.find();
		
			System.out.println("Produto ..:" + produto.getId());
			System.out.println("Produto ..:" + produto.getName());
			System.out.println("Produto ..:" + produto.getPrice());
			
			System.out.println("*-========Lista Produto============-*");
			
			Product []listaProduto  = productWs.findAll();
			for (Product prod :listaProduto){
			
				System.out.println("Produto ..:" + prod.getId());
				System.out.println("Produto ..:" + prod.getName());
				System.out.println("Produto ..:" + prod.getPrice());
				
				System.out.println("*-=====================-*");
				
			}
			
		} catch (Exception e) {
			System.out.println("ERRO" +  e);
		}
		

	}	

}
