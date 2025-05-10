package com.wgltchenology.produtos.service.impl;
import com.wgltchenology.produtos.repository.ProdutoRepository;
import com.wgltchenology.produtos.service.IProdutoService;
import com.wgltchenology.produtos.model.Produto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service

public class ProdutoService implements IProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }
    @Override
    public List<Produto> getAll(){
        return produtoRepository.findAll();
    }

    @Override
    public Produto getById(long productId){
        return produtoRepository.findById(productId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não encontrado"));
    }

    @Override
    public boolean create(Produto produto){
        produtoRepository.save(produto);
        return true;
    }

    @Override
    public boolean update(Produto produto){
        produtoRepository.save(produto);
        return true;
    }

    @Override
    public boolean delete(long productId){
        if (produtoRepository.existsById(productId)) {
            produtoRepository.deleteById(productId);
            return true;
        }
        return false;
    }
}
