package ro.ase.cts.decorator;

public class DecoratorContactlessCard extends DecoratorAbstract {

    public DecoratorContactlessCard(Card card) {
        super(card);
    }

    @Override
    public void platesteContactless() {
        System.out.println(((Card)super.getCard()).getTitular()+" a realizat o plata contactless");
    }
}
