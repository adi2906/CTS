package ro.ase.cts.observer.program;

import ro.ase.cts.observer.classes.ClientAbonat;
import ro.ase.cts.observer.classes.ManagerSala;

//12  => client abonat => subiect => ManagerSala =>
public class Main {
    public static void main(String[] args) {


        ManagerSala managerSala = new ManagerSala("Manager1");

        ClientAbonat clientAbonat1 = new ClientAbonat("Adi");
        ClientAbonat clientAbonat2 = new ClientAbonat("George");

        managerSala.adaugaAbonat(clientAbonat1);
        managerSala.adaugaAbonat(clientAbonat2);

        managerSala.anuntaMeci("volei");

        managerSala.stergereAbonat(clientAbonat1);

        managerSala.anuntaMeci("baschet");

    }
}
