package ro.ase.cts.proxy.classes;

public class ManagerRezervari implements Rezervabil{

    private String numeLocal;

    public ManagerRezervari(String numeLocal) {
        this.numeLocal = numeLocal;
    }

    @Override
    public void rezerva(int nrPersoane) {
        System.out.println("A fost rezervata o masa de " + nrPersoane + " la restaurantul " + this.numeLocal);
    }
}
