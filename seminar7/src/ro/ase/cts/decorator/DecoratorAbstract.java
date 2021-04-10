package ro.ase.cts.decorator;

public abstract class DecoratorAbstract implements CardBancar {
    private CardBancar card;

    public DecoratorAbstract(Card card){
        this.card = card;
    }
    public abstract void platesteContactless();

    @Override
    public void platesteLaPOS() {
        this.card.platesteLaPOS();
    }

    @Override
    public void platesteOnline() {
        this.card.platesteOnline();
    }

    public CardBancar getCard() {
        return card;
    }
}
