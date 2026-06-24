package br.com.randel.rest_api.service;

import br.com.randel.rest_api.database.model.ProductEntity;
import br.com.randel.rest_api.dto.ProductDto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

// simulando DB para testes no controller
@Service
public class ProductService {
    private static final List<ProductEntity> PRODUTOS = new ArrayList<>()

    static {
        PRODUTOS.add(ProductEntity.builder()
            .id(1)
            .name("Notebook")
            .price(new BigDecimal(5000))
            .quantity(10)
            .build());

        PRODUTOS.add(ProductEntity.builder()
            .id(2)
            .name("Iphone")
            .price(new BigDecimal(7000))
            .quantity(10)
            .build());

        PRODUTOS.add(ProductEntity.builder()
            .id(3)
            .name("Mouse")
            .price(new BigDecimal(500))
            .quantity(10)
            .build());
    }

    public List<ProductEntity> findall() {
            return new ArrayList<>(PRODUTOS);
    }

    public ProductEntity createProduct(ProductDto productDto) {

        Integer identificator = PRODUTOS.stream()
                .mapToInt(ProductEntity::getId)
                .max()
                .orElse(0) + 1;

        ProductEntity newProduct = ProductEntity.builder()
                .id(identificator)
                .name(productDto.getName())
                .price(productDto.getPrice())
                .quantity(productDto.getQuantity())
                .build();

        PRODUTOS.add(newProduct);
        return newProduct;
    }

}
