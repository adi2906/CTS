package ro.ase.cts.state2.classes;

public class Masa {
    private int nrMasa;
    private Stare stare;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.stare = new StareLibera();
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public Stare getStare() {
        return stare;
    }

    void setStare(Stare stare) {
        this.stare = stare;
    }

    public void ocupaMasa() {
        Stare stareOcupata = new StareOcupata();
        stareOcupata.modificaStare(this);
    }
    public void elibereazaMasa() {
        StareLibera stareLibera = new StareLibera();
        stareLibera.modificaStare(this);
    }
    public void rezervaMasa() {
        StareRezervata stareRezervata = new StareRezervata();
        stareRezervata.modificaStare(this);
    }
}
