package ro.ase.cts.memento.classes;

public class Meci {

    private String echipaGazda;
    private String echipaOaspete;
    private int nrBileteVandute;
    private int nrSpectatori;
    private int nrJandarmi;

    public Meci(String echipaGazda, String echipaOaspete, int nrBileteVandute, int nrSpectatori, int nrJandarmi) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
        this.nrBileteVandute = nrBileteVandute;
        this.nrSpectatori = nrSpectatori;
        this.nrJandarmi = nrJandarmi;
    }

    public void setEchipaGazda(String echipaGazda) {
        this.echipaGazda = echipaGazda;
    }

    public void setEchipaOaspete(String echipaOaspete) {
        this.echipaOaspete = echipaOaspete;
    }

    public void setNrBileteVandute(int nrBileteVandute) {
        this.nrBileteVandute = nrBileteVandute;
    }

    public void setNrSpectatori(int nrSpectatori) {
        this.nrSpectatori = nrSpectatori;
    }

    public void setNrJandarmi(int nrJandarmi) {
        this.nrJandarmi = nrJandarmi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Meci{");
        sb.append("echipaGazda='").append(echipaGazda).append('\'');
        sb.append(", echipaOaspete='").append(echipaOaspete).append('\'');
        sb.append(", nrBileteVandute=").append(nrBileteVandute);
        sb.append(", nrSpectatori=").append(nrSpectatori);
        sb.append(", nrJandarmi=").append(nrJandarmi);
        sb.append('}');
        return sb.toString();
    }

    public Memento creareMemento(){
        return new Memento(this.echipaGazda, this.echipaOaspete, this.nrSpectatori);
    }

    public void setMemento(Memento memento){
        this.echipaGazda = memento.getEchipaGazda();
        this.echipaOaspete = memento.getGetEchipaOaspete();
        this.nrSpectatori = memento.getNrSpectatori();
    }
}
