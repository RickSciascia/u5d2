package ricksciascia.u5d2.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Ordine {
    private int nOrdine;
    private List<Menu> elementiMenu;
    private StatoOrdine statoOrdine;
    private int nCoperti;
    private LocalDateTime oraOrdine;
//    private double totale;

    public Ordine(List<Menu> elementiMenu, int nOrdine, StatoOrdine status, int nCoperti) {
        this.elementiMenu = elementiMenu;
        this.nOrdine = nOrdine;
        this.statoOrdine = status;
        this.nCoperti = nCoperti;
        this.oraOrdine = LocalDateTime.now();
//        this.totale = elementiMenu.stream().mapToDouble(Menu::getPrezzo).sum()+ (nCoperti*coperto);
    }
    public double getTotale(int nCoperti, double prezzoCoperto){
        return getElementiMenu().stream().mapToDouble(elemento-> elemento.getPrezzo()).sum()+(nCoperti*prezzoCoperto);
    }
//    toString


    @Override
    public String toString() {
        return " " +
                "numero ordine: " + nOrdine +
                ", " + elementiMenu +
                ", status: " + statoOrdine +
                ", coperti: " + nCoperti +
                ", orario: " + oraOrdine +
                ' ';
    }
}

