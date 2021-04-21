package ro.ase.cts.proxy.classes;

public class ProxyManager implements Rezervabil {

    private ManagerRezervari managerRezervari;
    private int nrMinimPersoane;

    public ProxyManager(ManagerRezervari managerRezervari, int nrMinimPersoane) {
        this.managerRezervari = managerRezervari;
        this.nrMinimPersoane = nrMinimPersoane;
    }

    @Override
    public void rezerva(int nrPersoane) {
        if(nrPersoane >= this.nrMinimPersoane){
            this.managerRezervari.rezerva(nrPersoane);
        }
        else {
            System.out.println("Rezervarea nu e poate realiza, veniti fara rezervare");
        }
    }
}
