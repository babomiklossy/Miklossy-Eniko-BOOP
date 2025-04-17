package Vehicul;

public class Autoturism implements Vehicul {
    private String marca;
    private int viteza;
    private String culoare;
    private int capacitate;

    public Autoturism(String marca, String culoare, int capacitate) {
        this.marca = marca;
        this.viteza = 0;
        this.culoare = culoare;
        this.capacitate = capacitate;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getCapacitate() { return capacitate; }
    public void setCapacitate(int capacitate) { this.capacitate = capacitate; }

    public String getCuloare() {return culoare;}
    public void setCuloare(String culoare) {this.culoare = culoare; }
    
    public int getViteza() {return viteza;}
    public void setViteza(int viteza) {this.viteza = viteza;}

	@Override
	public void accelereaza(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deccelereaza(int y) {
		// TODO Auto-generated method stub
		
	}
}