public class Main {
    public static void main(String[] args) {
        Clinica clinica = new Clinica();

        try {
            clinica.adaugaAnimal(new Cangur("Joey", TipRana.GRAVA));
            clinica.adaugaAnimal(new Koala("Sydney", TipRana.MEDIE));
            clinica.adaugaAnimal(new Cangur("Skippy", TipRana.USOARA));
            clinica.adaugaAnimal(new Koala("Melbourne", TipRana.GRAVA));

            System.out.println("Situația animalelor în clinică:");
            clinica.afiseazaAnimale();

        } catch (AnimaleIncompatibile e) {
            System.err.println("Eroare: " + e.getMessage());
        }
    }
}