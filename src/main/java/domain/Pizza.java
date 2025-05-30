package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pizza {
    private String name;
    private Recipe recipe;
    private String description;
    private double suggestedPrice;

    public String toString(){
        return this.getName() + "\n" + this.getDescription() + "\n" + this.getRecipe().toString()+"\n"+this.getSuggestedPrice();
    }
}
