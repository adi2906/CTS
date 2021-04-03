package ro.ase.cts.builder;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare= new Rezervare(12, false, true, false,
                false, "rock");

        BuilderRezervare builderRezervare = new BuilderRezervare()
                .setAreMancareInclusa(true)
                .setCodRezervare(1)
                .setAreMuzicaAmbientalaPersonalizata(true)
                .setAreMuzicaAmbientalaPersonalizata(true).setGenMuzical("Rock");
        Rezervare rezervare1 = builderRezervare.build();

        Rezervare rezervare2 = new BuilderRezervare()
                .setCodRezervare(2)
                .setAreScaunErgonomic(true)
                .build();

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());

        //eficient:
        Rezervare rezervare3 = new BuilderRezervare()
                .setCodRezervare(3)
                .build();
        System.out.println(rezervare3.toString());

        Rezervare rezervare4 = builderRezervare.setCodRezervare(4).build();

        BuilderRezervareV2 builderRezervareV2= new BuilderRezervareV2()
                .setAreMancareInclusa(true)
                .setAreBauturiRacoritoare(true);

        Rezervare rezervare5 = builderRezervareV2.setCodRezervare(10).build();
        Rezervare rezervare6 = builderRezervareV2.setCodRezervare(10).build();

        System.out.println(rezervare5.toString());
        System.out.println(rezervare6.toString());

    }
}
