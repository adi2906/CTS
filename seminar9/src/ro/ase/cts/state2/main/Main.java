package ro.ase.cts.state2.main;

import ro.ase.cts.state2.classes.Masa;
import ro.ase.cts.state2.classes.StareLibera;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(1);
        masa1.elibereazaMasa();
        masa1.ocupaMasa();
//        masa1.setStare(new StareLibera());
        masa1.rezervaMasa();
        masa1.elibereazaMasa();
        masa1.rezervaMasa();

    }
}
