package ro.ase.cts.facade;

class Picolo {
//default => va fi disponibil doar in interiorul pachetului
    private String nume;

    public Picolo(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean esteDebarasataMasa(int nrMasa) {
        return nrMasa % 3 == 0;
    }

    public boolean esteAranjata(int nrMasa) {
        return nrMasa % 5 == 0;
    }
}
