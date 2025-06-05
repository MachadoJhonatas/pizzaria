package com.machado.pizzaria_api.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private double suggestedPrice;

    @OneToMany(mappedBy = "pizza", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PizzaIngredient> ingredients = new ArrayList<>();

    public Pizza(String name, String description, double suggestedPrice) {
        this.name = name;
        this.description = description;
        this.suggestedPrice = suggestedPrice;
    }

    @Override
    public String toString() {
        return name + "\n" + description + "\n" + suggestedPrice;
    }
}
