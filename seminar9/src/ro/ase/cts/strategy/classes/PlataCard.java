package ro.ase.cts.strategy.classes;

public class PlataCard implements Payable{
    @Override
    public void pay(float suma) {
        System.out.println( "A fost realizata o plata cu cardul in valoare de "+ suma + " lei");
    }
}
