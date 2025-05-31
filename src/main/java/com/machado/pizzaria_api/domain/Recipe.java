package com.machado.pizzaria_api.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {
    private Map<Quantity, Ingredient> ingredientsMap = new HashMap<>();

    public void addIngredientToMap(Quantity quantity, Ingredient ingredient){
        this.ingredientsMap.put(quantity, ingredient);
    }
}
