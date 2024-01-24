package com.iasarchi.projetobancodigital.dto.clienteDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.iasarchi.projetobancodigital.domain.Cliente;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;

public record ClienteResponseDto(String id, String nome, String cpf,@JsonFormat(pattern="yyyy-MM-dd") LocalDate dataNascimento, String endereco, String tipoCliente) {
    public ClienteResponseDto(Cliente cliente){
        this(cliente.getId(), cliente.getNome(), cliente.getCpf(), cliente.getDataNascimento(), cliente.getEndereco(), cliente.getTipoCliente());
    }
}
