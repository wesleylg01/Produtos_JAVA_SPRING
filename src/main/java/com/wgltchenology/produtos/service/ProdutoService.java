package com.wgltchenology.produtos.service;

import com.wgltchenology.produtos.model.Produto;
import com.wgltchenology.produtos.service.impl.IProdutoService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service

public class ProdutoService implements IProdutoService {
    @Override
    public List<Produto> GetAll(){
        return List.of(
                new Produto (1, "Pen Drive","Pen Driver Kingston 32 Gb", new BigDecimal("49.99")),
                new Produto (2, "Mouse de bolinha","Mouse de bolinha que ficava amarelo",new BigDecimal("15.45")),
                new Produto (3, "Capa de monitor","Capa para monitor de tubo",new BigDecimal("12.20"))
        );
    }

    @Override
    public Produto GetById(int productId){
        return new Produto (1, "Pen Drive","Pen Driver Kingston 32 Gb", new BigDecimal("49.99"));
    }
}
