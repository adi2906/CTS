package ro.ase.cts.template.classes;

public abstract class Template {

    public final void intraPeStdaion(){
        seAsazaLaCoada();
        prezintaBilet();
        seFaceControlCorporal();
        seOcupaLoc();
    }

    public abstract void seAsazaLaCoada();
    public abstract void prezintaBilet();
    public abstract void seFaceControlCorporal();
    public abstract void seOcupaLoc();


}
