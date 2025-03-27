package lab1_exercitii;

public class FiguriGeom {
	 public static void main(String[] args) {
	        Punct p1 = new Punct(3, 4);
	        Cerc c1 = new Cerc(5.0, p1);

	        System.out.println(p1);
	        System.out.println(c1);
	        System.out.println("Aria: " + c1.getArie());
	        System.out.println("Perimetrul: " + c1.getPerimetru());
	    }
}
