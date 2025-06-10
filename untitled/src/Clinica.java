import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private List<Camera> camere = new ArrayList<>();

    public Clinica() {
        camere.add(new Camera(1, Cangur.class));
        camere.add(new Camera(2, Koala.class));
    }

    public List<Camera> getCamere() {
        return camere;
    }

    public void setCamere(List<Camera> camere) {
        this.camere = camere;
    }

    public void adaugaAnimal(Animal animal) throws AnimaleIncompatibile {

            }

    public void afiseazaAnimale() {
    }
}

