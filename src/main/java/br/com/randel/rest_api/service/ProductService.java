package br.com.randel.rest_api.service;

import br.com.randel.rest_api.database.model.ProductEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

// simulando DB para testes no controller
@Service
public class ProductService {
    private static final List<ProductEntity> PRODUTOS = List.of(
            ProductEntity.builder()
                    .id(1)
                    .name("Notebook")
                    .price(new BigDecimal(5000))
                    .quantity(10)
                    .build(),

            ProductEntity.builder()
                    .id(2)
                    .name("Iphone")
                    .price(new BigDecimal(7000))
                    .quantity(10)
                    .build(),

            ProductEntity.builder()
                    .id(3)
                    .name("Mouse")
                    .price(new BigDecimal(500))
                    .quantity(10)
                    .build()
            );

    public List<ProductEntity> findall() {
            return new ArrayList<>(PRODUTOS);
    }
}
