package com.machado.pizzaria_api.domain;

import jakarta.persistence.Id;

import com.machado.pizzaria_api.enums.UnitsOfMeasurement;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PizzaIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Pizza pizza;

    @ManyToOne
    private Ingredient ingredient;

    private int amount;
    private String unit;
}
