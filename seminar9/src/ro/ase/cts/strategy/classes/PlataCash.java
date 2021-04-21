package ro.ase.cts.strategy.classes;

public class PlataCash implements Payable{

//    putem sa adaugam si atribute.. de exp wallet => suma de portofel
//    mai intai verifica daca are suma apoi plateste

    @Override
    public void pay(float suma) {
        System.out.println( "A fost realizata o plata cash in valoare de "+ suma + " lei");
    }
}
