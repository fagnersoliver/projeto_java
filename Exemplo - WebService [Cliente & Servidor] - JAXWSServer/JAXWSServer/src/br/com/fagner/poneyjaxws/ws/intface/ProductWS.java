package br.com.fagner.poneyjaxws.ws.intface;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.fagner.poneyjaxws.ws.entities.Product;

@WebService
public interface ProductWS {

	@WebMethod
	public Product find();

	@WebMethod
	public List<Product> findAll();

}
