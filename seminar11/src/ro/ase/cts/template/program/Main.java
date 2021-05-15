package ro.ase.cts.template.program;

import ro.ase.cts.template.classes.SpectatorNormal;
import ro.ase.cts.template.classes.SpectatorVIP;

//Template => Spectator
public class Main {
    public static void main(String[] args) {
        SpectatorNormal spectatorNormal = new SpectatorNormal("George");
        SpectatorVIP spectatorVIP = new SpectatorVIP("Adi", 3);

        spectatorNormal.intraPeStdaion();
        System.out.println("===============");
        spectatorVIP.intraPeStdaion();
    }
}
