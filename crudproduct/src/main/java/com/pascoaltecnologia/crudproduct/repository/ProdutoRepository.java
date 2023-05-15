package com.pascoaltecnologia.crudproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pascoaltecnologia.crudproduct.model.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
    
}
