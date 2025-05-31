package com.machado.pizzaria_api.controller;

import com.machado.pizzaria_api.DTO.PizzaResponseDTO;
import com.machado.pizzaria_api.domain.Pizza;
import com.machado.pizzaria_api.services.PizzaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pizza")
public class PizzaController {

    private final PizzaService pizzaService;

    public PizzaController(
            PizzaService pizzaService
    ){
        this.pizzaService = pizzaService;
    }

    @GetMapping("/")
    public ResponseEntity<List<PizzaResponseDTO>> getAllPizzas(){
        return ResponseEntity.ok().body(pizzaService.getAllPizzas());
    }

}
