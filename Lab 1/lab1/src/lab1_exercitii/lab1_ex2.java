package lab1_exercitii;

public class lab1_ex2 {
	public static void main(String[] args){
	int num = 10;
	int sum = 0;
	
	for(int i=1; i <= num; i++) {
		
		sum = sum+i;
	}
	System.out.println("Suma elementelor de la 1 pana la " + num + " este " + sum);
}
}