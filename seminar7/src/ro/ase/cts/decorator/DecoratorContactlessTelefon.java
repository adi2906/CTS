package ro.ase.cts.decorator;

public class DecoratorContactlessTelefon extends DecoratorAbstract{

    public DecoratorContactlessTelefon(Card card) {
        super(card);
    }

    @Override
    public void platesteContactless() {
        System.out.println(((Card)super.getCard()).getTitular()+" a realizat o plata contactless cu telefonul");
    }
}
