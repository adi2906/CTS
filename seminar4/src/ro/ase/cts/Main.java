package ro.ase.cts;

import ro.ase.cts.clase.Parlament;
import ro.ase.cts.clase.ParlamentLazy;
import ro.ase.cts.clase.Rucsac;

public class Main {
    public static void main(String[] args) {
        Parlament parlament1 = Parlament.getInstance();
        Parlament parlament2 = Parlament.getInstance();


        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());

        //        shallow copy
        System.out.println("========================");
        parlament1.setTara("Romania");
        parlament2.setNrParlamentari(300);

        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());

        ParlamentLazy parlamentLazy1 = ParlamentLazy.getInstance("Romania", 100, 2, "Ro");
        ParlamentLazy parlamentLazy2 = ParlamentLazy.getInstance("UK", 500, 2, "UK");

        System.out.println(parlamentLazy1.toString());
        System.out.println(parlamentLazy2.toString());

        System.out.println("========================");

        Rucsac rucsac1 = Rucsac.getInstance("Nike", 149.99f, 0.5f);
        Rucsac rucsac2 = Rucsac.getInstance("Puma", 100, 1.5f);

        System.out.println(rucsac1);
        System.out.println(rucsac2);




    }
}
