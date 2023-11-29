package br.edu.fatecfranca.conveniencia.model.dto;

import br.edu.fatecfranca.conveniencia.model.entity.Produto;

public class ProdutoDTO {
		private Long id;
		private String produto;
		private int quantidade;
		private float preco;
		private String tipo;
		
		public ProdutoDTO() {
		}
		
		public ProdutoDTO(Produto produto) {
			super();
			this.id = produto.getId();
			this.produto = produto.getProduto();
			this.quantidade = produto.getQuantidade();
			this.preco = produto.getPreco();
			this.tipo = produto.getTipo();
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

