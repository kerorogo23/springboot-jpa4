package com.jack.springbootjpa4.map;

import com.jack.springbootjpa4.dto.ProductRequest;
import com.jack.springbootjpa4.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product mapToEntity(ProductRequest productRequest);
    ProductRequest mapToDto(Product product);
}
