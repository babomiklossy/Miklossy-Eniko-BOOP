public class Main {
    public static void main(String[] args) {
        try {
            Clinica clinica = new Clinica();

            clinica.adaugaAnimal(new Cangur("Skippy", TipRana.GRAVA));
            clinica.adaugaAnimal(new Koala("Sleepy", TipRana.MEDIE));

            clinica.afiseazaAnimale();

        } catch (AnimaleIncompatibile e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}