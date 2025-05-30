package com.machado.pizzaria_api;

import domain.Ingredient;
import domain.Pizza;
import domain.Quantity;
import domain.Recipe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzariaApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(PizzariaApiApplication.class, args);

		Ingredient calabresa = new Ingredient();
		Ingredient queijoMussarela  = new Ingredient();
		Ingredient molhoDeTomate = new Ingredient();

		Recipe recipeOfCalabresaPizza = new Recipe();

		recipeOfCalabresaPizza.addIngredientToMap(new Quantity(200, "gramas"), calabresa);
		recipeOfCalabresaPizza.addIngredientToMap(new Quantity(50, "ml"), molhoDeTomate);
		recipeOfCalabresaPizza.addIngredientToMap(new Quantity(200, "gramas"), queijoMussarela);

		Pizza pizzaDeCalabresa = new Pizza("calabresa", recipeOfCalabresaPizza, "pizza de calabresa 8 pedaços", 50.00);

		pizzaDeCalabresa.toString();


	}

}
