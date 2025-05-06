package com.wgltchenology.produtos.controller;

import com.wgltchenology.produtos.model.Produto;
import com.wgltchenology.produtos.service.ProdutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping("/teste")
    public List<Produto> GetAll(){
        return produtoService.GetAll();
    }
}
