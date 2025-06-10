public class Cangur extends Animal {
    private double inaltimeSaritura;

    public Cangur(String nume, TipRana tipRana) {
        super(nume, tipRana);
        this.inaltimeSaritura = 2.0;
    }

    public double getInaltimeSaritura() {
        return inaltimeSaritura;
    }
}