package ro.ase.cts.clase;

//  rucSAc - Soare Adrian
public class Rucsac {
    private String brand;
    private float pret;
    private float greutate;


    private static Rucsac rucsac = null;

    public static synchronized Rucsac getInstance(String brand, float pret, float greutate){
        if(rucsac == null) {
            rucsac = new Rucsac(brand, pret, greutate);
        }
        return rucsac;
    }

    private Rucsac() {
        this.brand = "";
        this.pret= 0;
        this.greutate = 0;
    }

    private Rucsac(String brand, float pret, float greutate) {
        this.brand = brand;
        this.pret = pret;
        this.greutate = greutate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public float getGreutate() {
        return greutate;
    }

    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rucsac{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", greutate=").append(greutate);
        sb.append('}');
        return sb.toString();
    }
}
