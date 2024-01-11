package com.iasarchi.projetobancodigital.repository;

import com.iasarchi.projetobancodigital.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
