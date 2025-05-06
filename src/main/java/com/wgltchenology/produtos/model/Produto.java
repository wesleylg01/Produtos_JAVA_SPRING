package com.wgltchenology.produtos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import java.math.BigDecimal;


@Table(name="Products")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
}
