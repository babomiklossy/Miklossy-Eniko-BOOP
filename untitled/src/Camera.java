import java.util.ArrayList;
import java.util.List;

public class Camera {
    private int id;
    private Class<? extends Animal> tipAnimal;
    private List<Animal> animale;

    public Camera(int id, Class<? extends Animal> tipAnimal) {
        this.id = id;
        this.tipAnimal = tipAnimal;
        this.animale = new ArrayList<>();
    }

    public void adaugaAnimal(Animal animal) throws AnimaleIncompatibile {
        if (!animal.getClass().equals(tipAnimal)) {
            throw new AnimaleIncompatibile("Animal incompatibil pentru camera " + id);
        }
        animale.add(animal);
    }

    public List<Animal> getAnimale() {
        return animale;
    }

    public int getId() {
        return id;
    }
}