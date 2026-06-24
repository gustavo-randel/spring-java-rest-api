package br.com.randel.rest_api.database.model;

import lombok.*;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
    private Integer id;
    private String name;
    private BigDecimal price;
    private Integer quantity;
}
