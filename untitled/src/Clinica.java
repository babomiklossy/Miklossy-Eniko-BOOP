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
        boolean animalAdaugat = false;
        
        for (Camera camera : camere) {
            if (camera.getTipAnimal().equals(animal.getClass())) {
                camera.adaugaAnimal(animal);
                animalAdaugat = true;
                break;
            }
        }
        
        if (!animalAdaugat) {
            throw new AnimaleIncompatibile("Nu există cameră pentru acest tip de animal: " + 
                animal.getClass().getSimpleName());
        }
    }

    public void afiseazaAnimale() {
        for (Camera camera : camere) {
            System.out.println("Camera " + camera.getNumar() + ":");
            camera.afiseazaAnimale();
            System.out.println(); // linie goală între camere
        }
    }
}