package com.wgltchenology.produtos.repository;

import com.wgltchenology.produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository  extends JpaRepository<Produto, Long> {
}
