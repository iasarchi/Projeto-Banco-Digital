package com.iasarchi.projetobancodigital.repository;

import com.iasarchi.projetobancodigital.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, String> {
    UserDetails findByLogin(String Login);
}
