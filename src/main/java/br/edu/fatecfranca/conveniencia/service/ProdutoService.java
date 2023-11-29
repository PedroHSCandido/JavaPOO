package br.edu.fatecfranca.conveniencia.service;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fatecfranca.conveniencia.model.dto.ProdutoDTO;
import br.edu.fatecfranca.conveniencia.model.entity.Produto;
import br.edu.fatecfranca.conveniencia.model.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	ProdutoRepository repository;
	
	public List<ProdutoDTO> getProdutos(){
		List<Produto> produtos = repository.findAll();
		List<ProdutoDTO> listDTO = converteToListaDto(produtos);
		return listDTO;
		
	}
	
	 public ProdutoDTO getProduto(Long id){
		 Optional<Produto> obj = repository.findById(id);
		 Produto produto = obj.get();
		 ProdutoDTO produtoDto = converteToProdutoDto(produto);
		 return produtoDto;
	 }
	 
	 public ProdutoDTO addProduto(ProdutoDTO produtoDTO) {
		Produto produto = converteToProduto(produtoDTO);
		Produto novoProduto = repository.save(produto);
		return converteToProdutoDto(novoProduto);
	 }
	 
	 public void delProduto(Long id) {
		 if(repository.existsById(id)) {
			 repository.deleteById(id);
		 }
	 }
	 
	 public ProdutoDTO atualizaProduto(ProdutoDTO produtoDTO) {
		 Produto produto = converteToProduto(produtoDTO);
		 Produto novoProduto = repository.save(produto);
		 return converteToProdutoDto(novoProduto);
	 }
	//funções auxiliares
	public List<ProdutoDTO> converteToListaDto(List<Produto> produtos) {
	    List<ProdutoDTO> listaDto = new ArrayList<>();

	    for (int i = 0; i < produtos.size(); i++) {
	        listaDto.add(converteToProdutoDto(produtos.get(i)));
	    }
	    return listaDto;
	}

	// converte ProdutoDto para Produto
	public Produto converteToProduto(ProdutoDTO produtoDto) {
	    Produto produto = new Produto();
	    produto.setId(produtoDto.getId());
	    produto.setProduto(produtoDto.getProduto());
	    produto.setPreco(produtoDto.getPreco());
	    produto.setQuantidade(produtoDto.getQuantidade());
	    produto.setTipo(produtoDto.getTipo());

	    return produto;
	}

	// converte Produto para ProdutoDto
	public ProdutoDTO converteToProdutoDto(Produto produto) {
	    ProdutoDTO produtoDto = new ProdutoDTO(produto);
	    return produtoDto;
	}
}