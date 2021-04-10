package ro.ase.cts.adapter;

public class Leasing {
    private String numeClient;
    private int suma;

    public Leasing(String numeClient, int suma) {
        super();
        this.numeClient = numeClient;
        this.suma = suma;
    }
    public void oferaLeasing(){
        System.out.println("Pentru clientul " + this.numeClient + " a fost oferit un leasing de " + this.suma);
    }
}
