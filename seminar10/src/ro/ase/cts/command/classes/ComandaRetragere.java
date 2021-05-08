package ro.ase.cts.command.classes;

public class ComandaRetragere extends ComandaAbstracta {

    public ComandaRetragere(Executant executant, float suma) {
        super(executant, suma);
    }

    @Override
    public void executa() {
        super.getExecutant().retragere(super.getSuma());
    }
}
