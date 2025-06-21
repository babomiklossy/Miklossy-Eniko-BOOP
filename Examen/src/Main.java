public class Main {
    public static void main(String[] args) {
        try {
            Clinica clinica = new Clinica();

            Cangur cangur = new Cangur(TipRana.GRAVA, 2.5, true);
            Koala koala = new Koala(TipRana.MEDIE, 20, true);

            clinica.cazeaza(cangur, 1);
            clinica.evalueazaAnimal(koala);

            System.out.println("Camere libere:" + clinica.calculeazaNumarulDeCamereLibere());

            clinica.decazeaza(cangur);

            System.out.println("Camere libere dupdecazare: " +
                    clinica.calculeazaNumarulDeCamereLibere());

        } catch (Exception e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}