package lab2_ex2;

public class ex2 {
	public static void main(String[] args) {
        int r = 12345; 
        
        for (int i = 0; i < 10; i++) { 
            r = ((r * 25173) + 13849) % 65536;
            System.out.println("Număr generat: " + r); 
        }
    }
}
