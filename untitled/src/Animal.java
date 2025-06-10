public class Animal {
    private String nume;
    private TipRana tipRana;

    public Animal(String nume, TipRana tipRana) {
        this.nume = nume;
        this.tipRana = tipRana;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public TipRana getTipRana() {
        return tipRana;
    }

    public void setTipRana(TipRana tipRana) {
        this.tipRana = tipRana;
    }
}