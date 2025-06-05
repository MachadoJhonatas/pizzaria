package com.machado.pizzaria_api;

import com.machado.pizzaria_api.domain.Ingredient;
import com.machado.pizzaria_api.domain.Pizza;
import com.machado.pizzaria_api.domain.PizzaIngredient;
import com.machado.pizzaria_api.enums.UnitsOfMeasurement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzariaApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(PizzariaApiApplication.class, args);

        Ingredient calabresa = new Ingredient(null, "Calabresa");
        Ingredient queijoMussarela = new Ingredient(null, "Queijo Mussarela");
        Ingredient molhoDeTomate = new Ingredient(null, "Molho de Tomate");

        Pizza pizzaDeCalabresa = new Pizza("Calabresa", "Pizza de calabresa 8 pedaços", 50.00);

        //adicionando ingredientes com quantidade e unidade, o id está nulo pq eu deixei autogenerate.
        PizzaIngredient ing1 = new PizzaIngredient(null, pizzaDeCalabresa, calabresa, 200, UnitsOfMeasurement.GRAMS.getSimbol());
        PizzaIngredient ing2 = new PizzaIngredient(null, pizzaDeCalabresa, queijoMussarela, 200, UnitsOfMeasurement.GRAMS.getSimbol());
        PizzaIngredient ing3 = new PizzaIngredient(null, pizzaDeCalabresa, molhoDeTomate, 50, UnitsOfMeasurement.MINILITERS.getSimbol());

        //associando a pizza aos ingredientes
        pizzaDeCalabresa.getIngredients().add(ing1);
        pizzaDeCalabresa.getIngredients().add(ing2);
        pizzaDeCalabresa.getIngredients().add(ing3);

        //teste
        System.out.println(pizzaDeCalabresa.getName() + ":");
        for (PizzaIngredient pi : pizzaDeCalabresa.getIngredients()) {
            System.out.println("- " + pi.getAmount() + " " + pi.getUnit() + " de " + pi.getIngredient().getName());
        }

	}

}
