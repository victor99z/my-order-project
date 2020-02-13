package com.example.myorder.api.controllers;


import com.example.myorder.api.dtos.CreateRestaurantDto;
import com.example.myorder.api.dtos.CreateUserDto;
import com.example.myorder.api.dtos.UserResponseDto;
import com.example.myorder.services.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController("UserController")
@RequestMapping(RestPath.BASE_PATH + "/users")
@Api( tags = "Usuários")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserResponseDto create(
            @ApiParam(value = "Objeto que contem info do user")
            @RequestBody
            @Valid
            CreateUserDto createUserDto){
        return userService.create(createUserDto);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping()
    public UserResponseDto get(
            @RequestParam()
            @Param("id")
            Integer id){
        return userService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/list")
    public List<UserResponseDto> list(){
        return userService.listAll();
    }




}
