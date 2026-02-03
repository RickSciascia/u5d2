package ricksciascia.u5d2.entities;

import java.util.List;

public class Pizza extends Menu {
    private List<Topping> listaIngredienti;

    public Pizza(String nome, int calorie, double prezzo, List<Topping> listaIngredienti) {
        super(nome, calorie, prezzo);
        this.listaIngredienti = listaIngredienti;
    }

    public String toString() {
        String var10000 = super.getNome();
        return "Pizza{ " + var10000 + " " + super.getCalorie() + " " + super.getPrezzo() + " listaIngredienti=" + String.valueOf(this.listaIngredienti) + "}";
    }
}