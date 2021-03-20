package ro.ase.cts;

import ro.ase.cts.clase.Parlament;
import ro.ase.cts.clase.ParlamentLazy;

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

        ParlamentLazy parlamentLazy1 = ParlamentLazy.getInstance("Serbia", 400, 8, "Serb");
        ParlamentLazy parlamentLazy2 = ParlamentLazy.getInstance("UK", 500, 2, "UK");

        System.out.println(parlamentLazy1.toString());
        System.out.println(parlamentLazy2.toString());


    }
}
