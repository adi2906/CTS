package ro.ase.cts.adapter;


public class Main {

    public static void printeazaInformatiiCredit(Creditable credit){
        credit.crediteaza();
    }

    public static void main(String[] args) {
        Leasing leasing = new Leasing("Adi", 200);
//        printeazaInformatiiCredit(leasing); //aici intervine adapterul

        AdapterLeasing adapterLeasing = new AdapterLeasing(leasing);
        adapterLeasing.crediteaza();
        System.out.println("---------------");
        printeazaInformatiiCredit(adapterLeasing);


        //adapter clase
        System.out.println("---------------Adapter Clase---------------");
        AdapterClaseLeasing adapterClaseLeasing = new AdapterClaseLeasing("Gica", 10000);
        printeazaInformatiiCredit(adapterClaseLeasing);
    }
}
