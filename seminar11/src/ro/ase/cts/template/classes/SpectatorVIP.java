package ro.ase.cts.template.classes;

public class SpectatorVIP extends Template {

    private String nume;
    private int loc;

    public SpectatorVIP(String nume, int loc) {
        this.nume = nume;
        this.loc = loc;
    }

    @Override
    public void seAsazaLaCoada() {
    }

    @Override
    public void prezintaBilet() {
        System.out.println(this.nume + " prezinta biletul VIP");
    }

    @Override
    public void seFaceControlCorporal() {
        System.out.println("Lui " + this.nume + " i se face control corporal");
    }

    @Override
    public void seOcupaLoc() {
        System.out.println(this.nume + " ocupa loc in loja "+ this.loc);
    }
}
