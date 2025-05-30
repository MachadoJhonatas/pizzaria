package com.machado.pizzaria_api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pizza {
    @Id
    private Long id;
    private String name;
    private Recipe recipe;
    private String description;
    private double suggestedPrice;

    public String toString(){
        return this.getName() + "\n" + this.getDescription() + "\n" + this.getRecipe().toString()+"\n"+this.getSuggestedPrice();
    }
}
