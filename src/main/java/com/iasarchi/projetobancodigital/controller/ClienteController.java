package com.iasarchi.projetobancodigital.controller;

import com.iasarchi.projetobancodigital.domain.Cliente;
import com.iasarchi.projetobancodigital.dto.ClienteRequestDto;
import com.iasarchi.projetobancodigital.repository.ClienteRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository repository;
    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping()
    public void salvaCliente(@RequestBody ClienteRequestDto data){
        Cliente clienteData = new Cliente(data);
        repository.save(clienteData);
        return;
    }

}
