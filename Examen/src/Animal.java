import java.time.LocalDateTime;

public abstract class Animal {
    private TipRana tipRana;
    private LocalDateTime dataCazarii;

    public Animal(TipRana tipRana) {
        this.tipRana = tipRana;
    }

    public TipRana getTipRana() {
        return tipRana;
    }
    public void setDataCazarii(LocalDateTime dataCazarii) {
        this.dataCazarii = dataCazarii;
    }

    public LocalDateTime getDataCazarii() {
        return dataCazarii;
    }

    public abstract String getSpecie();
}
