package com.wgltchenology.produtos.controller;

import com.wgltchenology.produtos.model.Produto;
import com.wgltchenology.produtos.service.IProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
    private final IProdutoService produtoService;

    public ProdutoController(IProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> GetAll(){
        return produtoService.GetAll();
    }

    @GetMapping("/{productId}")
    public ResponseEntity<?> getById(@PathVariable int productId) {
        if (productId < 1) {
            return ResponseEntity.badRequest().body("O Id informado é inválido");
        }

        Produto produto = produtoService.GetById(productId);

        if (produto == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(produto);
    }
}
