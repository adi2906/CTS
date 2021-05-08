package ro.ase.cts.chain.classes;

public class ContCredit extends Cont{
    public ContCredit(float sold) {
        super(sold);
    }

    @Override
    public void realizeazaPlata(float suma) {
        if(super.getSold() >= suma) {
            System.out.println("Se realizeaza plata din contul de credit de " + suma);
            super.setSold(super.getSold()-suma);
        } else if (super.getSuccesorCont() != null) {
            super.getSuccesorCont().realizeazaPlata(suma);
        } else {
            System.out.println("Nu se poate realiza plata");
        }
    }
}
