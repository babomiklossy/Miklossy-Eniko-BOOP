public class Veverita extends Animal {
    private boolean areCoadaStufoasa;

    public Veverita(TipRana tipRana, boolean areCoadaStufoasa) {
        super(tipRana);
        this.areCoadaStufoasa = areCoadaStufoasa;
    }

    @Override
    public String getSpecie() {
        return "Veverita";
    }
}
