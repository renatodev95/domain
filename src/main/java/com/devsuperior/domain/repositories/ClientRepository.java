package com.devsuperior.domain.repositories;

import com.devsuperior.domain.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
