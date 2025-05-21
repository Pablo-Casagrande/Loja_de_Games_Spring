package com.generation.lojadegames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojadegames.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	List<Produto> findAllByNomeContainingIgnoreCase(String titulo);
	
	List<Produto> findAllByPreco(BigDecimal preco);

}
