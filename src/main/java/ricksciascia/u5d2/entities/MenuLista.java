package ricksciascia.u5d2.entities;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Getter
@Setter
public class MenuLista {
    private ArrayList<Pizza> pizze;
    private ArrayList<Drink> drinks;
    private ArrayList<Topping> ingredienti;

    public MenuLista(ArrayList<Pizza> pizze, ArrayList<Drink> drinks, ArrayList <Topping> ingredienti){
        this.pizze = pizze;
        this.drinks = drinks;
        this.ingredienti = ingredienti;
    }

    @Override
    public String toString() {
        return " Menu: " +
                "pizze:" + pizze +
                ", drinks: " + drinks +
                ", ingredienti: " + ingredienti +
                ' ';
    }
}
