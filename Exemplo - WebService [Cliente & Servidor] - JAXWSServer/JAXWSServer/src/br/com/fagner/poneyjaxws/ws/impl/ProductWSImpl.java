package br.com.fagner.poneyjaxws.ws.impl;

import java.util.List;

import javax.jws.WebService;

import br.com.fagner.poneyjaxws.ws.dao.ProductDAO;
import br.com.fagner.poneyjaxws.ws.entities.Product;
import br.com.fagner.poneyjaxws.ws.intface.ProductWS;

@WebService(endpointInterface = "br.com.fagner.poneyjaxws.ws.intface.ProductWS")
public class ProductWSImpl implements ProductWS {

	private ProductDAO produtoDAO = new ProductDAO();

	@Override
	public Product find() {
		return this.produtoDAO.find();
	}

	@Override
	public List<Product> findAll() {
		return this.produtoDAO.findAll();
	}

}
