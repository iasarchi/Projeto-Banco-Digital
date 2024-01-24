package com.iasarchi.projetobancodigital.dto.contaDto;

public record ContaRequestDto(
        String clienteId,
        String tipoConta,
        Double saldo,
        Double taxaManutencao,
        Double taxaRendimento
) {
}
