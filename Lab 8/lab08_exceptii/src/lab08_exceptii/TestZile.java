package lab08_exceptii;

public class TestZile {
    public static void main(String[] args) {
        CalendarLucru calendar = new CalendarLucru();
        Lucrator l = new Lucrator("Ion", calendar);
        String[] zileDeTest = {"Luni", "Marți", "duminica"};

        for (String zi : zileDeTest) {
            try {
                l.lucreaza(zi);
            } catch (ExceptieZileNelucratoare e) {
                System.out.println("Nu se lucrează în ziua de " + zi + ": " + e.getMessage());
            }
        }
    }
}
