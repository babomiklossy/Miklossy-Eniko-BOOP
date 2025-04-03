package lab4_ex1;

public class Autovehicul {
    private String marca;
    private String culoare;
    private int vitezaCurenta;
    private int treaptaViteza;
    private int vitezaMaxima;
    
    public Autovehicul(String marca, String culoare, int vitezaMaxima) {
        this.marca = marca;
        this.culoare = culoare;
        this.vitezaMaxima = vitezaMaxima;
        this.vitezaCurenta = 0;
        this.treaptaViteza = 0;
    }
    
    public Autovehicul() {
        this("Necunoscut", "negru", 180);
    }
    
    public String getMarca() { return marca; }
    public String getCuloare() { return culoare; }
    public int getVitezaCurenta() { return vitezaCurenta; }
    public int getTreaptaViteza() { return treaptaViteza; }
    public int getVitezaMaxima() { return vitezaMaxima; }
    
    public void setMarca(String marca) { this.marca = marca; }
    public void setCuloare(String culoare) { this.culoare = culoare; }
    
    public void accelerare(int kmh) {
        vitezaCurenta = Math.min(vitezaCurenta + kmh, vitezaMaxima);
        System.out.println("Am accelerat la " + vitezaCurenta + " km/h");
    }
    
    public void decelerare(int kmh) {
        vitezaCurenta = Math.max(vitezaCurenta - kmh, 0);
        System.out.println("Am decelerat la " + vitezaCurenta + " km/h");
    }
    
    public void schimbaTreapta(int treaptaNoua) {
        this.treaptaViteza = treaptaNoua;
        System.out.println("Am schimbat în treapta " + treaptaViteza);
    }
    
    public void oprire() {
        vitezaCurenta = 0;
        treaptaViteza = 0;
        System.out.println("Am oprit autovehiculul");
    }
    
    public static void main(String[] args) {
        Autovehicul auto = new Autovehicul("Dacia", "albastru", 160);
        
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Culoare: " + auto.getCuloare());
        System.out.println("Viteza maximă: " + auto.getVitezaMaxima() + " km/h");
        
        auto.accelerare(50);
        auto.schimbaTreapta(2);
        auto.accelerare(30);
        auto.decelerare(20);
        auto.oprire();
        
        Autovehicul auto2 = new Autovehicul();
        System.out.println("\nAutovehicul implicit:");
        System.out.println("Marca: " + auto2.getMarca());
        System.out.println("Viteza curentă: " + auto2.getVitezaCurenta());
    }
}