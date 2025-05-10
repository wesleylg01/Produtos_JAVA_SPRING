package com.wgltchenology.produtos.service;

import com.wgltchenology.produtos.model.Produto;

import java.util.List;

public interface IProdutoService {
    List<Produto> getAll();
    Produto getById(long productId);
    boolean create(Produto produto);
    boolean update(Produto produto);
    boolean delete(long productId);
}