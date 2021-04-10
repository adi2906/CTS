package ro.ase.cts.decorator;

public class Main {
    public static void main(String[] args) {
        Card card = new Card("Adi");
        card.platesteLaPOS();
        card.platesteOnline();
        System.out.println("----------------");
        DecoratorContactlessCard decoratorContactless = new DecoratorContactlessCard(card);
        decoratorContactless.platesteContactless();
        decoratorContactless.platesteOnline();
        System.out.println("----------------");
        DecoratorContactlessTelefon decoratorContactlessTelefon = new DecoratorContactlessTelefon(card);
        decoratorContactlessTelefon.platesteLaPOS();
        decoratorContactlessTelefon.platesteOnline();
        decoratorContactlessTelefon.platesteContactless();

    }
}
