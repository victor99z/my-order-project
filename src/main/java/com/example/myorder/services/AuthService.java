package com.example.myorder.services;

import com.example.myorder.api.dtos.AuthResponseDto;
import com.example.myorder.api.dtos.CreateAuthDto;
import com.example.myorder.api.mappers.AuthMapper;
import com.example.myorder.entities.Auth;
import com.example.myorder.exception.NotFoundException;
import com.example.myorder.repositories.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.myorder.utils.StringToSha1;
import java.util.Optional;

@Service()
public class AuthService {

    @Autowired
    private AuthRepository authRepository;

    public AuthResponseDto create(CreateAuthDto createAuthDto){
        Auth auth = new Auth()
                .setUsername(createAuthDto.getUsername())
                .setPassword(
                        StringToSha1.toSha1(createAuthDto.getPassword())
                );

        authRepository.save(auth);

        return AuthMapper.toResponseDto(auth);
    }

    public Boolean get(CreateAuthDto createAuthDto){
        Optional<Auth> optional = authRepository.findByUsername(createAuthDto.getUsername());

        if(!optional.isPresent()){
            throw new NotFoundException("Usuário não encontrado");
        }

        return optional
                .get()
                .getPassword()
                .equals(StringToSha1.toSha1(createAuthDto.getPassword()));

        // retorna TRUE ou FALSE, depende se a senha coincidir. Metodo toSha1 retorna o encode da senha enviada.
    }

}
