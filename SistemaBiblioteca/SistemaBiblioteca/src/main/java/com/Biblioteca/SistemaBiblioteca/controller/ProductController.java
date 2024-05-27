package com.Biblioteca.SistemaBiblioteca.controller;

import com.Biblioteca.SistemaBiblioteca.dtos.ProductDto;
import com.Biblioteca.SistemaBiblioteca.models.ProductModel;
import com.Biblioteca.SistemaBiblioteca.repostory.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @PostMapping("/products")
    public ResponseEntity<ProductModel> saveProuct(@ResponseBody @Valid ProductDto productDto){
        var productModel = new ProductModel();
        BeanUtils.copyProperties(productDto, productModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(productModel));
    }
}
