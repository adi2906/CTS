package ro.ase.cts.factory.clase;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        PersonalMedical medic1 = factory.create(TipPersonal.MEDIC, "Ion", 10000);
        PersonalMedical asistent1 = factory.create(TipPersonal.ASISTENT, "Popa", 1000);
        PersonalMedical brancardier1 = factory.create(TipPersonal.BRANCARDIER, "George", 100510);

        System.out.println(medic1);
        System.out.println(asistent1);
        System.out.println(brancardier1);


    }
}
