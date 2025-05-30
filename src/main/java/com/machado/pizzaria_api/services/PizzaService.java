package com.machado.pizzaria_api.services;

import com.machado.pizzaria_api.DTO.PizzaResponseDTO;
import com.machado.pizzaria_api.repository.PizzaRepository;

import java.util.ArrayList;
import java.util.List;

public class PizzaService {
    private final PizzaRepository pizzaRepository;

    public PizzaService(
            PizzaRepository pizzaRepository
    ){
        this.pizzaRepository = pizzaRepository;
    }

    public List<PizzaResponseDTO> getAllPizzas(){
        List<PizzaResponseDTO> lista = new ArrayList<>();
        return lista;
    }
 }
