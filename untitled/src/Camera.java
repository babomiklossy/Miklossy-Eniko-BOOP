import java.util.ArrayList;
import java.util.List;

public class Camera {
    private int numar;
    private Class<? extends Animal> tipAnimal;
    private List<Animal> animale;

    public Camera(int numar, Class<? extends Animal> tipAnimal) {
        this.numar = numar;
        this.tipAnimal = tipAnimal;
        this.animale = new ArrayList<>();
    }

    public int getNumar() {
        return numar;
    }

    public Class<? extends Animal> getTipAnimal() {
        return tipAnimal;
    }

    public void adaugaAnimal(Animal animal) {
        if (animal.getClass().equals(tipAnimal)) {
            animale.add(animal);
        }
    }

    public void afiseazaAnimale() {
        if (animale.isEmpty()) {
            System.out.println("Camera este goală");
            return;
        }
        for (Animal animal : animale) {
            System.out.println(animal);
        }
    }
}