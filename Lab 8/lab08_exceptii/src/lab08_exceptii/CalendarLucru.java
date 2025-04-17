package lab08_exceptii;

public class CalendarLucru {
    private Zi[] zile = new Zi[7];
    private static final String[] numeZile = {
        "Luni", "Marti", "Miercuri", "Joi", "Vineri", "Sambata", "Duminica"
    };

    public CalendarLucru() {
        for (int i = 0; i < 7; i++) {
            boolean esteLucratoare = i < 5; 
            zile[i] = new Zi(numeZile[i], esteLucratoare);
        }
    }

    public Zi getZi(String nume) {
        for (Zi z : zile) {
          if (z.getNume().equalsIgnoreCase(nume)) {
                return z;
            }
        }
        return null;
    }

    public void seteazaZiLucratoare(String nume) {
        Zi zi = getZi(nume);
        if (zi != null) zi.setLucratoare();
    }

    public void seteazaZiNelucratoare(String nume) {
        Zi zi = getZi(nume);
        if (zi != null) zi.setNelucratoare();
    }
}
