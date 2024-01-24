package com.iasarchi.projetobancodigital.repository;

import com.iasarchi.projetobancodigital.domain.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {
}
