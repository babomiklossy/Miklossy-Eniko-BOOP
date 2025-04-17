package Vehicul;

public class Masina extends Autoturism {
    public Masina(String marca, String culoare, int capacitate) {
		super(marca, culoare, capacitate);
		// TODO Auto-generated constructor stub
	}
    private int numarUsi;
    private String tipCombustibil;

 
    
    public int getNumarUsi() { 
    	return numarUsi; }
    public void setNumarUsi(int numarUsi) { this.numarUsi = numarUsi; }
    public String getTipCombustibil(String tipCombustibil) {
    	return tipCombustibil;
    }
    public void setTipCombustibil(String tipCombustibil) {this.tipCombustibil = tipCombustibil;}
	public void porneste() {
		// TODO Auto-generated method stub
		
	}

}