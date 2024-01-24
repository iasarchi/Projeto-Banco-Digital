package com.iasarchi.projetobancodigital.domain;

import com.iasarchi.projetobancodigital.dto.contaDto.ContaRequestDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "contas")
@Entity(name = "contas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Conta {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column
    private String clienteId;
    @Column
    private String tipoConta;
    @Column
    private Double saldo;
    @Column
    private Double taxaManutencao;
    @Column
    private Double taxaRendimento;

    public Conta (ContaRequestDto data) {
        this.clienteId = data.clienteId();
        this.tipoConta = data.tipoConta();
        this.saldo = data.saldo();
        this.taxaManutencao = data.taxaManutencao();
        this.taxaRendimento = data.taxaRendimento();
    }


}
