package br.com.rafael.microservice.fornecedor.service;

import java.util.List;

import br.com.rafael.microservice.fornecedor.model.Produto;
import br.com.rafael.microservice.fornecedor.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

	private ProdutoRepository produtoRepository;
	
	public List<Produto> getProdutosPorEstado(String estado) {
		return produtoRepository.findByEstado(estado);
	}

	
}
