package lab08_exceptii;

public class Zi {
    private String nume;
    private boolean lucratoare;

    public Zi(String nume, boolean lucratoare) {
        this.nume = nume;
        this.lucratoare = lucratoare;
    }

   public void setNume(String nume) {this.nume = nume;}
   public String getNume() {
	   return nume;
   }		
   public void setLucratoare()
   {
	  this.lucratoare = true;}
   public void setNelucratoare() {
	   this.lucratoare = false;
   }
   public boolean esteLucratoare() {
	   return lucratoare;
   }
   }
