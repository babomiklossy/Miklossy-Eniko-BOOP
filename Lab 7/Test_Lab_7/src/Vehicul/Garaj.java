package Vehicul;

import java.util.ArrayList;
import java.util.List;

public class Garaj {
    private List<Vehicul> vehicule;

    public Garaj() {
        vehicule = new ArrayList<>();
    }

    public List<Vehicul> getVehicule() { return vehicule; }

    public void adaugaVehicul(Vehicul vehicul) {
        vehicule.add(vehicul);
    }

    public void afiseazaVehicule() {
        for (Vehicul v : vehicule) {
            System.out.println(v.toString());
        }
    }

    public void afiseazaMotocicleteTip(String tip) {
        for (Vehicul v : vehicule) {
            if (v instanceof Motocicleta) {
                Motocicleta m = (Motocicleta) v;
                if (m.getTipMotocicleta(tip).equalsIgnoreCase(tip)) {
                    System.out.println(m.toString());
                }
            }
        }
    }

    public void afiseazaMasiniCu2Usi() {
        for (Vehicul v : vehicule) {
            if (v instanceof Masina) {
                Masina m = (Masina) v;
                if (m.getNumarUsi() == 2) {
                    System.out.println(m.toString());
                }
            }
        }
    }
}
