package lab1_exercitii;

public class Cerc {

	    double raza;
	    Punct centru;

	    public Cerc(double raza, Punct centru) {
	        this.raza = raza;
	        this.centru = centru;
	    }

	    public double getArie() {
	        return Math.PI * raza * raza;
	    }

	    public double getPerimetru() {
	        return 2 * Math.PI * raza;
	    }

	    // Metodă toString
	    public String toString() {
	        return "Cerc cu raza " + raza + " și centru în " + centru;
	    }
	}
