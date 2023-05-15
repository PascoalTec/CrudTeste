package com.pascoaltecnologia.crudproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pascoaltecnologia.crudproduct.model.ProdutoModel;
import com.pascoaltecnologia.crudproduct.repository.ProdutoRepository;

@RestController
@RequestMapping("/api")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtorepository;

    @GetMapping
    public List<ProdutoModel> Listar(){
        return produtorepository.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody ProdutoModel produto){
        produtorepository.save(produto);
    }

    @PutMapping
    public void alterar(@RequestBody ProdutoModel produto){
        if(produto.getId() > 0){
            produtorepository.save(produto);
        }
    }

    @DeleteMapping
    public void deletar(@RequestBody ProdutoModel produto){
        produtorepository.delete(produto);
    }
}
