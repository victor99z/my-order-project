package com.example.myorder.api.controllers;


import com.example.myorder.api.dtos.CreateProductDto;
import com.example.myorder.api.dtos.ProductResponseDto;
import com.example.myorder.services.ProductService;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController("ProductController")
@RequestMapping(RestPath.BASE_PATH + "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
//    @ApiResponse({
//            @ApiResponse(code = 201, message = "Produto Criado", response = ProductResponseDto.class)
//    });
    public ProductResponseDto create(@RequestBody @Valid CreateProductDto createProductDto){
        return productService.create(createProductDto);
    }
}
