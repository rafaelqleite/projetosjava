package br.com.rafael.microservice.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.rafael.microservice.fornecedor.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
