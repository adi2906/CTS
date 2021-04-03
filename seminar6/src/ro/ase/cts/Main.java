package ro.ase.cts;

public class Main {

    public static void afiseazaInformatiiJucatori(FabricaJucatori fabrica, String nume, int nrTricou){
        Jucator jucator = fabrica.creeazaJucator(nume, nrTricou);
        System.out.println(jucator.toString());
    }
//factory method
    public static void main(String[] args) {
        afiseazaInformatiiJucatori(new FabricaAtacant(), "Adi", 10);
        afiseazaInformatiiJucatori(new FabricaPortar(), "Ion", 5);
        afiseazaInformatiiJucatori(new FabricaMijlocas(), "Georgeee", 15);


    }
}
