package com.machado.pizzaria_api.repository;

import com.machado.pizzaria_api.domain.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
