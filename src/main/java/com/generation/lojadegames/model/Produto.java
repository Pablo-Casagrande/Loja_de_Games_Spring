package com.generation.lojadegames.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
	
	@Entity
	@Table(name = "tb_produtos") // CREATE TABLE tb_postagens(); 
	public class Produto {

		@Id // Primary Key
		@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
		private Long id;
			
		@Column(length = 100)
		@NotBlank(message = "O atributo nome é obrigatório!")
		@Size(min = 10, max = 100, message = "O atributo nome deve ter no minimo 10 e no máximo 100 caracteres.")
		@Pattern(regexp = "^[^0-9].*", message = "O nome não pode ser numérico")
		private String nome;
		
		@Column(precision = 10, scale = 2)
	    @NotNull(message = "O atributo preço é obrigatório")
	    @DecimalMin(value = "0.0", inclusive = false, message = "O preço deve ser maior que zero")
	    private BigDecimal preco;
		
		@Column(length = 1000)
		@NotBlank(message = "O atributo link da foto é obrigatório!")
		@Size(min = 10, max = 1000, message = "O atributo link da foto deve ter no minimo 10 e no máximo 1000 caracteres.")
		private String linkfoto;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public BigDecimal getPreco() {
			return preco;
		}

		public void setPreco(BigDecimal preco) {
			this.preco = preco;
		}

		public String getLinkfoto() {
			return linkfoto;
		}

		public void setLinkfoto(String linkfoto) {
			this.linkfoto = linkfoto;
		}
		
	

	}

