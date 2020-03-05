package com.example.myorder.api.controllers;

import com.example.myorder.api.dtos.AuthResponseDto;
import com.example.myorder.api.dtos.CreateAuthDto;
import com.example.myorder.services.AuthService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(RestPath.BASE_PATH + "/auth")
@Api(tags = "Autenticação")
public class AuthController {

    @Autowired
    private AuthService authService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/signup")
    @ApiResponse(code = 201, message = "usuário adicionado", response = AuthResponseDto.class)
    public AuthResponseDto create(@RequestBody @Valid CreateAuthDto createAuthDto){
        return authService.create(createAuthDto);
    }

    @CrossOrigin
    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/login")
    @ApiResponse(code = 200, message = "usuário autenticado", response = AuthResponseDto.class)
    public String get(@RequestBody @Valid CreateAuthDto createAuthDto){
        if(authService.get(createAuthDto)){
            return "usuario logado";
        }else{
            return "falha ao logar";
        }
    }

}
