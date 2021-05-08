package ro.ase.cts.command.classes;

public class Executant {
    private float sold;
    private String detinator;

    public Executant(String detinator) {
        this.detinator = detinator;
    }

    public float getSold() {
        return sold;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    public String getDetinator() {
        return detinator;
    }

    public void setDetinator(String detinator) {
        this.detinator = detinator;
    }

    public void creeazaCont(float sold) {
        this.sold = sold;
        System.out.println("S-a constituit contul cu suma " + sold);
    }

    public void retragere(float suma) {
        if (suma <= this.sold) {
            this.sold -= suma;
            System.out.println("S-a retras suma " + suma);
        }
        else {
            System.out.println("Fonduri insuficiente");
        }
    }

    public void depunere (float suma) {
        this.sold+=suma;
        System.out.println("S-a depus suma de " + suma);
    }
}
