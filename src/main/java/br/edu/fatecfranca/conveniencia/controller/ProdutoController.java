package br.edu.fatecfranca.conveniencia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.conveniencia.model.dto.ProdutoDTO;
import br.edu.fatecfranca.conveniencia.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	ProdutoService service;
	
	
	@GetMapping
	public ResponseEntity <List<ProdutoDTO>> getProdutos(){
		return ResponseEntity.ok(service.getProdutos());
		
	}
	@PostMapping
	public ProdutoDTO addProduto(@RequestBody ProdutoDTO produtoDto) {
		return service.addProduto(produtoDto);
	}
	
	@DeleteMapping("/{id}")
	public void delProduto(@PathVariable ("id") Long id) {
		service.delProduto(id);
	}
	
	@PutMapping
	public ProdutoDTO updateProduto(@RequestBody ProdutoDTO produtoDto) {
		return service.atualizaProduto(produtoDto);
	}
	
}
