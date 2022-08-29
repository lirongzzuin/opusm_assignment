package com.opusm_assignment.repository;

import com.opusm_assignment.model.Brand;
import com.opusm_assignment.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findProductsByBrand(Brand brand);
    Optional<Product> findProductByBrandAndName(Brand brand, String productName);
}
