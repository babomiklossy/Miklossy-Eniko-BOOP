public class Cangur extends Animal {
    private double lungimeSaritura;
    private boolean arePungaMarsupiala;

    public Cangur(TipRana tipRana, double lungimeSaritura, boolean arePungaMarsupiala) {
        super(tipRana);
        this.lungimeSaritura = lungimeSaritura;
        this.arePungaMarsupiala = arePungaMarsupiala;
    }

    @Override
    public String getSpecie() {
        return "Cangur";
    }
}
