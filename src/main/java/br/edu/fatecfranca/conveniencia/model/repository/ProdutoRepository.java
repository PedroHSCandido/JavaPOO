package br.edu.fatecfranca.conveniencia.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.conveniencia.model.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
