package com.example.myorder.api.controllers;


import com.example.myorder.api.dtos.CreateProductDto;
import com.example.myorder.api.dtos.ProductResponseDto;
import com.example.myorder.api.mappers.ProductMapper;
import com.example.myorder.services.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController("ProductController")
@RequestMapping(RestPath.BASE_PATH + "/product")
@Api(tags = "Produtos")
public class ProductController {

    @Autowired
    private ProductService productService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    @ApiResponses({
            @ApiResponse(code = 201, message = "Produto Criado", response = ProductResponseDto.class)
    })
    public ProductResponseDto create(@RequestBody @Valid CreateProductDto createProductDto){
        return productService.create(createProductDto);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/list")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Listagem executada")
    })
    public List<ProductResponseDto> listAll(){
        return productService.listAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public ProductResponseDto get(@RequestParam() @Param("id") Integer id){
        return ProductMapper.toResponseDto(productService.findById(id));
    }

}
