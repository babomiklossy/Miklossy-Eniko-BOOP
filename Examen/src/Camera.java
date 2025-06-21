import java.util.ArrayList;
import java.util.List;

public class Camera {
    private static final int CAPACITATE_MAXIMA = 5;
    private final int id;
    private List<Animal> animale;

    public Camera(int id) {
        this.id = id;
        this.animale = new ArrayList<>();
    }

    public void adaugaAnimal(Animal animal) throws AnimaleIncompatibile, ClinicaFull {
        if (!animale.isEmpty() && !animale.get(0).getSpecie().equals(animal.getSpecie())) {
            throw new AnimaleIncompatibile("Nu se pot caza animale diferite !");
        }
        if (animale.size() >= CAPACITATE_MAXIMA) {
            throw new ClinicaFull("Camera este !");
        }
        animale.add(animal);
    }

    public void scoateAnimal(Animal animal) {
        animale.remove(animal);
    }

    public int getId() {
        return id;
    }

    public List<Animal> getAnimale() {
        return animale;
    }
}