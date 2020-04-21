package com.ferrari.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferrari.cursomc.domains.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
