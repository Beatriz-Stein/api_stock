package com.mysystem.stockapi.repositories;

import com.mysystem.stockapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

