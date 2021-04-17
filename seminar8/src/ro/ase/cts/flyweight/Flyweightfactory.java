package ro.ase.cts.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Flyweightfactory {
    private Map<String, FlyweightAbstract> clienti;

    public Flyweightfactory() {
        this.clienti = new HashMap<>();
    }

    public FlyweightAbstract getClient(String nrTelefon){
        FlyweightAbstract client = clienti.get(nrTelefon);
        if (client == null ) {
            client = new Client("Gica", "07321321", "aa@aa.com");
            clienti.put(nrTelefon, client);

        }
        return client;
    }

}
