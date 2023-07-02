package com.jack.springbootjpa4.service;

import com.jack.springbootjpa4.dto.ProductRequest;
import com.jack.springbootjpa4.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Product createProduct(ProductRequest productRequest);

    Product readProduct(Long productId);

    Product updateProduct(Long productId, ProductRequest productRequest);

    void deleteProduct(Long productId);
}
