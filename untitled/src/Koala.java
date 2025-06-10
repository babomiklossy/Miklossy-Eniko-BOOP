public class Koala extends Animal {
    private Integer oreSomnPeZi;
    private boolean mananancaEucalipt;

    public Koala(String nume, TipRana tipRana) {
        super(nume, tipRana);
        this.oreSomnPeZi = 20;
        this.mananancaEucalipt = true;
    }

    public Integer getOreSomnPeZi() {
        return oreSomnPeZi;
    }

    public boolean isMananancaEucalipt() {
        return mananancaEucalipt;
    }
}