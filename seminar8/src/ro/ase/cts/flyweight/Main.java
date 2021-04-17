package ro.ase.cts.flyweight;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(1, 1);
        Rezervare rezervare2 = new Rezervare(2, 1);
        Rezervare rezervare3 = new Rezervare(3, 1);

        Flyweightfactory flyweightfactory = new Flyweightfactory();

        flyweightfactory.getClient("02414122").printeazaRezervare(rezervare1);
        flyweightfactory.getClient("074321321").printeazaRezervare(rezervare2);
        flyweightfactory.getClient("02414122").printeazaRezervare(rezervare3);


    }
}
