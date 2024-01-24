package com.iasarchi.projetobancodigital.controller;

import com.iasarchi.projetobancodigital.domain.Conta;
import com.iasarchi.projetobancodigital.dto.contaDto.ContaRequestDto;
import com.iasarchi.projetobancodigital.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conta")
public class ContaController {
    @Autowired
    ContaRepository repository;
    @CrossOrigin("http://localhost:8080")
    public void salvaConta(@RequestBody ContaRequestDto data){
        Conta contaData = new Conta(data);
        repository.save(contaData);


    }
}
