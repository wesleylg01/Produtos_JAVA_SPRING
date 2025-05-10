package com.wgltchenology.produtos.controller;

import com.wgltchenology.produtos.model.Produto;
import com.wgltchenology.produtos.service.IProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        return produtoService.getAll();
    }

    @GetMapping("/{productId}")
    public ResponseEntity<?> getById(@PathVariable int productId) {
        if (productId < 1) {
            return ResponseEntity.badRequest().body("O Id informado é inválido");
        }

        Produto produto = produtoService.getById(productId);

        if (produto == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(produto);
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody Produto produto) {
        boolean created = produtoService.create(produto);
        if (!created) {
            return ResponseEntity.badRequest().build(); // ou outra lógica
        }
        return ResponseEntity.status(201).build();
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody Produto produto) {
        boolean updated = produtoService.update(produto);
        if (!updated) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(200).build();
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<?> Delete(@PathVariable int productId){
        if (productId < 1) {
            return ResponseEntity.badRequest().body("O Id informado é inválido");
        }

        var deleted = produtoService.delete(productId);

        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
