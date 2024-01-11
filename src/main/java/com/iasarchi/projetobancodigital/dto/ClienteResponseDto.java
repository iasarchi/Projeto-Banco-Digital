package com.iasarchi.projetobancodigital.dto;

import com.iasarchi.projetobancodigital.domain.Cliente;

import java.util.Date;

public record ClienteResponseDto(Long id, String nome, String cpf, Date dataNascimento, String endereco, String tipoCliente) {
    public ClienteResponseDto(Cliente cliente){
        this(cliente.getId(), cliente.getNome(), cliente.getCpf(), cliente.getDataNascimento(), cliente.getEndereco(), cliente.getTipoCliente());
    }
}
