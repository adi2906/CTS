package ro.ase.cts.adapter;

public class AdapterClaseLeasing extends Leasing implements Creditable{

    public AdapterClaseLeasing(String numeClient, int suma) {
        super(numeClient, suma);
    }

    @Override
    public void crediteaza() {
        super.oferaLeasing();
    }
}
