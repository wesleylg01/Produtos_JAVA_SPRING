package com.wgltchenology.produtos.service;

import com.wgltchenology.produtos.model.Produto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service

public class ProdutoService {

    public List<Produto> GetAll(){
        return List.of(
                new Produto (1, "Pen Drive","Pen Driver Kingston 32 Gb", new BigDecimal("49.99")),
                new Produto (2, "Mouse de bolinha","Mouse de bolinha que ficava amarelo",new BigDecimal("15.45")),
                new Produto (3, "Capa de monitor","Capa para monitor de tubo",new BigDecimal("12.20"))
        );
    }
}
