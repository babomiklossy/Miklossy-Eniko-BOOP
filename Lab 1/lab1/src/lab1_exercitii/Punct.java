package lab1_exercitii;

public class Punct {
    int x, y;

    // Constructor unic cu valori implicite
    public Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Metodă toString
    public String toString() {
        return "Punct(" + x + ", " + y + ")";
    }
}
