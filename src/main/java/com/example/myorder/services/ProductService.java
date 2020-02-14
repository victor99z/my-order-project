package com.example.myorder.services;

import com.example.myorder.api.dtos.CreateProductDto;
import com.example.myorder.api.dtos.ProductResponseDto;
import com.example.myorder.api.dtos.RestaurantResponseDto;
import com.example.myorder.api.mappers.ProductMapper;
import com.example.myorder.entities.Product;
import com.example.myorder.entities.Restaurant;
import com.example.myorder.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {


    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private RestaurantService restaurantService;

    public ProductResponseDto create(CreateProductDto createProductDto){
        Product p1 = createProduct(createProductDto);
        productRepository.save(p1);

        return ProductMapper.toResponseDto(p1);
    }

    public Product createProduct(CreateProductDto productDto){

        return new Product()
                .setName(productDto.getName())
                .setValue(productDto.getValue())
                .setRestaurant(restaurantService.findById(productDto.getRestaurantId()));
    }

}
