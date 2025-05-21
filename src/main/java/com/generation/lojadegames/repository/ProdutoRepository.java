package com.generation.lojadegames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojadegames.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	List<Produto> findAllByNomeContainingIgnoreCase(String titulo);
	
	List<Produto> findAllByPreco(BigDecimal preco);
	
	public List<Produto> findByPrecoGreaterThanEqual(@Param("preco") Double preco);

    public List<Produto> findByPrecoLessThanEqual(@Param("preco") Double preco);

}
