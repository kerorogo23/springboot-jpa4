package com.jack.springbootjpa4.service.impl;

import com.jack.springbootjpa4.dto.ProductRequest;
import com.jack.springbootjpa4.entity.Product;
import com.jack.springbootjpa4.map.ProductMapper;
import com.jack.springbootjpa4.repository.ProductRepository;
import com.jack.springbootjpa4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> getProducts() {

        List<Product> productList = productRepository.findAll();

        return productList;
    }

    @Override
    public Product createProduct(ProductRequest productRequest) {

        Product product = productRepository.save(productMapper.mapToEntity(productRequest));

        return product;
    }

    @Override
    public Product readProduct(Long productId) {

        Product product = productRepository.findById(productId).orElse(null);

        return product;
    }

    @Override
    public Product updateProduct(Long productId, ProductRequest productRequest) {

        Product product = productRepository.findById(productId).orElse(null);

        if (product != null) {

            product.setProductName(productRequest.getProductName());
            product.setCategory(productRequest.getCategory());
            product.setImageUrl(productRequest.getImageUrl());
            product.setPrice(productRequest.getPrice());
            product.setStock(productRequest.getStock());
            product.setDescription(productRequest.getDescription());

            productRepository.save(product);

            return product;
        } else {
            return null;
        }
    }

    @Override
    public void deleteProduct(Long productId) {

        productRepository.deleteById(productId);
    }
}
