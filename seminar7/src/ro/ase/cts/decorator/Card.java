package ro.ase.cts.decorator;

public class Card implements CardBancar{

    private String titular;

    public Card(String titular) {
        this.titular = titular;
    }

    @Override
    public void platesteLaPOS() {
        System.out.println(this.titular + " a paltit prin itermediul POS-ului");
    }

    @Override
    public void platesteOnline() {
        System.out.println(this.titular + " a paltit online");
    }

    public String getTitular() {
        return titular;
    }
}
