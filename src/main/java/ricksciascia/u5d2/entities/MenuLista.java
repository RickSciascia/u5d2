package ricksciascia.u5d2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
public class MenuLista {
    private ArrayList<Pizza> pizze;
    private ArrayList<Drink> drinks;
    private ArrayList<Topping> ingredienti;

    @Override
    public String toString() {
        return "MenuLista{" +
                "pizze=" + pizze +
                ", drinks=" + drinks +
                ", ingredienti=" + ingredienti +
                '}';
    }
}
