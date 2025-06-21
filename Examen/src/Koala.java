public class Koala extends Animal {
    private int oreSomnPeZi;
    private boolean manancaEucalipt;

    public Koala(TipRana tipRana, int oreSomnPeZi, boolean manancaEucalipt) {
        super(tipRana);
        this.oreSomnPeZi = oreSomnPeZi;
        this.manancaEucalipt = manancaEucalipt;
    }

    @Override
    public String getSpecie() {
        return "Koala";
    }
}
