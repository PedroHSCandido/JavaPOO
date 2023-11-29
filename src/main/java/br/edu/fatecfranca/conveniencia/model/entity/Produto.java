package br.edu.fatecfranca.conveniencia.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="produto")
public class Produto {
		@Id //primary key
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		@Column
		private String produto;
		@Column
		private int quantidade;
		@Column
		private float preco;
		@Column
		private String tipo;
		
		public Produto() {
		}
		
		public Produto(Long id, String produto, int quantidade, float preco, String tipo) {
			super();
			this.id = id;
			this.produto = produto;
			this.quantidade = quantidade;
			this.preco = preco;
			this.tipo = tipo;
		}
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getProduto() {
			return produto;
		}
		public void setProduto(String produto) {
			this.produto = produto;
		}
		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		public float getPreco() {
			return preco;
		}
		public void setPreco(float preco) {
			this.preco = preco;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		
}
