package com.iasarchi.projetobancodigital.dto.clienteDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public record ClienteRequestDto(
                 @NotBlank(message = "O nome deve ser informado") String nome,
                                @CPF String cpf,
                                @JsonFormat(pattern="yyyy-MM-dd") LocalDate dataNascimento,
                                String endereco,
                                String tipoCliente) {
}
