package com.iasarchi.projetobancodigital.domain;

import com.iasarchi.projetobancodigital.dto.clienteDto.ClienteRequestDto;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Table(name = "clientes")
@Entity(name = "clientes")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Cliente {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column
    private String nome;
    @Column
    private String cpf;
    @Column
    private LocalDate dataNascimento;
    @Column
    private String endereco;
    @Column
    private String tipoCliente;

    public Cliente(ClienteRequestDto data) {
        this.nome = data.nome();
        this.cpf = data.cpf();
        this.dataNascimento = data.dataNascimento();
        this.endereco = data.endereco();
        this.tipoCliente = data.tipoCliente();
    }

}
