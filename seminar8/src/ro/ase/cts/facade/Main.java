package ro.ase.cts.facade;

public class Main {
    public static void main(String[] args) {

        Masa masa1 = new Masa(25, 10);
//        if( OperatorMese.esteLibera(masa1.getNrMasa())) {
//            Picolo picolo1 = new Picolo("Gica");
//            if(picolo1.esteDebarasataMasa(masa1.getNrMasa())){
//                if(picolo1.esteAranjata(masa1.getNrMasa())){
//                    System.out.println("Poftiti la masa");
//                }
//                else {
//                    System.out.println("Va rog mai asteptati");
//                }
//            }
//            else {
//                System.out.println("Va rog mai asteptati");
//            }
//        }
//        else {
//            System.out.println("Va rog mai asteptati");
//        }

//        cu facade
        Masa masa2 = new Masa(30, 5);
        if(Facade.esteMasaPregatita(masa2)) {
            System.out.println("FACADE: Poftiti la masa");
        }
        else{
            System.out.println("FACADE: Va rog mai asteptati");
        }
    }
}
