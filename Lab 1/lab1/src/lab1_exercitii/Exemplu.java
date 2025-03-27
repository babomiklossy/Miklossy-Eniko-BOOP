package lab1_exercitii;

//Clasa Exemplu
class Exemplu {
 int x;

 // Constructor implicit (fără argumente)
 public Exemplu() {
     this.x = 0;
 }

 // Constructor cu argument
 public Exemplu(int x) {
     this.x = x;
 }

 // Metodă care incrementează x
 public void incrementeaza() {
     this.x++;
 }

 // Metodă toString()
 public String toString() {
     return "Valoarea lui x: " + x;
 }
}

