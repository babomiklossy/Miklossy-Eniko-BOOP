package lab08_exceptii;

public class Lucrator {
	private String nume;
	private CalendarLucru calendar;
	
	public Lucrator(String nume, CalendarLucru calendar) {
		
	}
public void lucreaza(String zi) throws ExceptieZileNelucratoare
{
	Zi z = calendar.getZi(zi);
	if(z==null) {
		System.out.println(zi+"nu este zi lucratoare");
		return;
	}
	if (z.esteLucratoare()) {
		System.out.println("lucratorul"+nume+"lucreaza"+z.getNume());
	}
}
}

