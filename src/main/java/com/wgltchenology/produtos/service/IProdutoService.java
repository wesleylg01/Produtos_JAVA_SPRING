package com.wgltchenology.produtos.service;

import com.wgltchenology.produtos.model.Produto;

import java.util.List;

public interface IProdutoService {
    List<Produto> GetAll();
    Produto GetById(int productId);
}