package lab1_exercitii;


public class Instantiere {
public static void main(String[] args) {
   Exemplu obj1 = new Exemplu();  // Obiect cu constructor implicit
   Exemplu obj2 = new Exemplu(10); // Obiect cu constructor cu argument

   System.out.println("Înainte de incrementare:");
   System.out.println(obj1);
   System.out.println(obj2);

   obj1.incrementeaza();
   obj2.incrementeaza();

   System.out.println("După incrementare:");
   System.out.println(obj1);
   System.out.println(obj2);
}
}
