package com.iasarchi.projetobancodigital.controller;

import com.iasarchi.projetobancodigital.domain.Cliente;
import com.iasarchi.projetobancodigital.dto.ClienteRequestDto;
import com.iasarchi.projetobancodigital.dto.ClienteResponseDto;
import com.iasarchi.projetobancodigital.repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClienteController {
    @Autowired
    private ClienteRepository repository;
    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping()
    public void salvaCliente(@RequestBody @Valid ClienteRequestDto data){
        Cliente clienteData = new Cliente(data);
        repository.save(clienteData);
    }
    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping()
    public List<ClienteResponseDto> getAll() {
        List<ClienteResponseDto> userList = repository.findAll().stream().map(ClienteResponseDto::new).toList();
        return userList;
    }

}
