package com.example.myorder.api.mappers;

import com.example.myorder.api.dtos.ProductResponseDto;
import com.example.myorder.entities.Product;
import org.modelmapper.ModelMapper;

public class ProductMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static ProductResponseDto toResponseDto(Product product){
        return modelMapper.map(product, ProductResponseDto.class);
    }
}
