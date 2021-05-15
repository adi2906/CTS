package ro.ase.cts.memento.classes;

public class Memento {

    private String echipaGazda;
    private String getEchipaOaspete;
    private int nrSpectatori;

    public Memento(String echipaGazda, String getEchipaOaspete, int nrSpectatori) {
        this.echipaGazda = echipaGazda;
        this.getEchipaOaspete = getEchipaOaspete;
        this.nrSpectatori = nrSpectatori;
    }

    public String getEchipaGazda() {
        return echipaGazda;
    }

    public String getGetEchipaOaspete() {
        return getEchipaOaspete;
    }

    public int getNrSpectatori() {
        return nrSpectatori;
    }
}
