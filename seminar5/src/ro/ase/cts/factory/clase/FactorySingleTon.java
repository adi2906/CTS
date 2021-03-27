package ro.ase.cts.factory.clase;

public class FactorySingleTon {
    private static  FactorySingleTon factorySingleTon = null;

    public static synchronized FactorySingleTon getInstance(){
        if (FactorySingleTon.factorySingleTon == null){
            FactorySingleTon.factorySingleTon = new FactorySingleTon();
        }
        return FactorySingleTon.factorySingleTon;
    }

    public PersonalMedical create(TipPersonal tipPersonal, String nume, float salariu){
        switch (tipPersonal){
            case MEDIC: {
                Medic medic= new Medic(nume, salariu);
                return medic;
            }
            case ASISTENT: {
                Asistent asistent= new Asistent(nume, salariu);
                return asistent;
            }
            case BRANCARDIER: {
                Brancardier brancardier = new Brancardier(nume, salariu);
                return brancardier;
            }
            default: throw new IllegalArgumentException("tipul nu este corect");
        }
    }
}
