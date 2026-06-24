package br.com.randel.rest_api.dto;

import lombok.*;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private String name;
    private BigDecimal price;
    private Integer quantity;
}
