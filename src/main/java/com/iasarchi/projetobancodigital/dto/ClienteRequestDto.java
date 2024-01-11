package com.iasarchi.projetobancodigital.dto;

import java.util.Date;

public record ClienteRequestDto(String nome, String cpf, Date dataNascimento, String endereco, String tipoCliente) {
}
