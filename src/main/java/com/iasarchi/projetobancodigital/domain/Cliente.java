package com.iasarchi.projetobancodigital.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.iasarchi.projetobancodigital.dto.ClienteRequestDto;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;
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
