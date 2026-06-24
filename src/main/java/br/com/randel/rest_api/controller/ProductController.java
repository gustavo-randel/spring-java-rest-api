package br.com.randel.rest_api.controller;

import br.com.randel.rest_api.database.model.ProductEntity;
import br.com.randel.rest_api.dto.ProductDto;
import br.com.randel.rest_api.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/products")
@RequiredArgsConstructor
public class ProductController {
    // metodo "ultrapassado", nao garante imutabilidade, dificulta testes unitarios
    // melhor maneira é injetar a dependencia
    //@Autowired
    // para a injeção de dependencia ser possivel, a classe tem q ser um bin gerenciado pelo Spring, no caso como é um service, vai sem problemas
    // anotacao lombok tira a necessidade de fazer o construtor
    private final ProductService productService;

    // retorna json por padrão, mas caso necessario pode ser definido outro tipo de retorno ao lado do getmapping com
    // produces = e o tipo de retorno
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> findALl() {
        return productService.findall();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductEntity createProduct(@RequestBody ProductDto productDto) {
        return productService.createProduct(productDto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ProductEntity updateProduct(@PathVariable Integer id ,@RequestBody ProductDto productDto) {
        return productService.updateProduct(productDto, id);
    }

}
