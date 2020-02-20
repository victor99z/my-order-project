package com.example.myorder.services;

import com.example.myorder.api.dtos.CreateRestaurantDto;
import com.example.myorder.api.dtos.RestaurantResponseDto;
import com.example.myorder.api.mappers.RestaurantMapper;
import com.example.myorder.entities.Restaurant;
import com.example.myorder.entities.User;
import com.example.myorder.exception.AlreadyExistsException;
import com.example.myorder.exception.NotFoundExpection;
import com.example.myorder.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public void createRestaurant(CreateRestaurantDto createRestaurantDto){
        validateRestaurant(createRestaurantDto.getEmail());

        Restaurant restaurant = new Restaurant()
                .setEmail(createRestaurantDto.getEmail())
                .setName(createRestaurantDto.getName())
                .setPhone(createRestaurantDto.getPhone());

        restaurantRepository.save(restaurant);

    }

    public void validateRestaurant(String email){
        Restaurant restaurant = restaurantRepository.findByEmail(email);

        if(restaurant != null){
            throw new AlreadyExistsException("Ja existe um usuario cadastro com este email");
        }

    }

    public RestaurantResponseDto getById(Integer id){

        Restaurant restaurant = findById(id);

        return new RestaurantResponseDto()
                .setId(restaurant.getId())
                .setEmail(restaurant.getEmail())
                .setName(restaurant.getName())
                .setPhone(restaurant.getPhone());

    }

    public Restaurant findById(Integer id){
        Optional<Restaurant> optinal = restaurantRepository.findById(id);
        if(!optinal.isPresent()){
            throw new NotFoundExpection("Resturante nao encontrado");
        }

        return optinal.get();

    }

    public List<RestaurantResponseDto> listAll(){
        List<Restaurant> list = restaurantRepository.findAll();

        return list.stream().map( restaurant -> RestaurantMapper.toResponseDto(restaurant)).collect(Collectors.toList());
        //return list.stream().map(RestaurantMapper::toResponseDto).collect(Collectors.toList());
    }

}
