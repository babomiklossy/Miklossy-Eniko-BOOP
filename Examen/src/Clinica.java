import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private List<Camera> camere;

    public Clinica() {
        this.camere = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            camere.add(new Camera(i));
        }
    }

    public void cazeaza(Animal animal, int numarCamera) throws AnimaleIncompatibile, ClinicaFull {
        Camera camera = camere.get(numarCamera - 1);
        camera.adaugaAnimal(animal);
        animal.setDataCazarii(LocalDateTime.now());
    }

    public void evalueazaAnimal(Animal animal) throws AnimaleIncompatibile, ClinicaFull {
        if (animal.getTipRana() == TipRana.USOARA) {
            return;
        }

        for (Camera camera : camere) {
            try {
                cazeaza(animal, camera.getId());
                return;
            } catch (AnimaleIncompatibile | ClinicaFull e) {
            }
        }
        throw new ClinicaFull("Nu exista camere momentan !");
    }

    public void decazeaza(Animal animal) {
        for (Camera camera : camere) {
            camera.scoateAnimal(animal);
        }
    }

    public int calculeazaNumarulDeCamereLibere() {
        int camereLibere = 0;
        for (Camera camera : camere) {
            if (camera.getAnimale().isEmpty()) {
                camereLibere++;
            }
        }
        return camereLibere;
    }
}