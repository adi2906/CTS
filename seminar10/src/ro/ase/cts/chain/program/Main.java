package ro.ase.cts.chain.program;

import ro.ase.cts.chain.classes.Cont;
import ro.ase.cts.chain.classes.ContCredit;
import ro.ase.cts.chain.classes.ContCurent;
import ro.ase.cts.chain.classes.ContEconomii;

public class Main {
    public static void main(String[] args) {
        Cont contCurent = new ContCurent(200);
        Cont contCredit = new ContCredit(150);
        Cont contEconomii = new ContEconomii(150);

        contCurent.setSuccesorCont(contCredit);
        contCredit.setSuccesorCont(contEconomii);

        contCurent.realizeazaPlata(100);
        contCurent.realizeazaPlata(150);
        contCredit.realizeazaPlata(100);
        contCredit.realizeazaPlata(100);
        contCredit.realizeazaPlata(100);


    }
}
