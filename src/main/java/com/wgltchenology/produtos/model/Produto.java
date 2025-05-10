package com.wgltchenology.produtos.model;

import jakarta.persistence.*;
import lombok.*;


@Table(name="produto")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class Produto {
    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;    @Column
    private String descricao;
    private Double preco;
}
