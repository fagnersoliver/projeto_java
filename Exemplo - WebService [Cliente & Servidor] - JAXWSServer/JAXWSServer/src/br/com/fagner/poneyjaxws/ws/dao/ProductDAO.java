package br.com.fagner.poneyjaxws.ws.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fagner.poneyjaxws.ws.entities.Product;

public class ProductDAO {

	public Product find() {

		Product produto = new Product();

		produto.setId("P1");
		produto.setName("Produto 1");
		produto.setPrice(100);

		return produto;
	}

	public List<Product> findAll() {

		List<Product> resultado = new ArrayList<Product>();
		Product produto = new Product();

		produto.setId("P1");
		produto.setName("Produto 1");
		produto.setPrice(100);

		resultado.add(produto);

		produto.setId("P2");
		produto.setName("Produto 2");
		produto.setPrice(100);

		resultado.add(produto);

		produto.setId("P3");
		produto.setName("Produto 3");
		produto.setPrice(100);

		resultado.add(produto);

		return resultado;
	}

}
