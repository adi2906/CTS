package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.classes.Client;
import ro.ase.cts.strategy.classes.PlataBonuriMasa;
import ro.ase.cts.strategy.classes.PlataCard;
import ro.ase.cts.strategy.classes.PlataCash;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("Gica", new PlataCash());
        client.platesteNota(200);
        client.setPlata(new PlataCard());
        client.platesteNota(100);
        client.setPlata(new PlataBonuriMasa());
        client.platesteNota(1000);
    }
}
