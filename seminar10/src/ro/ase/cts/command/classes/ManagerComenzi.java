package ro.ase.cts.command.classes;

import java.util.ArrayList;

public class ManagerComenzi {
    //lista e o coada
    private ArrayList<ComandaAbstracta> listaComenzi = new ArrayList<>();

    public void adaugaComanda(ComandaAbstracta comandaAbstracta){
        this.listaComenzi.add(comandaAbstracta);
    }

    public void executaComanda(){
        if(!listaComenzi.isEmpty()) {
            this.listaComenzi.get(0).executa();
            this.listaComenzi.remove(0);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
